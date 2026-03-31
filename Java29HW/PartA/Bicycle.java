public class Bicycle {
  private int speed; //
  private final int MAX_SPEED = 30;

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int newSpeed) {
    speed = newSpeed;
  }

  public void pedal() {
    // increase the virtual speed of the bicycle.
    speed = speed + 1;
    if (speed > MAX_SPEED) {
      speed = MAX_SPEED;
    }
  }

  public void brake() {
    speed = speed - 1;
    if (speed < 0) {
      speed = 0;
    }
  }

  public void display() {
    System.out.printf("Speed = %02d MPH%n", getSpeed());
  }
}
