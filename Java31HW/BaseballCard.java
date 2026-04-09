public class BaseballCard {
  String name; // the name of the player on the card.
  int year; // the year the card was issued.

  public BaseballCard(String name, int year) {
    this.name = name;
    this.year = year;
  }

  public String getName() {
    return name;
  }

  public int getYear() {
    return year;
  }

  public String toString() {
    return getClass().getName() + "[name: " + this.name + ", year: " + this.year + "]";
  }

  public boolean equals(Object obj) {
    if (obj.getClass() != this.getClass()) {
      return false;
    }
    BaseballCard card2 = (BaseballCard) obj;
    if (this.name.equals(card2.name) && this.year == card2.year) {
      return true;
    } else {
      return false;
    }
  }

}
