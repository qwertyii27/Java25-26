import mystuff.Random;

public class DemoApp {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.printf("Number #%d: %d%n", i, Random.getRandomInteger(100));
    }
  }
}
