import java.util.Arrays;

public class ArrayCW2 {
    public static void main(String[] args) {

        int[] values = new int[10];
        Arrays.fill(values, (int) (Math.random() * 10 + 1));
        System.out.println(Arrays.toString(values));
        System.out.print("[ ");
        for (int value : values) {
            // System.out.print(value + ", ");
            System.out.printf("%d, ", value);
        }
        System.out.println("]");
    }
}
