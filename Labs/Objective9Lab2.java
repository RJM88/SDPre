public class Objective9Lab2 {
  public static void main(String[] args) {

  //Will print "In main", call "printMessage" method, finally print "In main".
    System.out.println("In main");
    printMessage();
    System.out.println("In main");
  }
  //Method will print "In method".
  public static void printMessage() {
    System.out.println("In method");
  }
}
