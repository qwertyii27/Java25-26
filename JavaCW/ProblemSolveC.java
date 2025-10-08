/*Given a series of blocks 5" wide, write a program that finds how big the gap on each
 * end of the wall would be with a given width, also show how many each of black and 
 * white tiles there are when the start and end is a black tile.
 * 
 * I plan to solve the first part by finding the quotient of tiles needed and dividing
 * by 2. The number of black tiles is the tiles divided by two plus one, while white
 * is just the number of tiles divided bt two.
 *  */

import java.util.Scanner;

public class ProblemSolveC {
    public static void main(String[] args) {
        // declare variables
        final double TILE_WIDTH = 5.0;
        double roomWidth;
        double wallGap;
        int numTiles;
        int numPairs;
        int b;
        int w;

        // ask roomWidth
        Scanner in = new Scanner(System.in);
        System.out.println("How wide is the room in inches (minimum of 15)?");
        roomWidth = in.nextDouble();

        // get numTiles and pairs
        numTiles = (int) (roomWidth / 5);
        numPairs = (int) (numTiles /2);
        System.out.println("There are " + numTiles + " tiles!");

        // get gap
        wallGap = 
    }
}
