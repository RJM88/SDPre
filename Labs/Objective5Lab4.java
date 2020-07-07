import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    //Creating variables and new Scanner.
    int num;
    Scanner kb = new Scanner(System.in);

    //Reciving user input: What number they enter.
    System.out.println("Please enter a number: ");
    num = kb.nextInt();

    //Setting logic conditions. Looking if user input is odd or even.
    if(num % 2 == 0) {
      System.out.println("The number is even.");
    }
    else if(num % 2 != 0) {
      System.out.println("The number is odd.");
    }
  }
}
