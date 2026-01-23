
// Made by Georgio.
import java.util.ArrayList;
import java.util.Scanner;

public class TestList_PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();
        double avg = 0;
        int count = 0;

        while (true) {
            System.err.print("Please input a double or anything else to exit:");
            if (!in.hasNextDouble()) {
                break;
            }
            scores.add(in.nextDouble());
        }

        for (count = 0; count < scores.size(); count++) {
            avg += scores.get(count);
            System.out.println(scores.get(count));
        }
        avg = avg / count;
        System.out.printf("Average: %.2f", avg);
    }
}
