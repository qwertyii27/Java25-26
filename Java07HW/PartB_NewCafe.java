
//By Georgio!
//This version is built around enumerated data. I hate the way I wrote this but it works...so meh.
import java.util.Scanner;

enum ageRange {
    CHILD, ADULT, SENIOR
}

public class PartB_NewCafe {
    public static void main(String[] args) {
        // declare vars
        boolean monday = false;
        String ageCalc;
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
        //
        if (age >= 50) {
            ageCalc = "SENIOR";
        } else if (age < 13) {
            ageCalc = "CHILD";
        } else {
            ageCalc = "ADULT";
        }
        // get the right age group
        ageRange ageR = ageRange.valueOf(ageCalc);

        // get discount
        if (monday) {
            switch (ageR) {
                case SENIOR:
                    discount = 0.85;
                    break;
                case ADULT:
                    discount = 0.95;
                    break;
                case CHILD:
                    discount = 0.925;
                    break;
            }
        } else {
            switch (ageR) {
                case SENIOR:
                    discount = 0.925;
                    break;
                case ADULT:
                    discount = 1;
                    break;
                case CHILD:
                    discount = 0.95;
                    break;
            }
        }
        // get money
        System.out.println("How much is their subtotal? (dd.cc): ");
        subtotal = in.nextDouble();
        total = subtotal * discount;

        /*
         * debug output
         * System.out.println("monday isTrue: " + monday);
         * System.out.println("age Int: " + age);
         * System.out.println("ageGroup string:" + ageCalc);
         * System.out.println("subtotal Double: " + subtotal);
         */

        // print output
        System.out.printf("Your total is $%2.2f.", total);
        in.close();
    }
}