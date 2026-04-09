//Demo program for BaseballCard.java changes.
public class BaseballDemo {
  public static void main(String[] args) {
    BaseballCard card = new BaseballCard("Joe Baseball", 2003);
    BaseballCard similarCard = new BaseballCard("Joe Baseball", 2003);
    BaseballCard differentCard = new BaseballCard("Johnny Baseball", 1996);

    System.out.println(card);
    System.out.println(similarCard);
    System.out.println(differentCard);

    // checks if card and similarCard have same name and year.
    if (card.equals(similarCard)) {
      System.out.println("You have a copy of " + card.getName());
    } else {
      System.out.println(card.getName() + " and " + similarCard.getName() + "are one of a kind!");
    }

    // checks if card and differentCard have different name and year.
    if (card.equals(differentCard)) {
      System.out.println("You have a copy of " + card.getName());
    } else {
      System.out.println(card.getName() + " and " + differentCard.getName() + " are one of a kind!");
    }
  }
}
