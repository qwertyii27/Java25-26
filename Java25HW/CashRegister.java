import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CashRegister {
  ArrayList<Double> salesTotal = new ArrayList<Double>();

  public int getCount() {
    return salesTotal.size();
  }

  public double getTotal() {
    double total = 0;
    for (double price : salesTotal) {
      total += price;
    }
    return total;
  }

  public void addItem(double price) {
    salesTotal.add(price);
  }

  public void clear() {
    salesTotal.clear();
  }

  public void removeItem() {
    if (salesTotal.size() > 0)
      salesTotal.remove(salesTotal.size() - 1);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    CashRegister register = new CashRegister();

    while (true) {
      System.out.println(
          "Enter a double to add a price, 't' to display totals, 'd' to delete entry, 'c' to clear total, or 'q' to quit.");
      try {
        register.addItem(in.nextDouble());
      } catch (InputMismatchException e) {
        char input = in.nextLine().charAt(0);
        switch (input) {
          case 't':
            System.out.printf("%n Total Price: %.2f%nItem Count: %d%n", register.getTotal(), register.getCount());
            continue;
          case 'd':
            register.removeItem();
            continue;
          case 'c':
            register.clear();
            continue;
        }
        if (input == 'q')
          break;
      }
    }
    in.close();
  }
}
