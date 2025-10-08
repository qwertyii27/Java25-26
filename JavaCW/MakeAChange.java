import java.util.Scanner;

public class MakeAChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of money in cents:");
        int changeFinal = input.nextInt();
        System.out.println("You have " + changeFinal + "cents!");

        System.out.print("Enter the price of a milkshake as a demical value: ");
        double milkshake = input.nextDouble();

        System.out.print("Enter your name: ");
        var name = input.next();
        System.out.println("Your name ");
    }
}
