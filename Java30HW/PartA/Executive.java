public class Executive extends Manager {
  // stock shares.
  private double shares;

  // Constructor.
  public Executive(String name, double salary, double bonus, double shares) {
    // uses Manager's constructor.
    super(name, salary, bonus);
    // sets class shares to temp shares.
    this.shares = shares;
  }

  // get executive's current stock shares as double.
  public double getShares() {
    return shares;
  }

  // set executive's stock shares to specified amount.
  public void setShares(double shares) {
    this.shares = shares;
  }

  // override displayInfo to include shares.
  public void displayInfo() {
    super.displayInfo();
    System.out.printf("  Shares  = %%%,12.2f%n", shares);
  }
}
