
//Made by Georgio.
import java.util.Scanner;

public class CookieFix_PartB {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of cookies: ");
        int num = in.nextInt();
        // COMPILE Error: discount must be initialized within main, because otherwise
        // will escape scope.
        // double discount;
        double discount = 0;
        // LOGIC Error: Conditions should go by most stringent conditions first. Cascade
        // improperly implemented.
        // if (num > 6) {
        if (num > 12) {
            discount = 0.10;
            // Continued from previous error.
            // } else if (num > 12) {
        } else if (num > 6) {
            discount = 0.05;
        }
        System.out.println("Discount = " + discount);
    }
}
