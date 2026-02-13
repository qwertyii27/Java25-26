public class ClassReview {
  // member variables
  private int count = 0;

  // Create public interface.
  public void click() {
    count++;
    if (count > 9999) {
      count = 0;
    }
  }

  public void reset() {
    count = 0;
  }

  public int read() {
    return count;
  }

  public static void main(String[] args) {
    ClassReview myCount = new ClassReview();
    System.out.println("current count =" + myCount.read());
    myCount.click();
    myCount.click();
    System.out.println("current count =" + myCount.read());
  }

}
