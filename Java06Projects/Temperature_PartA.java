
// Made by Georgio
import java.util.Scanner;

public class Temperature_PartA {
    public static void main(String[] args) {
        // declare vars
        Scanner in = new Scanner(System.in);
        String type;
        double heat;
        boolean gas = false;
        boolean liquid = false;
        boolean solid = false;

        // get input
        System.out.print("Enter a temperature then 'C' for Celsius or 'F' for Farenheit separated by a space: ");
        heat = in.nextDouble();
        type = in.next();

        System.out.printf("%n+++++++++++++++++%n"); // seperator

        // calculations
        if (type.startsWith("C")) {
            if (heat >= 100.0) {
                gas = true;
            } else if (heat >= 0) {
                liquid = true;
            } else {
                solid = true;
            }
        } else if (type.startsWith("F")) {
            if (heat >= 212.0) {
                gas = true;
            } else if (heat >= 32.0) {
                liquid = true;
            } else {
                solid = true;
            }

        }
        System.out.println(gas);
        System.out.println(liquid);
        System.out.println(solid);
        // give output
        if (gas == true) {
            System.out.printf("At a temperature of %.2f%s, water is a gas.", heat, type);
        }
        if (liquid == true) {
            System.out.printf("At a temperature of %.2f%s, water is a liquid.", heat, type);
        }
        if (solid == true) {
            System.out.printf("At a temperature of %.2f%s, water is a solid.", heat, type);
        }
        in.close();
    }
}