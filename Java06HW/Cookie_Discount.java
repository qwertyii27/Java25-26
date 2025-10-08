//Made by Georgio!

import java.util.Scanner;

public class Cookie_Discount {
    public static void main(String[] args) {
        // Declare vars
        Scanner in = new Scanner(System.in);
        final double COOKIE_PRICE = 0.99;
        double cookieNum;
        double priceTotal;
        double endPrice;

        // Get input
        System.out.printf("Welcome to the Cougar Baking Company!%n How many cookies do you want to buy?: ");
        cookieNum = in.nextDouble();

        // Calculate
        priceTotal = cookieNum * COOKIE_PRICE;
        if (cookieNum > 24) {
            endPrice = priceTotal * 0.85;
            System.out.println("You qualify for a 15% discount!");
        } else if (cookieNum > 12) {
            endPrice = priceTotal * 0.95;
            System.out.println("You qualify for a 5% discount!");
        } else if (cookieNum > 6) {
            endPrice = priceTotal * 0.975;
            System.out.println("You qualify for a 2.5% discount!");
        } else {
            endPrice = priceTotal;
        }
        // Output
        System.out.printf("Your total is $%.2f! Come again!", endPrice);

    }
}
