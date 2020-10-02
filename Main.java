import java.util.Scanner;

/**
 * While loop example
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
    // declare the variable
    int upTo;
    do{
      System.out.println("What number to count to(positive integer)?");
      upTo = input.nextInt();
    }while(upTo <= 0);



    // create a variable to keep track of the number
    int count = 6;
    // using a loop to count up to five
    while(count <= upTo){
      // print the number we're at 
      System.out.println(count);
      // increase the value of count by 1
      count = count + 1;
    } 
    System.out.println("All done");
  

  // do while loop 
  int count2 = 6;
  // do while loop to count
  do{
    //print the number
    System.out.println(count2);
    // increment the counter
    count2 = count2 + 1;
  }while (count2 <= upTo);
  System.out.println("All done again");
}
}