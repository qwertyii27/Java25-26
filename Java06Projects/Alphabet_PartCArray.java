import java.util.Arrays;
import java.util.Scanner;

public class Alphabet_PartCArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = new String[3];

        System.out.print("Please write three words to be sorted: ");
        words[0] = in.nextLine();
        words[1] = in.nextLine();
        words[2] = in.nextLine();
        Arrays.sort(words);
        System.out.printf("--------%n");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
    }
}
