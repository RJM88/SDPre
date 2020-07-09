public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    int evenOrOdd = (counter % 2);

    while(counter <= 20) {
      if(evenOrOdd == 0){
        System.out.println(counter + " is even." );
    }
      else if(counter != 0){
        System.out.println(counter + " is odd.");
      }
      
      counter = counter + 1;
      evenOrOdd = (counter % 2);
    }
  }
}
