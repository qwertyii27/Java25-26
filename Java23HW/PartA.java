import java.util.InputMismatchException;
import java.util.Scanner;

public class PartA {
  // error codes for debug
  public static int errArithmetic = 401;
  public static int errMismatch = 402;
  public static int errUnknown = 400;

  public static int getScore(Scanner in) {
    int reVal = -errUnknown;
    System.out.println("Please enter an integer score: ");
    try {
      reVal = in.nextInt();
    } catch (ArithmeticException e) {
      reVal = -errArithmetic;
    } catch (InputMismatchException e) {
      reVal = -errMismatch;
    }
    return reVal;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int score = getScore(in);
    if (score > 0)
      System.out.printf("%nScore = %d", score);
    else
      System.err.printf("Error code #%d: An error occured.", -score);
  }
}
