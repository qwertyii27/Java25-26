/*A video club wants to reward its best members with a discount based on
 the member’s number of movie rentals and the number of new members referred 
 by the member. The discount is in percent and is equal to the sum of the rentals 
 and the referrals, but it cannot exceed 75 percent. (Hint: Math.min.) Write a program 
 Discount_Calculator to calculate the value of the discount.
 */
// Made by Georgio

import java.util.Scanner;

public class Discount_Calculator {
    public static void main(String[] args) {
        // declare variables
        double numRentals;
        double numReferrals;
        double discount;
        Scanner scanner = new Scanner(System.in);

        // Get inputs
        System.out.println("Welcome to the discount calculator!");
        System.out.print("How many movies have you rented? ");
        numRentals = scanner.nextDouble();
        System.out.print("How many people have you referred? ");
        numReferrals = scanner.nextDouble();
        System.out.println("Please wait...");

        // Calculations;
        discount = Math.min((numRentals + numReferrals), 75);

        // Output
        System.out.printf("Your total discount is %04.2f%%!", discount);
        scanner.close();

    }

}