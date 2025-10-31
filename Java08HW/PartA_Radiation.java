//By georgio
//I searched up decay functions to test this one.
public class PartA_Radiation {
    public static void main(String[] args) {
        double remaining = 100;
        int i = 0;
        while (remaining > 1) {
            remaining = remaining * 1 / 2;
            i++;
        }
        System.out.printf("Remaining material: %.2f percent%n", remaining);
        System.out.printf("Years taken to reach this point: %d%n", i * 30);

    }
}