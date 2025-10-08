
//Made by Georgio!
import java.util.Scanner;

public class Pie_Discount {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // get vars
        final double PIE_PRICE = 10.00;
        double pieAmount;
        double pieTotal;

        // get input

        System.out.println("Welcome to the Cougar Baking Company store!");
        System.out.print("How many pies would you like to buy? ");
        pieAmount = in.nextDouble();

        // calculate
        pieTotal = PIE_PRICE * pieAmount;
        // print
        if (pieAmount > 3) {
            System.out.println("You are eligible for a discount!");
            System.out.printf("Your final price is $%.2f%n", (pieTotal * 0.9));
        } else {
            System.out.printf("Your final price is $%.2f%n", (pieTotal));
        }

    }

}
