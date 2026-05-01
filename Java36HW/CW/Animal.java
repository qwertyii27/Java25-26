import java.util.ArrayList;

public class Animal implements Measurable {
  private String name;
  private double weight;

  public Animal(String name, double weight) {
    this.name = name;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public double getWeight() {
    return weight;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String toString() {
    String s = this.getClass().getName() +
        String.format(" [name = %s, weight (lbs) = %.2f]", name, weight);
    return s;
  }

  public double getMeasure() {
    return weight;
  }

  public static void main(String[] args) {
    ArrayList<Measurable> list = new ArrayList<Measurable>();
    Animal animal = new Animal("boots", 29);
    list.add(animal);
    animal = new Animal("cats", 50);
    list.add(animal);
    animal = new Animal("gato", 15);

    System.out.printf("%.2f", Measurable.calcAvg(list));
  }
}
