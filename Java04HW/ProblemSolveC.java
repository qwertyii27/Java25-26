/*By Georgio. Given a series of blocks 5" wide, write a program that finds how big the gap on each
 * end of the wall would be with a given width, also show how many each of black and 
 * white tiles there are when the start and end is a black tile.
 *  */

import java.util.Scanner;

public class ProblemSolveC {
    public static void main(String[] args) {
        // declare variables
        final double TILE_WIDTH = 5.0; // inches
        double roomWidth; // to inches
        double wallGap; // on either side
        int numTiles;
        int wTile;
        int bTile;
        int middleTile;
        int realTile;

        // ask roomWidth
        Scanner in = new Scanner(System.in);
        System.out.print("How wide is the room in inches (minimum of 15): ");
        roomWidth = in.nextDouble();

        // get numTiles
        numTiles = (int) (roomWidth / 5);

        // calculate for color tiles
        middleTile = numTiles - 2;
        if ((numTiles % 2) != 0) { // check for odds or evens
            wTile = (middleTile / 2) + 1;
            bTile = (middleTile / 2) + 2;
        } else {
            wTile = (middleTile / 2);
            bTile = (middleTile / 2) + 1;
            System.out.println("One tile is being sacrificed for even-ness.");
        }
        // get realTile, wallGap
        realTile = bTile + wTile;
        wallGap = (roomWidth - (realTile * 5)) / 2;
        /*
         * debugging
         * System.out.println("tiles" + realTile);
         * System.out.println("gap" + wallGap);
         * System.out.println("black" + bTile);
         * System.out.println("white" + wTile);
         */
        System.out.println("Total tiles: " + realTile);
        System.out.println("Black tiles: " + bTile);
        System.out.println("White tiles: " + wTile);
        System.out.println("Wall gap on either side: " + wallGap);
    }
}
