
//By Georgio. No AI-generated or plaigarized content was used. Some outside sources were consulted.
import java.util.Arrays;
//METHOD LIST:
// ->> clearScreen(): wipes terminal screen.
//
// ->> solveCheck(): checks for lose, win, or continue.
// 0 = loss, 1 = win, 2 = continue
//
// ->> printScreen(): prints main minefield
//
// ->> printHidden(): prints the secret key.
// 0 == no adjacent, 1-8 = adjacent number of mines, 10 = flag, negative = mine
//
// ->> populate(): randomly populates minefield with mines.

// IMPORTANT NOTES:
// - Negative integers are used to represent a mine.
// - Positive integers are used to represent nearby mines.
// - 0 means no nearby mines.
// Key array: SOLE purpose of keeping note of which are hidden
// --> 1 = revealed, 0 = hidden, 2 = flag
import java.util.Scanner;

import javax.management.timer.Timer;

public class MineSweep {
    static int rows = 9;
    static int columns = 9;

    public static void clearScreen() { // wipes the terminal screen when called
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int solveCheck(int[][] minefield, int[][] reference) { // checks for game continue, win, or loss
        int count = 0;
        int threshold = rows * columns;
        for (int i = 0; i != rows; i++) {
            for (int r = 0; r != columns; r++) {
                if (reference[i][r] == 1 && (minefield[i][r] < 0)) { // revealed mine
                    return 0;
                } else if (reference[i][r] == 1 || (minefield[i][r] < 0 && reference[i][r] == 2)) { // checked or
                                                                                                    // flagged mine
                    count++;
                }
            }
        }
        if (count == threshold) {
            return 1;
        }
        return 2;
    }

    public static void printScreen(int[][] minefield, int[][] reference) { // prints the terminal screen when called
        System.out.println("      1   2   3   4   5   6   7   8   9   ");
        System.out.println("------------------------------------------");
        for (int i = 0; i < rows; i++) {
            if (i == rows) // because for SOME reason the regular method doesn't work.
                break;
            System.out.printf("%d -  ", i + 1);
            for (int r = 0; i < columns; r++) { // prints depending on condition of cell
                if (r == columns) // see reason above for this stupid piece of code.
                    break;
                if (reference[i][r] == 0)
                    System.out.print("[#] ");
                else if (minefield[i][r] == 0) { // no nearby
                    System.out.print("[ ] ");
                } else if (minefield[i][r] < 0) { // is mine
                    System.out.print("[M] ");
                } else if (minefield[i][r] > 9) {
                    System.out.print("[F] ");
                } else { // number of mines nearby
                    System.out.printf("[%d] ", minefield[i][r]);
                }
            }
            System.out.println("");
        }
    }

    public static void printHidden(int[][] minefield) { // prints the key
        System.out.println("      1   2   3   4   5   6   7   8   9   ");
        System.out.println("------------------------------------------");
        for (int i = 0; i < rows; i++) {
            if (i == rows) // because for SOME reason the regular method doesn't work.
                break;

            System.out.printf("%d -  ", i + 1);
            for (int r = 0; i < columns; r++) { // prints depending on condition of cell
                if (r == columns) // see reason above for this stupid piece of code.
                    break;
                if (minefield[i][r] == 0) { // no nearby
                    System.out.print("[ ] ");
                } else if (minefield[i][r] < 0) { // is mine
                    System.out.print("[M] ");
                } else if (minefield[i][r] > 9) {
                    System.out.print("[F] ");
                } else { // number of mines nearby
                    System.out.printf("[%d] ", minefield[i][r]);
                }
            }
            System.out.println("");

        }
    }

    public static void populate(int[][] minefield, int numMines) { // populates the field with mines
        for (int i = 0; i < numMines; i++) { // picks random spots
            int x = (int) (Math.floor(Math.random() * columns));
            int y = (int) (Math.floor(Math.random() * rows));
            if (minefield[x][y] < 0) { // if already a mine, find a new place
                i--;
            } else { // else set that spot to a mine
                minefield[x][y] = -999;
            }

        }
    }

    public static void validate(int[][] minefield) { // looks for nearby mines. seperated for visibility.
        for (int i = 0; i < minefield.length; i++) {
            for (int r = 0; r < minefield[i].length; r++) { // checks nearby boxes
                // Check order: TL TM TR ML (no MM) MR BL BM BR. Each needs its own check
                if (i > 0 && r > 0) { // TL
                    if (minefield[i - 1][r - 1] < 0)
                        minefield[i][r]++;
                }
                if (i > 0) { // TM
                    if (minefield[i - 1][r] < 0)
                        minefield[i][r]++;
                }
                if (i > 0 && r + 1 < columns) { // TR
                    if (minefield[i - 1][r + 1] < 0)
                        minefield[i][r]++;
                }
                if (r > 0) { // ML
                    if (minefield[i][r - 1] < 0)
                        minefield[i][r]++;
                }
                if (r + 1 < columns) { // MR
                    if (minefield[i][r + 1] < 0)
                        minefield[i][r]++;
                }
                if (i + 1 < rows && r > 0) { // BL
                    if (minefield[i + 1][r - 1] < 0)
                        minefield[i][r]++;
                }
                if (i + 1 < rows) { // BM
                    if (minefield[i + 1][r] < 0)
                        minefield[i][r]++;
                }
                if (i + 1 < rows && r + 1 < columns) { // BR
                    if (minefield[i + 1][r + 1] < 0)
                        minefield[i][r]++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] field = new int[rows][columns]; // main field
        int[][] vision = new int[rows][columns]; // manages visibility. 0 = hidden, 1 = shown
        boolean solved = false;
        boolean gameOver = false;
        int xGuess, yGuess;

        // initialize and show hidden for debug
        populate(field, 10);
        validate(field);
        printHidden(field);
        System.out.println("WIN STATE: " + solveCheck(field, vision));
        System.out.println("Input anything to continue.");
        in.nextLine();

        // begin main sequence
        clearScreen();

        while (true) {
            /*
             * if (solveCheck(field, vision) == 0) { // check for win loss or game over
             * gameOver = true;
             * } else if (solveCheck(field, vision) == 1) {
             * solved = true;
             * gameOver = true;
             * }
             */
            clearScreen();
            printScreen(field, vision);
            System.out.println("Input anything to proceed.");
            in.nextLine();
            System.out.println("Input 'g' to guess a spot, or anything else to exit.");
            char input = in.nextLine().charAt(0);
            if (input == 'g') { // guess a single spot, then redraw
                System.out.print("Please enter a row to guess: ");
                xGuess = in.nextInt() - 1;
                System.out.print("Please enter a column to guess: ");
                yGuess = in.nextInt() - 1;
                vision[xGuess][yGuess] = 1;
                continue;
            }
        }
        // System.out.println("WIN STATE:" + solveCheck(field, vision));
        /*
         * for (int i = 0; i < field.length; i++) {
         * System.out.println(Arrays.toString(field[i])); // debug
         * }
         */

    }
}
