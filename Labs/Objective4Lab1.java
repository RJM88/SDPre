import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

// Asking for user input: first name, last name, favorite animal, food, and song.
    System.out.println("What is your first name?");
    String fname = keyboard.nextLine();
    System.out.println("What is your last name?");
    String lname = keyboard.nextLine();
    System.out.println("What is your favorite animal?");
    String favoriteAnimal = keyboard.nextLine();
    System.out.println("What is your favorite food?");
    String favoriteFood = keyboard.nextLine();
    System.out.println("What is your favorit song?");
    String favoriteSong = keyboard.nextLine();

// printing out the user input.
    System.out.println("My name is " + fname + " " + lname + ".");
    System.out.println("My favorite animal is the " + favoriteAnimal + ".");
    System.out.println("My favorite food is " + favoriteFood + ".");
    System.out.println("My favorite song is " + favoriteSong + ".");
  }
}
