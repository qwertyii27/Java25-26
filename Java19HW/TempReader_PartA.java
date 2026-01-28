
//Made by Georgio. I re-used some earlier code, just added file reader functionality.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TempReader_PartA {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("temps.txt");
        Scanner in = new Scanner(inputFile);
        ArrayList<Double> temps = new ArrayList<>();
        double lowest = 999999999;
        double d = 0.00001; // similarity thershold

        while (true) {
            System.out.println("Reading... ");
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
        in.close();
    }
}
