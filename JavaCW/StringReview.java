
// Gives length fo given name
import java.util.Scanner;

public class StringReview {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = in.nextLine();

        int length = name.length();
        System.out.println("Your name is " + length + " letters long.");
        System.out.printf("Formatted, your name is %d letters long.%n", length);

        System.out.print("Enter a number: ");
        double one = in.nextDouble();

        System.out.print("Enter another number: ");
        double two = in.nextDouble();

        System.out.printf("The quotient of your numbers is %.2f%n", one / two);
        System.out.printf("The percentage is equal to %.2f,%n", one);
    }

}