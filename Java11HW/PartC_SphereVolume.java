import java.util.Scanner;

public class PartC_SphereVolume {
    private static double getVolumeSphere(double radius) {

        double volume = (4.0 / 3.0) * Math.PI * (radius * radius * radius);
        return volume;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please input your radius: ");
        double radius = in.nextDouble();
        System.out.println("Your sphere's volume is: " + getVolumeSphere(radius));
    }
}