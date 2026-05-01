public class RecursionDemo {

  // factorial visualizer
  public static int f(int n) {
    if (n < 0)
      throw new IllegalArgumentException("n must be a positive integer.");
    System.out.println();
    if (n == 1 || n == 0) {
      System.out.print(".");
      return 1;
    }
    for (int i = 0; i < n; i++)
      System.out.print(".");
    return n * f(n - 1);
  }

  public static void main(String[] args) {
    f(25);
  }
}
