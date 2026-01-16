// By Georgio. No AI or external help (except class materials i had to check)

import java.util.Scanner;

public class Average_PartB {

    public static double average(double... values) {
        double[] avgArray = new double[values.length];
        int i = 0;
        double sum = 0;
        for (double value : values) {
            avgArray[i] = value;
            i++;
            sum = sum + value;
        }
        final double AVERAGE = sum / i;
        return AVERAGE;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(average(0, 10));
        System.out.println(average(2, 3));
        in.close();
    }
}