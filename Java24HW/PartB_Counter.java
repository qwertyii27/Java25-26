
// NOTE: Run the one labeled "CounterTwo." Made by Georgio. No AI or whatever else.
import java.util.Scanner;

public class PartB_Counter {
  public int count = 0;
  private final int max = 9999;

  public int getCount() {
    return count;
  }

  public void reset() {
    count = 0;
  }

  public void tick() {
    count++;
    if (count > max) {
      count = 0;
    }
  }

  public static void main(String[] args) {
    PartB_Counter cakeCounter = new PartB_Counter();
    PartB_Counter pieCounter = new PartB_Counter();
    Scanner in = new Scanner(System.in);

    while (true) {
      System.out.println("Please enter 'c' to vote for cake, or 'p' for pie, or 'q' to quit.");
      char input = in.nextLine().charAt(0);
      if (input == 'p')
        pieCounter.tick();
      if (input == 'c')
        cakeCounter.tick();
      if (input == 'q')
        break;

    }
    System.out.printf("%nPie has been voted on %d times", pieCounter.getCount());
    System.out.printf("%nCake has been voted on %d times", cakeCounter.getCount());
    in.close();
  }
}
