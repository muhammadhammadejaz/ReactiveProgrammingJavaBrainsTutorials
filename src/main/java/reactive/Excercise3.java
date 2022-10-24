package reactive;

import java.util.List;

public class Excercise3 {

  public static void main(String[] args) {

    // Use ReactiveSources.intNumbersFlux()

    // Get All numbers in the ReactiveSources.intNumbersFlux stream into a list and print the list and its size

    List<Integer> numbers = ReactiveSources.intNumbersFlux().toStream().toList();
    System.out.println("List is : " + numbers);
    System.out.println("Size is : " + numbers.size());

    // Get All users in the ReactiveSources.userFlux stream into a list and print the list and its size

    List<User> users = ReactiveSources.userFlux().toStream().toList();
    System.out.println("List is : " + users);
    System.out.println("Size is : " + users.size());

  }

}
