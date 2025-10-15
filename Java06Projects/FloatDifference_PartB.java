
//Made by Georgio Tournas!
import java.util.Scanner;

public class FloatDifference_PartB {
    public static void main(String[] args) {
        // get vars
        double float1;
        double float2;
        final double limit = 0.01;
        Scanner in = new Scanner(System.in);

        System.out.print("Please input two doubles: ");
        float1 = in.nextDouble();
        float2 = in.nextDouble();

        if (Math.abs(float2 - float1) <= limit) {
            System.out.println("Okay amount of difference! :D");

        } else {
            System.out.println("Too much difference :(");
        }

        in.close();
    }
}
