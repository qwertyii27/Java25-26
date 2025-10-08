/* Implement a program that directs a cashier how to give change. 
The program has two inputs: the amount due in dollars (as a decimal value) and 
the amount received from the customer in dollars (also as a decimal value). */
// Made by Georgio.

import java.util.Scanner;

public class Coin_Counter {
    public static void main(String[] args) {
        // declare variables
        int numPennies;
        int numNickels;
        int numDimes;
        int numQuarters;
        int numDollars;
        double owedTotal;
        double givenTotal;
        double changeTotal;
        double calcTotal;
        Scanner scan = new Scanner(System.in);

        // get input
        System.out.print("Please enter the amount owed ($): ");
        owedTotal = scan.nextDouble();
        System.out.println("Please enter the amount received ($): ");
        givenTotal = scan.nextDouble();

        // calculations
        changeTotal = Math.max(givenTotal - owedTotal, 0);
        calcTotal = changeTotal;
        numDollars = (int) (calcTotal);
        calcTotal -= numDollars;
        numQuarters = (int) (calcTotal / 0.25);
        calcTotal -= (0.25 * numQuarters);
        numDimes = (int) (calcTotal / 0.10);
        calcTotal -= (0.1 * numDimes);
        numNickels = (int) (calcTotal / 0.05);
        calcTotal -= (0.05 * numNickels);
        numPennies = (int) (calcTotal / 0.01);

        // output
        System.out.printf("Your total change is:              %6.2f%n", changeTotal);
        System.out.printf("Your number of dollars needed is:  %3d%n", numDollars);
        System.out.printf("Your number of quarters needed is: %3d%n", numQuarters);
        System.out.printf("Your number of dimes needed is:    %3d%n", numDimes);
        System.out.printf("Your number of nickels needed is:  %3d%n", numNickels);
        System.out.printf("Your number of pennies needed is:  %3d%n", numPennies);

        scan.close();
    }
}
