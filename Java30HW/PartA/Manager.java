public class Manager extends Employee {
    private double bonus;

    /*
     * Constructor.
     */
    public Manager(String name, double salary, double bonus) {
        // invoke the parent class' constructor.
        super(name, salary);

        // initialize the child class' members.
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double newBonus) {
        bonus = newBonus;
    }

    /*
     * Override the annual income method.
     */
    public double getAnnualIncome() {
        return super.getAnnualIncome() + getBonus();
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.printf("  Bonus  = $%,12.2f%n", bonus);
    }
}
