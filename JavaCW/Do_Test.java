
//Made by Georgio.
import java.util.Scanner;

public class Do_Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        double input = 0;
        boolean error = false;

        do {
            if (error) {
                System.out.println("Input anything to try again.");
                String a = in.nextLine();
            }
            System.out.print("Please input a money input: ");
            if (!in.hasNextDouble()) {
                System.err.println("Error: Please enter a double.");
                error = true;
                continue;
            }
            input = in.nextDouble();
            if (input >= 0) {
                total = total + input;
                error = false;
            }
        } while (input >= 0);

        System.out.println(total);
        in.close();
    }
}
