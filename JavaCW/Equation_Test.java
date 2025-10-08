public class Equation_Test {
    public static void main(String[] args) {
        double x = 0.3 * 3 + 0.1;
        double y = 1;

        if (x == y) {
            System.out.println("The numbers match.");
        } else {
            System.out.println("They don't match!");
        }
        System.out.printf("%24.24f", x);
    }
}