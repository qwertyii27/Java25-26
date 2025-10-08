//By Georgio.
public class EquationWorkFIXED {
    public static void main(String[] args) {
        final int n = 17;
        final int m = 18;

        System.out.println("Equation A is" + (n / 10 + n % 10));
        System.out.println("Equation B is" + (n % 2 + m / 2));
        System.err.println("Equation C is" + ((m + n) / 2));
        System.out.println("Equation D is" + ((m + n) / 2.0));
        System.out.println("Equation E is" + ((int) (0.5 * (m + n))));
        System.out.println("Equation F is" + ((int) Math.round(0.5 * (m + n))));
    }
}
