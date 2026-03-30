public class PartA_GearedBicycle extends Bicycle {
  final int MAX_GEAR = 6;
  final int MIN_GEAR = 1;
  final int GEARED_MAX_SPEED = 60;
  int gear;

  public PartA_GearedBicycle() {
    super();
    gear = 1;
  }

  public int getGear() {
    return gear;
  }

  public void setGear(int newGear) {
    gear = newGear;
    if (gear > MAX_GEAR) {
      gear = MAX_GEAR;
    } else if (gear < MIN_GEAR) {
      gear = MIN_GEAR;
    }
  }

  public void shiftUp() {
    gear++;
    if (gear > MAX_GEAR)
      gear = MAX_GEAR;
  }

  public void shiftDown() {
    gear--;
    if (gear < MIN_GEAR) {
      gear = MIN_GEAR;
    }
  }

  public void pedal() {
    setSpeed(getSpeed() + getGear());
    if (getSpeed() > GEARED_MAX_SPEED) {
      setSpeed(GEARED_MAX_SPEED);
    }
  }

  public void brake() {
    setSpeed(getSpeed() - getGear());
    if (getSpeed() < 0) {
      setSpeed(0);
    }
  }

  public void display() {
    super.display();
    System.out.printf("Gear = %02d %n", getGear());
  }

  public static void main(String[] args) {
    PartA_GearedBicycle gearedBike = new PartA_GearedBicycle();
    Bicycle normalBike = new Bicycle();

    System.out.println("A normal and a geared bicycle are traveling side by side.");
    System.out.println("Normal Bike:");
    normalBike.display();
    System.out.println("Geared Bike:");
    gearedBike.display();
    System.out.println();
    System.out.println("Both are standing still. They will now pedal.");
    for (int i = 0; i < 3; i++) {
      gearedBike.shiftUp();
      gearedBike.pedal();
      normalBike.pedal();
    }
    System.out.println("Normal Bike:");
    normalBike.display();
    System.out.println("Geared Bike:");
    gearedBike.display();
    System.out.println();
    System.out.println("Now they will brake.");
    while (normalBike.getSpeed() != 0) {
      normalBike.brake();
      gearedBike.brake();
      gearedBike.shiftDown();
    }
    System.out.println("Normal Bike:");
    normalBike.display();
    System.out.println("Geared Bike:");
    gearedBike.display();
  }
}
