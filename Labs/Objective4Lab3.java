import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {

    // Setting variables.
    int birthYear, age, currentYear;

    // Initializing variables.
    birthYear = 0;
    currentYear = 2020;

    // Asking for users age.
    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();

    // Calculating users age
    birthYear = currentYear - age;

    // Printing out users age.
    System.out.println("You were born in " + birthYear + ".");
  }
}
