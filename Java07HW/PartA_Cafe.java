
//By Georgio!
//Gives a special discount for Mondays, and a discount for elders or kids.
import java.util.Scanner;

public class PartA_Cafe {
    public static void main(String[] args) {
        // declare vars
        boolean monday = false;
        double discount = 1;
        double subtotal;
        double total;
        int age;
        Scanner in = new Scanner(System.in);

        // get day
        System.out.print("Is it Monday? (y/n): ");
        if (in.nextLine().equals("y")) {
            monday = true;
        }
        // get age
        System.out.println("How old is the customer? (years): ");
        age = in.nextInt();

        if (monday == true) {
            if (age >= 50) {
                discount = 0.85;
            } else if (age < 13) {
                discount = 0.925;
            } else {
                discount = 0.95;
            }
        } else {
            if (age >= 50) {
                discount = 0.925;
            } else if (age < 13) {
                discount = 0.95;
            }
        }
        // get money
        System.out.println("How much is their subtotal? (dd.cc): ");
        subtotal = in.nextDouble();
        total = subtotal * discount;

        /*
         * debug output
         * System.out.println("monday isTrue: " + monday);
         * System.out.println("age Int: ");
         * System.out.println("subtotal Double: ");
         */

        // print output
        System.out.printf("Your total is $%2.2f.", total);
        in.close();
    }
}