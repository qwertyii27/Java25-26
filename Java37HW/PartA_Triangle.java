// This is essentially just the factorial example from class but with dots.
public class PartA_Triangle {

  // factorial visualizer. we love triangles :D
  public static int printInverted(int n) {
    if (n < 0)
      throw new IllegalArgumentException("n must be a positive integer.");
    System.out.println();
    if (n == 1 || n == 0) {
      System.out.print(".");
      return 1;
    }
    for (int i = 0; i < n; i++)
      System.out.print(".");
    return n * printInverted(n - 1);
  }

  public static void main(String[] args) {
    printInverted(25);
  }
}
