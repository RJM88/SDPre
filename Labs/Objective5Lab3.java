import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {

    // Setting variables.
    int userNum;
    Scanner kb = new Scanner(System.in);

    // Asking for user input.
    System.out.println("Please enter a number: ");
    userNum = kb.nextInt();

    // Setting logic conditions.
    if(userNum > 0) {
      System.out.println("The number is positive.");
    }
    else if(userNum == 0) {
      System.out.println("The number is equal to 0.");
    }
    else if(userNum < 0) {
      System.out.println("The number is negitive.");
    }
  }
}
