
// Made by Georgio. 
// Takes user input to calculate falling.
import java.util.Scanner;

public class GravityEquationFIXED {
    public static void main(String[] args) {
        double s0; // initial height in meters
        double v0; // initial velocity in meters
        double t; // time in seconds
        final double G = -9.81; // gravity standard in meters
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the initial height in meters as a demical: ");
        s0 = input.nextDouble();
        System.out.print("Please input the initial velocity in meters as a decimal:");
        v0 = input.nextDouble();
        System.out.print("Please input the time in seconds as a demical: ");
        t = input.nextDouble();
        double s = s0 + (v0 * t) + (0.5 * G) * Math.pow(t, 2);
        System.out.println("s is equal to" + s);
    }
}