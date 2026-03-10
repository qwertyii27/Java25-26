import java.util.ArrayList;

import zoo.*;

public class Zoo {
  public static double totalAnimalWeight = 0;
  public static double hayConsumed = 0;
  public static double fishConsumed = 0;

  public static void trackAnimalWeight(Mammal mammal) {
    totalAnimalWeight = totalAnimalWeight + mammal.getWeight();
  }

  public static void resetAnimalWeight() {
    totalAnimalWeight = 0;
  }

  public static void trackHay(Bovine bovine) {
    hayConsumed = hayConsumed + bovine.getHayConsumed();
  }

  public static void resetHayConsumed() {
    hayConsumed = 0;
  }

  public static void trackFish(MarineMammal mm) {
    fishConsumed = fishConsumed + mm.getFishConsumed();
  }

  public static void resetFishConsumed() {
    fishConsumed = 0;
  }

  public static void main(String[] args) {
    // we have two buffalo.
    Bovine b1 = new Bovine("Lewis", 1000);
    Bovine b2 = new Bovine("Clark", 850);

    // we have two dolphins.
    MarineMammal d1 = new MarineMammal("Clara", 350);
    MarineMammal d2 = new MarineMammal("Beau", 375);

    // feed buffalo.
    b1.feedHay(100);
    b2.feedHay(150);

    // a buffalo got heavier.
    b2.setWeight(875);

    // feed dolphin
    d1.feedFish(50);
    d2.feedFish(75);

    // track the total weight of all of the animals.
    trackAnimalWeight(b1);
    trackAnimalWeight(b2);
    trackAnimalWeight(d1);
    trackAnimalWeight(d2);
    System.out.println("The total weight of all of the animals in the zoo equals "
        + totalAnimalWeight + " pounds.");

    // figure out much hay the animals ate.
    trackHay(b1);
    trackHay(b2);
    System.out.println("The total weight of hay consumed equals "
        + hayConsumed + " pounds.");

    // figure out much fish the animals ate.
    trackFish(d1);
    trackFish(d2);
    System.out.println("The total weight of fish consumed equals "
        + fishConsumed + " pounds.");
  }
}
