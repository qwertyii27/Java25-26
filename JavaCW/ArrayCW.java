import java.util.Arrays;
import java.util.Scanner;

public class ArrayCW {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] thing = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Please input an integer: ");
            thing[i] = in.nextInt();
        }
        Arrays.sort(thing);
        System.out.println("The largest number is: " + thing[4]);
    }
}
