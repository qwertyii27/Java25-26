// Made by Georgio. No use of AI or external search except for general help.

import java.util.Arrays;
import java.util.Scanner;

public class AddTest {
    public static int Insert(int arraySize, int targetPoint, double[] array, double newVal) {
        double[] workArray = array;
        // checks if request is out of bounds
        if (targetPoint > arraySize - 1 || targetPoint > arraySize)
            return arraySize; // does nothing if out of bounds
        else {
            // empties chosen element while maintaining order
            for (int index = targetPoint; index < arraySize - 1 - targetPoint; index++) {
                array[arraySize + 1 - targetPoint - index] = array[arraySize - targetPoint - index];
            }
            array[targetPoint] = newVal;
            arraySize++; // Reflects added value.
            // returns the updated size.
            return arraySize;
        }

    }

    public static void main(String[] args) {

        double[] testScores = new double[100];
        double[] subArray; // The array with only the filled-in components
        double greatest = 0.0; // The greatest of the values.
        double avg = 0.0; // The mean of the values.
        int valueQuantity = 10; // The initial maximum values for the array prompted.
        double workAvg = 0.0; // For math.
        int avgCount = 0; // For math.
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < valueQuantity; i++) { // record scores
            System.out.println("Please input a test score.");
            if (in.hasNext("Q") || in.hasNext("q")) // quit if quit pattern is entered.
                break;
            testScores[i] = in.nextDouble();
            in.nextLine();
            avgCount++;
        }

        in.nextLine(); // removes extra output

        for (double score : testScores) { // get greatest
            if (score > greatest)
                greatest = score;
        }

        for (double score : testScores) { // get average
            workAvg = workAvg + score;
        }
        avg = workAvg / avgCount;
        System.out.println("Number of entries:" + avgCount);
        System.out.println("Greatest is: " + greatest);
        System.out.println("Average is: " + avg);

        // Begin removal.
        subArray = Arrays.copyOfRange(testScores, 0, avgCount);
        System.out.println("Current Array:" + Arrays.toString(subArray));

        System.out.println("Enter an index score to add a value: ");
        int tgtPoint = in.nextInt();
        in.nextLine();

        System.out.println("Enter a score to add: ");
        double addedValue = in.nextDouble();

        Insert(avgCount, tgtPoint, testScores, addedValue);
        subArray = Arrays.copyOfRange(testScores, 0, avgCount + 1);
        System.out.println("New Array with input " + tgtPoint + " replaced with " + addedValue + "."
                + Arrays.toString(subArray));
        in.close(); // close scanner
    } // ending brackets
}
