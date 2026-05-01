import java.util.ArrayList;

public class BankAccount implements Measurable {
  private int id;
  private double balance;

  public BankAccount(int id, double balance) {
    this.id = id;
    this.balance = balance;
  }

  public int getID() {
    return id;
  }

  public double getBalance() {
    return balance;
  }

  public void setID(int id) {
    this.id = id;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String toString() {
    String s = this.getClass().getName()
        + String.format(" [ID = %04d, balance = $%,9.02f]", id, balance);
    return s;
  }

  public double getMeasure() {
    return balance;
  }

  public static void main(String[] args) {
    ArrayList<Measurable> list = new ArrayList<Measurable>();
    BankAccount dan = new BankAccount(301, 50000);
    BankAccount aidan = new BankAccount(202, -100);
    BankAccount parker = new BankAccount(564, 300000);
    list.add(dan);
    list.add(aidan);
    list.add(parker);
    System.out.printf("$%,.2f", Measurable.calcAvg(list));
  }

}
