import org.derryfield.math.Geometry;
import java.util.Scanner;

public class GeometryDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input side length: ");
        double sideLength = in.nextDouble();

        System.out.println("Area = " + Geometry.get_area_square(sideLength));
        System.out.println("Perimeter = " + Geometry.get_perimeter_square(sideLength));
        in.close();
    }
}
