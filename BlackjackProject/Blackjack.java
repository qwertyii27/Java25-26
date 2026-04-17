import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {
  public ArrayList<Card> playerHand;

  public static void main(String[] args) {
    boolean playerLose = false;
    boolean playerWin = false;
    while (true) { // main restart loop.
      ArrayList<Card> dealerHand = new ArrayList<Card>();
      ArrayList<Card> playerHand = new ArrayList<Card>();
      Scanner in = new Scanner(System.in);

      // deals first and second card to both.
      dealerHand.add(deal());
      dealerHand.add(deal());
      playerHand.add(deal());
      playerHand.add(deal());

      // Debug output.
      // String dealerString = "Dealer: " + getHand(dealerHand) +
      // getHandValue(dealerHand) + dealerHand.size();
      // String playerString = "Player: " + getHand(playerHand) +
      // getHandValue(playerHand) + playerHand.size();
      // System.out.println(dealerString);
      // System.out.println(playerString);

      while (!playerWin && !playerLose) { // main playing loop.

        // print info.
        System.out.println("Dealer: " + dealerHand.get(0).getString() + " ##");
        System.out.println("Player: " + getHand(playerHand));

        // check for bust or 21.
        if (getHandValue(playerHand) > 21) {
          System.out.println("You went over 21! Lose!");
          playerLose = true;
          continue;
        } else if (getHandValue(playerHand) == 21) {
          System.out.println("You got 21! Win!");
          playerWin = true;
          continue;
        }

        // get input.
        System.out.println("Type H to hit or S to stand.");
        char response = Character.toUpperCase(in.next().charAt(0));

        // clear screen.
        clearScreen();

        // deal if hit, move onto dealer if stand.
        if (response == 'H') {
          playerHand.add(deal());
        } else if (response == 'S') {
          break;
        }
      }
      if (!playerLose && !playerWin) { // dealer section.
        delay(3000);
        clearScreen();
        System.out.println("Dealer: " + getHand(dealerHand));
        System.out.println("Player: " + getHand(playerHand));
        if (getHandValue(dealerHand) > getHandValue(playerHand)) { // if second card won alone.
          playerLose = true;
          continue;
        }
        // dealers traditionally stop at 17, even if they lose.
        while (getHandValue(dealerHand) < 17 && !playerWin && !playerLose) {
          delay(3000);
          clearScreen();
          // add card.
          dealerHand.add(deal());
          // print info.
          System.out.println("Dealer: " + getHand(dealerHand));
          System.out.println("Player: " + getHand(playerHand));

          // check for dealer bust or 21.
          if (getHandValue(dealerHand) > 21) {
            System.out.println("Dealer bust! Win!");
            playerWin = true;
            continue;
          } else if (getHandValue(dealerHand) == 21) {
            System.out.println("Dealer got 21! Lose!");
            playerLose = true;
            continue;
          }
        }
        // makes checks for winner if dealer stands.
        if (!playerLose && !playerWin && getHandValue(playerHand) < 21 && getHandValue(dealerHand) < 21)
          if (getHandValue(dealerHand) > getHandValue(playerHand)) {
            System.out.println("Dealer's hand wins. Lose!");
            playerLose = true;
          } else if (getHandValue(dealerHand) < getHandValue(playerHand)) {
            System.out.println("Your hand wins. Win!");
            playerWin = true;
          } else {
            System.out.println("Both hands are equal! Tie!");
          }
      }
      System.out.println("Play again? Y (yes) or N (no)?");
      char response = Character.toUpperCase(in.next().charAt(0));
      if (response == 'N')
        break;
      playerLose = false; // resets for next hand.
      playerWin = false; // same here.
      clearScreen();
    }
    clearScreen();
  }

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void delay(long msec) {
    try {
      Thread.sleep(msec);
    } catch (Exception e) {

    }
  }

  // draws a random card from an infinite deck.
  public static Card deal() {
    Card card = new Card();
    return card;
  }

  // a method intended to make a printable version of a hand.
  public static String getHand(ArrayList<Card> hand) {
    String handString = " ";
    for (int i = 0; i < hand.size(); i++) {
      handString += hand.get(i).getString() + " ";
    }
    return handString;
  }

  // gets card's value based on rank.
  // NOTE: Always returns 11 on an ace. It is the following method's
  // responsibility to
  // adjust for bust scenarios.
  public static int getValue(Card card) {
    switch (card.getRank()) {
      case '2':
        return 2;
      case '3':
        return 3;
      case '4':
        return 4;
      case '5':
        return 5;
      case '6':
        return 6;
      case '7':
        return 7;
      case '8':
        return 8;
      case '9':
        return 9;
      case '0':
        return 10;
      case 'J':
        return 10;
      case 'Q':
        return 10;
      case 'K':
        return 10;
      case 'A':
        return 11;
      default:
        return 0; // This is impossible. It's an enum.
    }
  }

  // Calculates the value of a hand, compensating for busts with aces.
  public static int getHandValue(ArrayList<Card> hand) {
    boolean hasAce = false;
    int total = 0;
    for (int i = 0; i < hand.size(); i++) {
      Card newCard = hand.get(i);
      int newCardVal = getValue(newCard);
      if (newCardVal == 11)
        hasAce = true;
      total += newCardVal;
    }
    if (total > 21 && hasAce) // if bust and has ace, ace is equal to 1 instead of 11.
      total -= 10;
    return total;
  }

}
