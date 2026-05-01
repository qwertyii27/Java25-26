import java.util.ArrayList;

public interface Measurable {

  double getMeasure();

  public static double calcAvg(ArrayList<Measurable> list) {
    // this static method will calculate and return the average measurement form a
    // list of measurable object.
    if (list.size() == 0) {
      throw new IllegalArgumentException("Your list is empty!");
    }
    double sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i).getMeasure();
    }

    double avg = sum / list.size();
    return avg;
  }
}
