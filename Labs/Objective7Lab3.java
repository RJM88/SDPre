public class Objective7Lab3 {
  public static void main(String[] args) {

    //Setting variables.
    int counter = 1;
    int evenOrOdd = (counter % 2);

    //Creating a while loop with logic statment.
    //While loop will run 1-20.
    //logic statment will tell you what number is odd or even.
    while(counter <= 20) {
      if(evenOrOdd == 0){
        System.out.println(counter + " is even." );
      }
      else if(counter != 0) {
        System.out.println(counter + " is odd.");
      }
      counter = counter + 1;
      evenOrOdd = (counter % 2);
    }
  }
}
