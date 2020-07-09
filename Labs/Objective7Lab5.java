import java.util.Scanner;

public class Objective7Lab5 {
  public static void main(String[] args) {

    //Setting variables.
    Scanner scanner = new Scanner(System.in);
    int selection;

    //Creating a while loop with logic statments
    //While loop is an endless loop taking user input.
    while (true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List my favorit foods");
      System.out.println("3: Exit");
      System.out.println();

      System.out.println("Please make a selection: ");
      selection = scanner.nextInt();

      //Logic statments prints option choosen by user.
      //Option 3 will break loop.
      if(selection == 1) {
        System.out.println();
        System.out.println("Hello Human");
        System.out.println();
      }
      else if(selection == 2) {
        System.out.println();
        System.out.println("Apples, Bananas, Coconuts");
        System.out.println();
      }
      else if(selection == 3) {
        System.out.println();
        System.out.println("Goodbye");
        System.out.println();
        break;
      }
    }
  }
}
