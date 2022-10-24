package reactive;

import java.io.IOException;
import java.time.Duration;

public class Excercise6 {

  public static void main(String[] args) throws IOException {

    // Use ReactiveSources.unResponsiveFlux() and ReactiveSources.unResponsiveMono()

    // Get the value from the Mono into a String variable but give up after 5 seconds

    String foo = ReactiveSources.unresponsiveMono().block(Duration.ofSeconds(5));

    // Get the value from unResponsiveFlux into a String list but give up after 5 seconds

    ReactiveSources.unresponsiveFlux().collectList().block(Duration.ofSeconds(5));

    System.out.println("Press a key to end");
    System.in.read();
  }

}
