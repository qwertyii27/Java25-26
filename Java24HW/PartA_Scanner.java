import java.util.Scanner;

public class PartA_Scanner {
  public static void main(String[] args) {
    Scanner in;
    in = new Scanner(System.in);

    System.out.println("Please enter your name:");
    System.out.println("Your name is: " + in.nextLine());
    System.out.println("Please enter your age:");
    System.out.println("Your age is: " + in.nextInt());
    in.close();
  }
}
