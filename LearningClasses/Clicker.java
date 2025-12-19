public class Clicker {
    // constructor
    public Clicker() {
        value = 0;
    }

    public Clicker(int value) {
        if (value >= 0 && value <= 9999) {
            this.value = value;
        }
    }

    private int value = 0;

    public int look() {
        return value;
    }

    public void click() {
        value++;
        if (value > 9999) {
            value = 0;
        }
    }

    public void reset() {
    }

    public static void main(String[] args) {
        Clicker c = new Clicker();
        for (int i = 0; i < 3; i++) {
            c.click();
            System.out.printf("Count is %d%n", c.look());
        }

    }
}