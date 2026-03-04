package mystuff;

public class Random {

  // gets a random integer from 1 to this range.
  public static int getRandomInteger(int maxRange) {
    return (int) (Math.random() * (maxRange - 1) + 1);
  }
}
