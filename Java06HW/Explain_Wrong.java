
public class Explain_Wrong {
  public static void main(String[] args) {
    /*
     * double a = 1.2;
     * double b = 3.0;
     * double c = a * b;
     * if (c == 3.6) {
     * System.out.println("c is 3.6");
     * } else {
     * System.out.println("c is not 3.6");
     * }
     * The issue with this is that there is a small margin of error when doing
     * calculations like this. When printed out, c is equal to 3.9999...6. Fix by
     * rounding, like so:
     */
    double a = 1.2;
    double b = 3.0;
    double c = (Math.round(10 * (a * b))) / 10.0;
    System.out.println(c);
    if (c == 3.6) {
      System.out.println("c is 3.6");
    } else {
      System.out.println("c is not 3.6");
    }

  }
}