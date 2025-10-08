// Made by Georgios Tournas of the Tournas Dynasty
// AT Java Fall 2025
// HW #02
// Does 7 +3 and beeps!
import java.awt.Toolkit;
public class Beep {
    public static void main(String[] args) {
        System.out.println("This is my second program.");
        System.out.print("The sym of 7 and 3 is ");
        System.out.println(7 + 3); //Output: 10

        Toolkit.getDefaultToolkit().beep(); // Beep!
    }
    }