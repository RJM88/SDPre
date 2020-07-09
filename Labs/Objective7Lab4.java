public class Objective7Lab4 {
  public static void main(String[] args){

    //Setting variables.
    int count = 0;
    int sum = 0;

    //Creating a while loop to add 1-20.
    while(count < 20) {
      count = count + 1;
      sum = count + sum;
    }

    //Will print out sum of while loop: 210.
    System.out.println(sum);
  }
}
