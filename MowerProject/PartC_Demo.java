import mow.*;

public class PartC_Demo {

  public static void main(String[] args) {
    Yard yard = new Yard(10, 10);
    Mower mower = new Mower(yard);
    while (true) { // get to a wall
      clearScreen();
      mower.cutGrass(yard);
      if (mower.checkAhead(yard) == 2) { // if reached wall, turn clockwise.
        mower.setDirection(mower.getDirection() + 1);
        break;
      }
      mower.move();
      yard.printLawn(mower);
      delay(500);
    }

    boolean turned = false;
    while (true) { // get to a wall
      clearScreen();
      mower.cutGrass(yard);

      if (mower.checkAhead(yard) == 0) { // if reached nothing, turn clockwise.
        mower.setDirection(mower.getDirection() + 1);
        turned = true;
        if (turned)
          continue;
        break;
      }
      if (mower.checkAhead(yard) == 2) { // if reached wall, turn clockwise.
        mower.setDirection(mower.getDirection() + 1);
        continue;
      }
      turned = false;
      mower.move();
      yard.printLawn(mower);
      delay(500);
    }

  }

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void delay(long mseconds) {
    try {
      Thread.sleep(mseconds);
    } catch (InterruptedException e) {
      System.err.println("InterruptedException received!");
    }
  }

}
