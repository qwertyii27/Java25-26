// Recursion going upwards? How evil!
public class PartB_AnotherTriangle {

  public static void triangle(int n) {
    if (n < 0)
      throw new IllegalArgumentException("Negative integers are bad. Don't do them.");
    if (n == 0)
      return;
    triangle(n - 1);
    System.out.println();
    for (int i = 0; i < n; i++) {
      System.out.print(".");
    }
  }

  public static void main(String[] args) {
    triangle(5);
  }
}
