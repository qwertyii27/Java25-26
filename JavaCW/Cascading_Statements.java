import java.util.Scanner;

public class Cascading_Statements {
    public static void main(String[] args) {
        double scale;
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the magnitude of the earthquake: ");
        scale = in.nextDouble();

        if (scale >= 8.0) {
            System.out.println("Most Structures fall.");
        } else if (scale >= 7.0) {
            System.out.println("Many buildings destroyed.");
        } else if (scale >= 6.0) {
            System.err.println("Many buildings damaged, some collapse.");
        } else if (scale >= 4.5) {
            System.out.println("Damage to poorly constructed buildings.");
        } else {
            System.out.println("No damage!");
        }
        in.close();
    }

}