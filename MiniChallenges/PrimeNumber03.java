// Made by Georgio, no AI and whatever. This checks if the number is prime, duh.

import java.util.Scanner;

public class PrimeNumber03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        boolean prime = true;

        System.out.println("Please input a whole number:");
        number = in.nextInt();

        if (number == 1 | number == 0) {
            prime = false;
        } else if (number == 2 | number == 3) {
            prime = true;
        } else if (number % 2 != 0) {
            if (number % 3 != 0) {
                prime = true;
            } else {
                prime = false;
            }

        } else {
            prime = false;
        }
        System.out.println(prime);
    }
}
