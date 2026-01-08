// Made by Georgio. No use of AI or external search.

import java.util.Arrays;
import java.util.Scanner;

public class RemoveTest {
	public static int Remove(int arraySize, int targetPoint, double[] array) {
		// checks if request is out of bounds
		if (targetPoint > array.length - 1 || targetPoint > arraySize)
			return arraySize; // does nothing if out of bounds
		else {
			// removes chosen element while maintaining order
			for (int index = targetPoint; index < array.length - 1 - targetPoint; index++) {
				array[index] = array[index + 1];
			}
			// decreases size to reflect removed element.
			arraySize = arraySize - 1;
			// returns the updated size.
			return arraySize;
		}

	}

	public static void main(String[] args) {

		double[] testScores = new double[10];
		double greatest = 0.0;
		double avg = 0.0;
		double workAvg = 0.0;
		int avgCount = 0;
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < testScores.length; i++) { // record scores
			System.out.println("Please input a test score.");
			if (in.hasNext("Q") || in.hasNext("q"))
				break;
			testScores[i] = in.nextDouble();
			avgCount++;
		}
		// eat extra input.
		while (in.hasNext()) {
			in.nextLine();
			in.nextLine();
		}
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

		// remove test

		System.out.println("Current Array:" + Arrays.toString(testScores));

		System.out.println("Enter an index score to remove: ");
		int tgtPoint = in.nextInt();

		Remove(testScores.length, tgtPoint, testScores);

		System.out.println("New Array with input " + tgtPoint + " removed:" + Arrays.toString(testScores));

	} // ending brackets
}
