
//Made by...someone, fixed by Georgio!
import java.util.Scanner;

public class Bug_Fix {
    // prompt user for age.
    public static void main(String[] args) { // Fix: No main method

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // are they lucky?
        if (age == 13) { // Fix: From = to ==
            System.out.println("Lucky 13!");
        }
    }
}
