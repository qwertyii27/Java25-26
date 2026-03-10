import java.time.LocalDate;
import java.time.LocalTime;
// the package needed for this program had the two classes LocalDate and LocalTime java.time. the "time" package
// contains classes with time-related methods, and its parent package is the java package.

public class PartA_DateTime {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();

    System.out.println(date);
    System.out.println(time);
  }
}
