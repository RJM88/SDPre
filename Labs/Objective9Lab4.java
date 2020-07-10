import java.util.Scanner;

public class Objective9Lab4 {
  public static void main(String[] args) {

    //Setting variables.
    Scanner kb = new Scanner (System.in);
    double num1, num2;

    //Asking for two userinputs. Both will be numbers.
    System.out.println("Please give me a number: ");
    num1 = kb.nextDouble();
    System.out.println("Please give me another number: ");
    num2 = kb.nextDouble();

    //Creating a variable that calls on the findAverage Method.
    double average = findAverage(num1, num2);
    System.out.println("The average of " + num1 + " + " + num2 +" is " + average);

    kb.close();
  }
    //Creating a method that will find the average of the two userinputs.
    public static double findAverage(double num1, double num2) {
      double answer = ((num1 + num2) / 2);
      return answer;
  }
}
