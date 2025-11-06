import java.util.Scanner;

public class Test_AvgPartA {
    public static void main(String[] args) {
        // vars and such
        double totalScores = 0, input = 0, numScores = 0;
        Scanner in = new Scanner(System.in);

        // instructions
        System.out.println("Keep inputting scores, or input a negative to get the average.");

        while (true) { // loop
            input = in.nextDouble();
            if (input < 0) { // exit condition placed here to avoid counting the negative.
                break;
            }
            totalScores = totalScores + input;
            numScores++;
        }
        double average = totalScores / numScores; // calc and output
        System.out.printf("The average is %.2f percent.", average);
        in.close();

    }
}