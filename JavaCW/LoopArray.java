import java.util.Scanner;

public class LoopArray {

    public static void errorMessage() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int LENGTH = 100;
        int i = 0;
        double mathVar = 0;
        double[] scores = new double[LENGTH];

        System.out.println("Please input a test score:");
        while (i < 100) {
            if (in.hasNext("q") || !in.hasNextDouble()) {
                System.out.println("Quitting program");
                break;
            }
            System.out.println("Please input a test score:");
            scores[i] = in.nextDouble();
            i++;
        }
        for (int f = 0; f < i; f++) {
            mathVar = mathVar + scores[f];
        }
        mathVar = mathVar / i;
        System.out.printf("%.2f", mathVar);
    }
}
