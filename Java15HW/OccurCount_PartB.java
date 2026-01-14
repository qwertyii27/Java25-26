import java.util.Arrays;
import java.util.Scanner;

public class OccurCount_PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] originalArray = new int[15];
        int maxSize = 10; // maximum actual inputs
        int[] finalArray;
        int inCount = 0; // how many inputs were taken
        int key; // inputted integer to search for
        int searchIndex = 0; // the number used to check if the number has another instance, -1 means NO.
        int instanceCount = 0; // the number of times that the key occurs.

        for (int index = 0; index < maxSize; index++) {
            System.out.println("Please enter an integer, or the letter 'q' to quit.");
            if (in.hasNext("q") || in.hasNext("Q")) { // exit sequence
                break;
            }
            originalArray[index] = in.nextInt();
            in.nextLine();
            inCount++; // logs the new integer's present
        }
        finalArray = Arrays.copyOfRange(originalArray, 0, inCount); // makes sub-array of JUST the inputs
        Arrays.sort(finalArray); // sorts.

        for (int index = 0; index < inCount - 1; index++) {
            System.out.print(finalArray[index] + ", ");
        }
        System.out.println(finalArray[inCount - 1]);
        System.out.print("Enter an integer value: ");
        in.nextLine(); // eat input

        key = in.nextInt(); // get desired input for searching.
        while (searchIndex != -1) {
            searchIndex = Arrays.binarySearch(finalArray, key); // search.
            if (searchIndex == -1) { // -1 is the exit code.
                break;
            }
            finalArray[searchIndex] = key + 1; // ensuring that the same thing is not chosen again.
            instanceCount++;
        }
        System.out.println("The integer " + key + " occurs " + instanceCount + " times.");
    }

}
