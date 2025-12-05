
//Made by Georgio.
import java.util.Scanner;

public class Group1 {
    private static String reverseString(String subject) {

        char[] sortArray = subject.toCharArray();
        for (int i = 0; i < sortArray.length / 2; i++) {
            char saveSlot = sortArray[i]; // saves the left object before it gets overwritten

            int iReversed = -i + sortArray.length - 1; // the right object's place (left is i)

            sortArray[i] = sortArray[-i + sortArray.length - 1]; // bringing the right object to the left
            sortArray[-i - 1 + sortArray.length] = saveSlot; // bringing the left object to the right
        }
        String completeArray = String.valueOf(sortArray);
        return completeArray;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        System.out.println(reverseString(in.nextLine()));
        in.close();
    }
}