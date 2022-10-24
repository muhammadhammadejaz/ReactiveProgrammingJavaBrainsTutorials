package reactive;

import java.io.IOException;
import java.util.Optional;

public class Excercise4 {

  public static void main(String[] args) throws IOException {

    // Use ReactiveSources.intNumberMono()

    // Print the value from intNumberMono when it emits

    ReactiveSources.intNumberMono().subscribe(number -> System.out.println(number));

    // Get the value from the Mono into an Integer variable

    Integer number = ReactiveSources.intNumberMono().block(); // It may return null value

    Optional<Integer> optionalInteger = ReactiveSources.intNumberMono().blockOptional();

    // Get the value from the userMono into an User variable

    User user = ReactiveSources.userMono().block();

    Optional<User> optionalUser = ReactiveSources.userMono().blockOptional();

    System.out.println(number);
    System.out.println(optionalInteger.get());
    System.out.println(user);
    System.out.println(optionalUser.get());
  }

}
