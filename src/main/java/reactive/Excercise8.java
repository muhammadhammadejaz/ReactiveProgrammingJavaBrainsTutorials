package reactive;

import java.io.IOException;
import reactor.core.publisher.Flux;

public class Excercise8 {

  public static void main(String[] args) throws IOException {

  // Print values from intNumbersFluxWithException and print a message when error happen

    ReactiveSources.intNumbersFluxWithException()
        .subscribe(num -> System.out.println(num),
            err -> System.out.println("Error Happened"));

    // alternate way

    ReactiveSources.intNumbersFluxWithException()
        .doOnError(e -> System.out.println("Error!!! " + e.getMessage()))
            .subscribe(num -> System.out.println(num));

    // Print values from intNumbersFluxWithException and continue on errors

    ReactiveSources.intNumbersFluxWithException()
            .onErrorContinue((e,item) -> System.out.println("Error!!! " + e.getMessage()))
                .subscribe(num -> System.out.println(num));

    ReactiveSources.intNumbersFluxWithException()
            .onErrorContinue((e,item) -> System.out.println("Error!!! " + item))
                .subscribe(num -> System.out.println(num));

    // Print values from intNumbersFluxWithException and when error happen, replace with a fallback sequence of -1 and -2

    ReactiveSources.intNumbersFluxWithException()
            .onErrorResume(err -> Flux.just(-1,-2))
                .subscribe(num -> System.out.println(num));

    System.out.println("Press a key to end");
    System.in.read();
  }

}
