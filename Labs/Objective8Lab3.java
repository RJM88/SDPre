public class Objective8Lab3 {
  public static void main(String[] args) {

    //For loop creates the "counter" variable.
    //Continues until it greater then or equal to 20.
    //Adds one to the counter, then runs again.
    for(int counter = 1; counter <= 20; counter ++ ) {
      //Setting logic condition to determine if the counter is even.
      if(counter % 2 == 0) {
        System.out.println(counter + " is even");
      }
      //Setting logic condition to determine if the counter is odd.
      else if(counter % 2 != 0) {
        System.out.println(counter + " is odd");
      }
    }
  }
}
