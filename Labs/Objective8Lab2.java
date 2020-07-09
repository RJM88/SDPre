public class Objective8Lab2 {
  public static void main(String[] args) {
    //Setting variables.
    int sum = 0;

    //For loop creates the "num" variable.
    //Continues until it greater then or equal to 20.
    //Adds one, adds to the sum (sum of all the numbers), then runs again.
    for (int num = 0; num <= 20; num ++){
      sum = num + sum;
    }
    //Prints out the total sum from the for loop "210".
    System.out.println(sum);
  }
}
