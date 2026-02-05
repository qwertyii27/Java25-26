import java.util.Arrays;
import java.util.Scanner;

public class bignumbertest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] cars = new String[10];

        for (int i = 1; i < 5; i++) {
            cars[i] = in.next();
        }
        System.out.println("List of cars:");
        for (int i = 1; i < 5; i++) {
            Arrays.sort(cars);
            System.out.println(cars[i]);
        }
        in.close();
    }
}