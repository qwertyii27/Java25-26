
// By Georgio.
import java.util.Arrays;
import java.util.Scanner;

public class CleanUp_PartA {

    public static void clean(String[] array) {
        int i = 0;
        for (String string : array) {
            string = (string.strip());
            string.toLowerCase();
            char[] charArray = string.toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            array[i] = String.valueOf(charArray);
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] sampleString = new String[99];
        int numCount = 0;

        System.out.println("Enter any input to begin.");
        while (true) {
            System.out.println("Please enter a string or enter 'q' to quit: ");
            String tmpString = in.nextLine();
            if (tmpString.charAt(0) == 'q')
                break;
            sampleString[numCount] = tmpString;
            numCount++;
        }
        String[] realArray = Arrays.copyOf(sampleString, numCount);
        System.out.println(Arrays.toString(sampleString));
        clean(realArray);
        System.out.println(Arrays.toString(realArray));

        for (int i = 0; i < realArray.length; i++) {
            System.out.println(realArray[i]);
        }
        in.close();
    }
}