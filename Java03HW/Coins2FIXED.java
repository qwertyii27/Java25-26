
//By Georgio.
// This program calculates change.
import java.util.Scanner;

public class Coins2FIXED {
    public static void main(String[] args) {
        Scanner changeScan = new Scanner(System.in);

        int quarter;
        int dime;
        int nickel;
        int penny;
        double change;

        System.out.print("Please input your change as a decimal.");
        change = changeScan.nextFloat();

        quarter = (int) (change / 0.25);
        change = change - (quarter * 0.25);

        dime = (int) (change / 0.10);
        change = change - (dime * 0.10);

        nickel = (int) (change / 0.05);
        change = change - (nickel * 0.05);

        penny = (int) ((change / 0.01));
        change = change - (penny * 0.01);

        System.out.println("Quarters:" + quarter);
        System.out.println("Dime:" + dime);
        System.out.println("Nickel:" + nickel);
        System.out.println("Pennies:" + penny);
    }
}
