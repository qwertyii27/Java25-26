// By Georgio!

import java.util.Scanner;

public class Money_Format {
    public static void main(String[] args) {
        // declare vars
        Scanner in = new Scanner(System.in);
        double total;
        double cents;
        double dollars;

        // get input
        System.out.println("How much money do you have in dollars and cents?: ");
        total = in.nextDouble();

        // calculate
        dollars = total;
        cents = (total - Math.floor(total)) * 100;

        // output
        System.out.printf("You have %d dollars and %d cents!", (int) dollars, (int) cents);
    }
}
