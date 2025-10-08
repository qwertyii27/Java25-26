import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // declare variables
        double length; // cm
        double width; // cm
        double height; // cm
        double surface; // square cm
        double volume; // cubic cm

        // get variables
        System.out.println("Enter the length, width, and height (cm) of the box: ");
        length = in.nextDouble();
        width = in.nextDouble();
        height = in.nextDouble();

        // calculate surface/volume
        surface = 2 * ((length * width) + (length * height) + (width * height));
        volume = length * width * height;
        System.out.printf("Length    (cm) = %010.2f%n", length);
        System.out.printf("Width     (cm) = %010.2f%n", width);
        System.out.printf("Height    (cm) = %010.2f%n", height);
        System.out.printf("S Area (sq cm) = %010.2f%n", surface);
        System.out.printf("Volume (cu cm) = %010.2f%n", volume);

        // display
    }
}
/*
 * Enter the length, width, and height (cm) of the box: 234.56 241 99.9
 * length (cm) = 234.56
 * width (cm) = 241.00
 * height (cm) = 99.90
 * s area (sq cm) = 208074.81
 * volume (cu cm) = 5647243.10
 */