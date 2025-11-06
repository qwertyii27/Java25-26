import java.util.Scanner;

public class Char_EPartB {
    public static void main(String[] args) {
        // declare things
        Scanner in = new Scanner(System.in);
        String phrase;
        int phraseLength;
        char phraseChar;
        int eCount = 0;

        System.out.print("Please enter a phrase: "); // input

        phrase = in.nextLine().toLowerCase(); // get phrase and length
        phraseLength = phrase.length();

        for (int i = 1; i < phraseLength; i++) { // the loop
            phraseChar = phrase.charAt(i);
            if (phraseChar == 'e') {
                eCount = eCount + 1;
            }
        }
        // output
        System.out.printf("The character E (case insensitive) appears %d times.", eCount);
        in.close();

    }
}
