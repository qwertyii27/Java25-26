import java.util.ArrayList;

public class Animal implements Comparable<Animal> {
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

  public static double calcAvg(ArrayList<Animal> list) {
    double sum = 0;
    if (list.size() == 0) {
      return 0;
    }
    for (Animal animal : list) {
      sum = sum + animal.getWeight();
    }
    return sum / list.size();
  }

  // Note: We already did this in class with BankAccount, so I used basically the
  // same method with different variable names.
  public int compareTo(Animal o) {
    final double SMALL_NUMBER = 1.0e-100;
    if (Math.abs(this.weight - o.weight) < SMALL_NUMBER) {
      return 0;
    } else if (this.weight < o.weight) {
      return -1;
    } else {
      return +1;
    }
  }

  public static void main(String[] args) {
    Comparable alpaca = new Animal("Alfred the Alpaca", 35);
    Comparable dog = new Animal("Doug the Dog", 10);
    System.out.println(dog.compareTo(alpaca));
  }
}
