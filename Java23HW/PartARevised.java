import java.util.InputMismatchException;
import java.util.Scanner;

public class PartARevised {

  public static int getScore(Scanner in) throws NumberFormatException {
    int reVal = 0;
    System.out.println("Please enter an integer score: ");
    try {
      reVal = in.nextInt();
    } catch (InputMismatchException e) {
      throw new NumberFormatException("Score must be an integer.");
    }
    if (reVal < 0 || reVal > 100) {
      throw new NumberFormatException("Score must be between 0 and 100.");
    }
    return reVal;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int score = getScore(in);
    System.out.printf("%nScore = %d", score);
    in.close();
  }
}
