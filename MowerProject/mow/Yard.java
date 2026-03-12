package mow;

// + = unmowed
// R = wall
// empty is mowed
class Yard {
  int height;
  int width;

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  public Yard(int height, int width) {
    // add buffer for fence
    this.height = height + 2;
    this.width = width + 2;

    // initialize array
    char[][] yardArr = new char[this.height][this.width];

  
    public char findSpace(int height, int width) {
    return yardArr[height][width];
  }

    // establish lawn
    for (int i = 0; i < this.height; i++) {
      for (int r = 0; r < this.width; r++) {
        yardArr[i][r] = '+';
      }
    }

    // establish brick fence
    for (int i = 0; i < this.width; i++) {
      yardArr[0][i] = 'R';
      yardArr[this.height][i] = 'R';
    }

    for (int i = 0; i < this.height; i++) {
      yardArr[i][0] = 'R';
      yardArr[i][this.width] = 'R';
    }

  }
}
