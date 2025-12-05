// Made by Georgio. No AI or outside help, I pinky promise.
//Writes a progress bar from an input of 0 (0%) to 20 (20%)

import java.util.Scanner;

public class ProgressBar04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int percentIn;

        System.out.println("Please input a number from 0-20: ");
        percentIn = in.nextInt();
        in.nextLine();

        System.out.print("Progress: [");

        for (int i = 0; i < percentIn; i++) {
            System.out.print("#");
        }
        for (int i = 0; i < 20 - percentIn; i++) {
            System.out.print("-");
        }
        System.out.printf("] %d%%", percentIn * 5);
    }
}
