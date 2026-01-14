import java.util.Arrays;
import java.util.Scanner;

public class ReverseSort_PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] originalArray = new int[15];
        int maxSize = 10; // maximum actual inputs
        int[] finalArray;
        int inCount = 0; // how many inputs were taken

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

        for (int index = 0; index < finalArray.length; index++) {
            System.out.print(finalArray[index] + "*");
        }
        System.out.println();

        Arrays.sort(finalArray);

        for (int index = 0; index < finalArray.length / 2; index++) { // reversing the array
            int tmp = finalArray[index];
            finalArray[index] = finalArray[finalArray.length - 1 - index];
            finalArray[finalArray.length - 1 - index] = tmp;
        }
        System.out.println(Arrays.toString(finalArray));
        in.close();
    }
}
