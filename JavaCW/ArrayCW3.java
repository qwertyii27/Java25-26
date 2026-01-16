
// Made by Georgio!
import java.util.Arrays;

public class ArrayCW3 {
    public static void square(double[] values) {
        for (int index = 0; index < values.length; index++)
            values[index] = values[index] * values[index];
    }

    public static void main(String[] args) {
        double[] numbers = { 34, 12, 3, 2, 6, 10 };
        square(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
