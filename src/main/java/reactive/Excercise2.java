package reactive;

import java.io.IOException;

public class Excercise2 {

  public static void main(String[] args) throws IOException {

    // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

    // Print all numbers in the ReactiveSources.intNumbersFlux Stream

    ReactiveSources.intNumbersFlux().subscribe(e -> System.out.println(e));

    // With Failure and Completion Events

    ReactiveSources.intNumbersFlux().subscribe(
        number -> System.out.println(number),
        err -> System.out.println(err.getMessage()),
        () -> System.out.println("Completed")
    );

    // Print all users in the ReactiveSources.userFlux Stream

    ReactiveSources.userFlux().subscribe(user -> System.out.println(user));

    // With Failure and Completion Events

    ReactiveSources.userFlux().subscribe(
        user -> System.out.println(user),
        err -> System.out.println(err.getMessage()),
        () -> System.out.println("Completed")
    );

    System.out.println("Press a key to end");
    System.in.read();
  }

}
