import java.util.Scanner;

public class RdmAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        if (age > 49) {
            System.out.println("Congratulations, you qualify for a senior discount!");
        } else {
            System.out.println("Sorry, you do not qualify for a senior discount today.");
        }
    }
}
