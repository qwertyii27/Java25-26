package mow;

public class PartB_Demo {

  public static void main(String[] args) {
    Yard yard = new Yard(10, 10);
    Mower mower = new Mower(1, 1, 1);
    while (true) {
      clearScreen();
      mower.cutGrass(yard);
      if (mower.checkAhead(yard) == 2) { // if reached wall.
        break;
      }
      mower.move();
      yard.printLawn(mower);
      delay(2000);
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
