package reactive;

import java.io.IOException;
import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

public class Excercise5 {

  public static void main(String[] args) throws IOException {

    // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userMono()

    // Subscribe to a flux using the error and completion hooks

    // 4th way but not recommended as it is deprecated
   /* ReactiveSources.intNumbersFlux().subscribe(number -> System.out.println(number),
        err -> System.out.println(err.getMessage()),
        () -> System.out.println("completed"),
        subscriber -> {

        });*/

    ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());

    System.out.println("Press a key to end");
    System.in.read();
  }

}

class MySubscriber<T> extends BaseSubscriber<T> {

  @Override
  public void hookOnSubscribe(Subscription subscription) {
    System.out.println("Subscribe happened");
    request(3);
  }

  @Override
  public void hookOnNext(T value) {
    System.out.println(value.toString() + " received");
//    request(1);
  }
}
