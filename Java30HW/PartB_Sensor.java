public abstract class PartB_Sensor {
  // member variables must be interacted with via setters/getters.
  private String name;
  private int modelNumber;

  // getter for name.
  public String getName() {
    return name;
  }

  // setter for name.
  public void setName(String name) {
    this.name = name;
  }

  // getter for modelNumber.
  public int getModelNumber() {
    return modelNumber;
  }

  // setter for modelNumber.
  public void setModelNumber(int modelNumber) {
    this.modelNumber = modelNumber;
  }

  // must be implemented.
  public abstract void recordMeasurement();

}
