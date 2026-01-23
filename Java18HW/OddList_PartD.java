//Made by Georgio.

import java.util.ArrayList;
import java.util.Scanner;

public class OddList_PartD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> test = new ArrayList<>();
        while (true) {
            System.out.println("Please enter an integer or anything else to exit:");
            if (!in.hasNextInt())
                break;
            test.add(in.nextInt());
        }

        for (int i = test.size(); i > 0; i--) {
            if ((i / 2) - ((double) i / 2.0) != 0) {
                test.remove(i - 1);
            }
        }
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
    }
}
