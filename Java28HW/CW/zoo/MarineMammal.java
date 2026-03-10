package zoo;

public class MarineMammal extends Mammal {
  private double fishConsumed;

  public MarineMammal(String name, double weight) {
    super(name, weight);
    this.fishConsumed = 0;
  }

  public void feedFish(double pounds) {
    fishConsumed = fishConsumed + pounds;
  }

  public double getFishConsumed() {
    return fishConsumed; // in pounds.
  }
}
