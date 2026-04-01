
//import mow.Yard;
import java.util.Scanner;

public class DemoYard {

  public static void main(String[] args) {
    // initialize variables
    Yard yard;
    Scanner in = new Scanner(System.in);

    // get input
    System.out.println("Please input a height for the yard: ");
    int height = in.nextInt();
    in.nextLine();
    System.out.println("Please input a width for the yard: ");
    int width = in.nextInt();
    in.close();

    // make yard
    yard = new Yard(height, width);
    yard.printLawn();
  }
}
