public class Manager extends Employee {
  private double bonus;

  public Manager(String name, double salary, double bonus) {
    super(name, salary);
    this.bonus = bonus;
  }

  public double getAnnualIncome() {
    return getSalary() + bonus;
  }
}
