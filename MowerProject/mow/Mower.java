package mow;

public class Mower {
  int xPos, yPos;
  int direction;
  // NOTE: Directions:
  // 0 = up
  // 1 = right
  // 2 = down
  // 3 = left

  // NOTE: Does not contain Yard. Yard must be individually referenced by methods
  // that need it.
  public Mower(int xPos, int yPos, int direction) {
    this.xPos = xPos;
    this.yPos = yPos;
    this.direction = direction;
    checkDirection(); // ensure initialized direction is valid.
  }

  // ensure int direction is in a valid position.
  public void checkDirection() {
    if (direction < 0) {
      direction = 3;
    } else if (direction > 3) {
      direction = 0;
    }
  }

  // get and set x position
  public int getXPosition() {
    return xPos;
  }

  public void setXPosition(int xPos) {
    this.xPos = xPos;
  }

  // get and set y position
  public int getYPosition() {
    return yPos;
  }

  public void setYPosition(int yPos) {
    this.yPos = yPos;
  }

  // get and set direction
  public int getDirection() {
    return direction;
  }

  public void setDirection(int direction) {
    this.direction = direction;
    checkDirection();
  }

  // if neither, return 0.
  // if grass, return 1.
  // if brick, return 2.
  public int checkAhead(Yard yard) {
    char spotCheck = ' '; // the spot to check.

    // set spotCheck.
    switch (direction) {
      case 0:
        spotCheck = yard.getSpace(yPos + 1, xPos);
        break;
      case 1:
        spotCheck = yard.getSpace(yPos, xPos + 1);
        break;
      case 2:
        spotCheck = yard.getSpace(yPos - 1, xPos);
        break;
      case 3:
        spotCheck = yard.getSpace(yPos, xPos - 1);
        break;
    }
    switch (spotCheck) {
      case '+':
        return 1;
      case 'R':
        return 2;
    }
    return 0; // for empty. No need for mower, it is impossible for mower to be found.
  }

  // moves one unit ahead.
  // WARNING: Since this function does not take Yard as an argument, it does not
  // checkAhead(). Use with caution.
  public void move() {
    switch (direction) {
      case 0:
        yPos++;
        break;
      case 1:
        xPos++;
        break;
      case 2:
        yPos--;
        break;
      case 3:
        xPos--;
        break;

    }
  }

  public void cutGrass(Yard yard) {
    yard.setSpace(yPos, xPos, ' ');
  }

}
