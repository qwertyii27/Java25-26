import java.util.Scanner;

public class Die {
  private int number;

  public Die(int startNum) {
    number = startNum;
  }

  public Die() {
    number = (int) Math.round((Math.random() + 1.0) * 3.0);
  }

  public void read() {
    switch (number) {
      case 1:
        System.out.printf("+-------+%n|       |%n|   0   |%n|       |%n+-------+");
        break;
      case 2:
        System.out.printf("+-------+%n| 0     |%n|       |%n|     0 |%n+-------+");
        break;
      case 3:
        System.out.printf("+-------+%n| 0     |%n|   0   |%n|     0 |%n+-------+");
        break;
      case 4:
        System.out.printf("+-------+%n| 0   0 |%n|       |%n| 0   0 |%n+-------+");
        break;
      case 5:
        System.out.printf("+-------+%n| 0   0 |%n|   0   |%n| 0   0 |%n+-------+");
        break;
      case 6:
        System.out.printf("+-------+%n| 0   0 |%n| 0   0 |%n| 0   0 |%n+-------+");
        break;
    }
  }

  public void roll() {
    number = (int) Math.round((Math.random() + 1.0) * 3.0);
  }

  public void set(int numberToSet) {
    if (number > 0 && number < 7)
      number = numberToSet;
    else
      System.err.println("Pick a valid number between 1 and 6!");
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Die die;
    System.out.println(
        "Type an integer to initialize the die with that number, or anything else to initialize it randomly: ");
    if (in.hasNextInt()) {
      die = new Die(in.nextInt());
    } else {
      die = new Die();
    }
    while (in.hasNextLine()) {
      in.nextLine();
    }
    while (true) {
      System.out.println("Type 'r' to roll, 'q' to quit, 's' to set, or 'd' to display.");
      char input = in.next().charAt(0);
      while (in.hasNextLine()) { // excess input removal
        in.nextLine();
      }
      if (input == 'r') { // roll the dice
        die.roll();
      } else if (input == 'd') { // display the dice
        die.read();
      } else if (input == 's') { // set a dice
        System.out.println("What number would you like to set it to?");
        if (in.hasNextInt()) {
          die.set(in.nextInt());
        } else {
          System.out.println("Please enter an integer.");
          continue;
        }
      } else if (input == 'q') {
        in.close();
        return;
      } else {
        System.out.println("Invalid input.");
        break;
      }

    }
    in.close();
  }
}
