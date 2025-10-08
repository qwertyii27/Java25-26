import java.util.Scanner;

public class Phone_Format {
    public static void main(String[] args) {
        // get vars
        Scanner in = new Scanner(System.in);
        String number;

        // get input
        System.out.print("Please input your phone number, unformatted: ");
        number = in.nextLine();

        // formatting
        String numberFormatted = "(" + number.substring(0, 3) + ") " +
                number.substring(3, 6) + " " + number.substring(6, 10);
        // display
        System.out.printf("Your phone number is \"%s\"", numberFormatted);
    }
}
