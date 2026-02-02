
// By Georgio. No AI or outside help EXCEPT i googled a guide to delimiters since
// the class notes didn't cover them very deeply.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB_CharReader {
    public static void main(String[] args) throws FileNotFoundException {
        File fileIn = new File("characters.txt");
        Scanner in = new Scanner(fileIn);
        String file = ""; // string that has all file characters.

        int charCount = 0; // total non-digit characters
        int digitCount = 0; // total digits
        int count = 0; // total unicode characters

        in.useDelimiter("[\\p{P} \n]+");
        while (in.hasNext()) { // gets all characters together.
            file = file.concat(in.next());
        }
        for (int i = 0; i < file.length(); i++) { // get various counts.
            if (Character.isDigit(file.charAt(i))) {
                digitCount++;
            } else {
                charCount++;
            }
        }

        // print output.
        System.out.println("Total count: " + file.length());
        System.out.println("Total non-digit characters: " + charCount);
        System.out.println("Total digits: " + digitCount);
    }
}
