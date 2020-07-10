import java.util.Scanner;

public class Objective9Lab5 {
  public static void main(String[] args) {

    //Setting variables.
    Scanner kb = new Scanner (System.in);
    double num1, num2;
    boolean keepGoing = true;
    int choice;
    double answer = 0.0;

    //Asking for two user inputs. Both will be numbers.
    System.out.println("Please give me a number: ");
    num1 = kb.nextDouble();

    System.out.println("Please give me another number: ");
    num2 = kb.nextDouble();

    //Creating a while loop that will call on printMenu method.
    //While loop is an endless loop taking user input.
    while(keepGoing) {
      printMenu();
      System.out.println("which would you like to do?");
      choice = kb.nextInt();

      /* Creating switches that will call a method depending on the user input.
      *  case 1 = sum, case 2 = average, case 3 = taxes,
      *  case 4: prints to the screen ( this is the exit of the loop),
      *  defult = invalid entry.
      */

      switch (choice) {
        case 1:
          findSum(num1, num2);
          double sum = findSum(num1, num2);
          System.out.println(num1 + " + " + num2 + " = " + sum);
          break;
        case 2:
          findAverage(num1, num2);
          double average = findAverage(num1, num2);
          System.out.println("The average of " + num1 + " + " + num2 +" is " + average);
          break;
        case 3:
          calcTax(num1, num2);
          double tax = calcTax(num1, num2);
          System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is: " + tax);
          break;
        case 4:
          System.out.println("You've chosen to quit.");
          break;
        default:
          System.out.println("Invalid entry.  Please try again");
          break;

      }
      // Logic statment to alow user to exit loop.
      if(choice == 4){
        break;
      }
    }
  }
  // Method that will print out the menu for user to select options from.
  public static void printMenu() {
    System.out.println();
    System.out.println("========= MENU =========");
    System.out.println("|                      |");
    System.out.println("|    1. Add numbers    |");
    System.out.println("|    2. Find Average   |");
    System.out.println("|    3. Calculate Tax  |");
    System.out.println("|    4. Exit           |");
    System.out.println("|                      |");
    System.out.println("========================");
    System.out.println();
  }
  // Method that will find the sum of the two userinputs.
  public static double findSum(double num1, double num2) {
    double sum = num1 + num2;
    return sum;
  }
  // Method that will find the average of the two userinputs.
  public static double findAverage(double num1, double num2) {
    double average = ((num1 + num2) / 2);
    return average;

  }
  // Method that will find the total tax of the two userinputs.
  public static double calcTax(double num1, double num2) {
    double tax = ((num1 + num2) * .0831);
    return tax;
  }
}
