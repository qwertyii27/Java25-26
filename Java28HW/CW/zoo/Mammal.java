package zoo;

public class Mammal {
  private String name;
  private double weight;

  /*
   * Constructor.
   */
  public Mammal(String name, double weight) {
    this.name = name;
    this.weight = weight;
  }

  public void setName(String newName) {
    name = newName;
  }

  public String getName() {
    return name;
  }

  public void setWeight(double newWeight) {
    weight = newWeight;
  }

  public double getWeight() {
    return weight;
  }

}
