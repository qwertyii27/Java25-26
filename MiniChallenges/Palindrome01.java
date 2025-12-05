//Made by Georgio, no AI or outside help, etc. etc.
//Make a program that checks if a word is a palindrome.

import java.util.Scanner;

public class Palindrome01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean palindrome = true;

        // input
        System.out.print("Please enter a word:");
        String word = in.next();
        in.nextLine();
        int leftLetter = 0;
        for (leftLetter = 0; leftLetter < word.length() / 2 + 1; leftLetter++) {
            if (word.charAt(leftLetter) != word.charAt(word.length() - leftLetter - 1)) {
                System.out.println(word + " is not a palindrome.");
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println(word + " is a palindrome!");
        }
    }
}
