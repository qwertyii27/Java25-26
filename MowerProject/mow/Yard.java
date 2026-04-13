
package mow;

public class Yard {
  private int height;
  private int width;
  public char[][] yardArr;
  // NOTE: Yard is formatted as yard[yPos][xPos].
  // Character meanings:
  // + = unmowed
  // R = wall
  // empty is mowed

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  public char getSpace(int height, int width) {
    return yardArr[height][width];
  }

  public void setSpace(int height, int width, char value) {
    yardArr[height][width] = value;
  }

  // prints out the lawn.
  public void printLawn(Mower mower) {
    clearScreen();
    for (int i = 0; i < this.height; i++) {
      for (int r = 0; r < this.width; r++) {
        // System.out.printf("%n%d %d", i, r);
        if (mower.getYPosition() == i && mower.getXPosition() == r) { // checks for mower on space.
          switch (mower.getDirection()) {
            case 0:
              System.out.print("v");
              break;
            case 1:
              System.out.print(">");
              break;
            case 2:
              System.out.print("^");
              break;
            case 3:
              System.out.print("<");
              break;
          }
        } else {
          System.out.print(yardArr[i][r]);
        }
      }
      System.out.println();
    }
  }

  public Yard(int height, int width) {
    // add buffer for fence
    this.height = height + 2;
    this.width = width + 2;

    // initialize array
    yardArr = new char[this.height][this.width];

    // establish lawn
    for (int i = 0; i < this.height; i++) {
      for (int r = 0; r < this.width; r++) {
        yardArr[i][r] = '+';
      }
    }

    // establish brick fence
    for (int i = 0; i < this.width; i++) {
      yardArr[0][i] = 'R';
      yardArr[this.height - 1][i] = 'R';
    }

    for (int i = 0; i < this.height - 1; i++) {
      yardArr[i][0] = 'R';
      yardArr[i][this.width - 1] = 'R';
    }

  }

}
