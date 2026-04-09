public class Card {
  private char face;
  private char rank;

  // NOTE: Unicode characters for suits.
  char spade = '\u2660'; // ♠
  char heart = '\u2661'; // ♡
  char club = '\u2663'; // ♣
  char diamond = '\u2662'; // ♢

  public enum faceEnum {
    HEART,
    DIAMOND,
    SPADE,
    CLUB
  }

  public enum rankEnum {
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING,
    ACE
  }

  // constructor that randomly sets suit and rank
  public Card() {
    // get random suit and rank
    int rdmFace = (int) (Math.floor(Math.random() * 4) + 1);
    int rdmRank = (int) (Math.floor(Math.random() * 13) + 1);

    switch (rdmFace) {
      case 1:
        setFace(faceEnum.HEART);
        break;
      case 2:
        setFace(faceEnum.DIAMOND);
        break;
      case 3:
        setFace(faceEnum.SPADE);
        break;
      case 4:
        setFace(faceEnum.CLUB);
        break;
    }
    switch (rdmRank) {
      case 1:
        setRank(rankEnum.ACE);
        break;
      case 2:
        setRank(rankEnum.TWO);
        break;
      case 3:
        setRank(rankEnum.THREE);
        break;
      case 4:
        setRank(rankEnum.FOUR);
        break;
      case 5:
        setRank(rankEnum.FIVE);
        break;
      case 6:
        setRank(rankEnum.SIX);
        break;
      case 7:
        setRank(rankEnum.SEVEN);
        break;
      case 8:
        setRank(rankEnum.EIGHT);
        break;
      case 9:
        setRank(rankEnum.NINE);
        break;
      case 10:
        setRank(rankEnum.TEN);
        break;
      case 11:
        setRank(rankEnum.JACK);
        break;
      case 12:
        setRank(rankEnum.QUEEN);
        break;
      case 13:
        setRank(rankEnum.KING);
        break;
    }
  }

  // constructor that allows suit and rank to be set
  public Card(rankEnum rank, faceEnum face) {
    setRank(rank);
    setFace(face);
  }

  // return suit
  public char getFace() {
    return face;
  }

  // set suit
  public void setFace(faceEnum face) {
    switch (face) {
      case HEART:
        this.face = heart;
        break;
      case CLUB:
        this.face = club;
        break;
      case DIAMOND:
        this.face = diamond;
        break;
      case SPADE:
        this.face = spade;
    }
  }

  // return rank
  public char getRank() {
    return rank;
  }

  // set rank
  public void setRank(rankEnum rank) {
    switch (rank) {
      case TWO:
        this.rank = '2';
        break;
      case THREE:
        this.rank = '3';
        break;
      case FOUR:
        this.rank = '4';
        break;
      case FIVE:
        this.rank = '5';
        break;
      case SIX:
        this.rank = '6';
        break;
      case SEVEN:
        this.rank = '7';
        break;
      case EIGHT:
        this.rank = '8';
        break;
      case NINE:
        this.rank = '9';
        break;
      case TEN:
        this.rank = 'T';
        break;
      case JACK:
        this.rank = 'J';
        break;
      case QUEEN:
        this.rank = 'Q';
        break;
      case KING:
        this.rank = 'K';
        break;
      case ACE:
        this.rank = 'A';
        break;
    }
  }

  // get the entire card.
  public String getString() {
    return Character.toString(getRank()) + Character.toString(getFace());
  }

  // NOTE: Test program.
  public static void main(String[] args) {
    Card twoOfSpades = new Card(rankEnum.TWO, faceEnum.SPADE);
    System.out.println("Two of Spades: " + twoOfSpades.getRank() + twoOfSpades.getFace());

    for (int i = 0; i < 10; i++) {
      Card rdmCard = new Card();
      System.out.printf("%s%s%n", rdmCard.getRank(), rdmCard.getFace());
    }
    for (int i = 0; i < 10; i++) {
      Card rdmCard = new Card();
      System.out.println(rdmCard.getString());
    }
  }
}
