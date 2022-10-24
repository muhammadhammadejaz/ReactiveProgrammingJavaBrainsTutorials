package reactive;

public class Excercise1 {

  public static void main(String[] args) {

    // 1. Print All Numbers in the intNumbersStream stream

    StreamSources.intNumbersStream().forEach(x -> {
      System.out.println(x);
    });

    //2. Print Numbers in the intNumbersStream that are less than 5

    StreamSources.intNumbersStream().filter(x -> x < 5)
        .forEach(x -> {
          System.out.println(x);
        });

    // 3. Print the second and third numbers in intNumberStreams that's greater than 5

    StreamSources.intNumbersStream().filter(x -> x > 5)
        .skip(1)
        .limit(2)
        .forEach(x -> System.out.println(x));

    // 4. Print the first Number in intNumbersStream that's greater than 5. If nothing is found print -1

    Integer value = StreamSources.intNumbersStream().filter(x -> x > 5)
        .findFirst()
        .orElse(-1);
    System.out.println(value);

    // 5. Print first names of all users in users stream

    StreamSources.userStream().map(user -> user.getFirstName())
        .forEach(userName -> System.out.println(userName));

    // 6. Print first names in userStream for users that have IDs from number stream

    StreamSources.userStream()
        .filter(u -> StreamSources.intNumbersStream().anyMatch(i -> i == u.getId()))
        .forEach(System.out::println);

    // alternate way

    StreamSources.intNumbersStream()
        .flatMap(id -> StreamSources.userStream().filter(user -> user.getId() == id))
        .forEach(value1 -> System.out.println(value1));
  }


}
