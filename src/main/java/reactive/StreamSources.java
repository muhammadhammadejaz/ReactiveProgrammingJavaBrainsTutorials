package reactive;

import java.util.stream.Stream;

public class StreamSources {

  public static Stream<String> stringNumbersStream() {
    return Stream.of("one","two","three","four","five","six","seven","eight","nine","ten");
  }

  public static Stream<Integer> intNumbersStream() {
    return Stream.iterate(0,i -> i + 2).limit(10);
  }

  public static Stream<User> userStream() {
    return Stream.of(
        new User(1, "Muhammad Hammad", "Ejaz"),
        new User(2, "Muhammad Ammar", "Ejaz"),
        new User(3, "Muhammad Maaz", "Ejaz"),
        new User(4, "Muhammad Anas", "Ejaz"),
        new User(5, "Muhammad Daniyal", "Mehmood"),
        new User(6, "Usama", "Shahid"),
        new User(7, "Hamza", "Asif")
    );
  }

}
