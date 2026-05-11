public class Hanoi {

  public static int getInterim(int start, int end) {
    int sum = start + end;
    if (sum == 5)
      return 1;
    if (sum == 4)
      return 2;
    return 3;
  }

  public static void printMove(int start, int end) {
    System.out.printf("%d -> %d%n", start, end);
  }

  public static void solve(int discs, int start, int end) {
    int interim = getInterim(start, end);
    if (discs == 0)
      return;
    solve(discs - 1, start, interim);
    printMove(start, end);
    solve(discs - 1, interim, end);

  }

  public static void main(String[] args) {
    solve(4, 1, 3);
  }
}
