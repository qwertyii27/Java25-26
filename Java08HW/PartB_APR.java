
//made by georgio
import java.util.Scanner;

public class PartB_APR {
    public static void main(String[] args) {
        double apr, initial, total, earned;
        Scanner in = new Scanner(System.in);

        System.out.println("APR (enter as double): ");
        apr = in.nextDouble() / 100;
        System.out.println("Principal amount (enter as double): ");
        initial = in.nextDouble();
        System.out.println("Year |   Interest ($).       |        Balance ($)");
        System.out.println("-------------------------------------------------");

        for (int i = 1; i <= 5; i++) {
            earned = -(initial - (initial + (initial * apr)));
            initial = initial + (initial * apr);
            System.out.printf(" %d  |%10.2f|%10.2f%n", i, earned, initial);
        }
    }
}