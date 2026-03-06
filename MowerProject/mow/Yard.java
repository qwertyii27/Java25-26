package mow;

// + = unmowed
// R = wall
// empty is mowed
class Yard {
  int height;
  int width;

  public Yard(int height, int width) {
    // add buffer for fence
    this.height = height + 2;
    this.width = width + 2;

    // initialize array
    char[][] yardArr = new char[this.height][this.width];

    for (int i = 0; i < this.width; i++) {
      yardArr[0][i] = 'R';
      yardArr[this.height][i] = 'R';
    }

    for (int i = 0; i < this.width; i++) {
    }

  }
}
