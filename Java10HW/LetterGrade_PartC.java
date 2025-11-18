import java.util.Scanner;

/*
 * LetterGrade: 
 * This program is supposed to compute a student's letter grade
 * from multiple quiz scores ranging from 0-100 in value.
 * 
 * Here is the intended behavior (for students to verify with the debugger):
 * 1) Read the student's name.
 * 2) Read in multiple quiz scores as integer values.000
 * 3) Validate that each score is between 0 and 100; if not, force it into this range.
 * 4) If the average >= 60, the student passes.
 * 5) Assign letter grade by average: A >= 90, B >= 80, C >= 70, D >= 60, else F.
 * 6) Print a short summary.
 *
 * NOTE: This file intentionally contains four (4) LOGIC ERRORS for debugging
 * practice.
 * 
 * Use your debugger to find the logic bugs.
 * 
 * When you find a bug, place a comment immediately above the bug and explain
 * what's wrong.
 * Also, comment out the original bug and write code that fixes the problem.
 * Be sure to retest your final program to make sure it works properly.
 * 
 * 
 * Hints:
 * Test the following cases,
         * Scores are 50, 55, 50, 55.
         * Scores are 125, 125, -20, -10.
         * Scores are 70, 80, 90, 100.
         * 
 * For these test cases, 
         * what should the min be? 
         * what should the max be?  
         * what should the average be?
         * should they pass or not?
         * what should their letter grade be?
 * 
 */
public class LetterGrade_PartC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt user for name.
        System.out.print("Enter student name: ");
        String name = in.nextLine();

        // Initialize variables to be used to find the total points,
        // and the min and max values.
        int total = 0;
        // FIX 3: Changed min initial to 101, so that minimums can be actually
        // calculated.
        // int min = 0;
        int min = 101;
        int max = -1;
        final int COUNT = 4;

        // loop count times to obtain the test scores for the student.
        for (int i = 1; i <= COUNT; i++) {
            System.out.print("Enter score " + i + " (0-100): ");
            int s = in.nextInt();

            // Validate input.
            // Only scores from 0 to 100 are allowed.
            // If a score is less than zero, force it to be equal to zero.
            // If a score is greater than 100, force it to be equal to 100.

            // FIX #1: AND && changed to OR || so that the condition actually triggers.
            // if (s < 0 && s > 100)
            if (s < 0 || s > 100) {
                if (s < 0)
                    s = 0;
                if (s > 100)
                    s = 100;
            }

            // Track min/max
            if (s < min)
                min = s;
            if (s > max)
                max = s;

            // add up the total.
            total += s;
        }

        // calculate average.
        double avg = (double) (total / COUNT);

        // Did the student pass?
        boolean passed = false;
        if (avg >= 60)
        // Fix: Removed...random semicolon? It obviously messed up the condition.
        // ;
        {
            passed = true;
        }

        // Assign letter grade
        char letter = 'F';
        if (avg >= 90) {
            letter = 'A';
        } else if (avg >= 80) {
            letter = 'B';
        } else if (avg >= 70) {
            letter = 'C';
        } else if (avg >= 60) {
            letter = 'D';
        } else {
            letter = 'F';
        }

        // print summary
        System.out.println("\n----- Report -----");
        System.out.println("Name: " + name);
        System.out.println("Highest single score recorded: " + max);
        System.out.println("Lowest single score recorded: " + min);
        System.out.println("Passed? " + passed);
        System.out.printf("Average: %.2f\n", avg);
        System.out.println("Letter grade: " + letter);

        // close the Scanner object before exiting.
        in.close();
    }
}
