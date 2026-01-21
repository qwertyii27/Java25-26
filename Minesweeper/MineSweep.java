
//By Georgio. No AI-generated or plaigarized content was used. Some outside sources were consulted.
import java.util.Arrays;
// IMPORTANT NOTES:
// - Negative integers are used to represent a mine.
// - Positive integers are used to represent nearby mines.
// - 0 means no nearby mines.
// TBD make another 2D array with the SOLE purpose of keeping note of which are hidden
// --> 1 = revealed, 0 = hidden
// TBD extend mine validation for bottom 3 tiles

public class MineSweep {
    static int rows = 8;
    static int columns = 8;

    public static void clearScreen() { // wipes the terminal screen when called
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printScreen(int[][] minefield) { // prints the terminal screen when called
        System.out.println("      1   2   3   4   5   6   7   8");
        System.out.println("------------------------------------");
        for (int i = 0; i < rows; i++) {
            if (i == 8) // because for SOME reason the regular method doesn't work.
                break;
            System.out.printf("%d -  ", i + 1);
            for (int r = 0; i < columns; r++) { // prints depending on condition of cell
                if (r == 8) // see reason above for this stupid piece of code.
                    break;
                if (minefield[i][r] == 0) { // no nearby
                    System.out.print("[ ] ");
                } else if (minefield[i][r] < 0) { // is mine
                    System.out.print("[M] ");
                } else { // number of mines nearby
                    System.out.printf("[%d] ", minefield[i][r]);
                }
            }
            System.out.println("");

        }
    }

    public static void populate(int[][] minefield, int numMines) { // resets and populates the field with mines
        Arrays.fill(minefield[0], 0);
        for (int i = 0; i < numMines; i++) { // picks random spots
            int x = (int) (Math.floor(Math.random() * 8));
            int y = (int) (Math.floor(Math.random() * 8));
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
        int[][] field = new int[rows][columns];
        for (int i = 0; i < field.length; i++) {
            System.out.println(Arrays.toString(field[i])); // debug
        }
        populate(field, 10);
        validate(field);
        printScreen(field);

    }
}
