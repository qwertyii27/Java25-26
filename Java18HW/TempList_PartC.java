
//Made by Georgio.
import java.util.ArrayList;
import java.util.Scanner;

public class TempList_PartC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> temps = new ArrayList<>();
        double lowest = 999999999;
        double d = 0.00001; // similarity thershold

        while (true) {
            System.out.println("Please enter a temperature or anything else to exit: ");
            if (!in.hasNextDouble())
                break;
            temps.add(in.nextDouble());
        }
        for (int i = 0; i < temps.size(); i++) {

            if (lowest > temps.get(i))
                lowest = temps.get(i);
        }
        for (int i = 0; i < temps.size(); i++) {
            if (Math.abs(temps.get(i) - lowest) < d) {
                System.out.printf("%.2f <== Lowest", temps.get(i));
                continue;
            }
            System.out.println(temps.get(i));
        }

    }
}
