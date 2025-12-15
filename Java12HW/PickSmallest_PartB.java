//Made by Georgio.
public class PickSmallest_PartB {
    public static double Smallest(double a, double b, double c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else if (c < a && c < b) {
            return c;
        } else { // This is if there is no smallest number, because we haven't learned try-catch
                 // yet.
            return -1298129381123914812039102384012931039103.0;
        }
    }

    public static void main(String[] args) {
        System.out.println("The smallest of 10.0, 13.0, and 12.0 is: " + Smallest(10.0, 13.0, 12.0));
        System.out.println("The smallest of 0.0, -5.0, and 1300.0 is: " + Smallest(0.0, -5.0, 1300.0));
        System.out.println("The smallest of 3.0, 1.0, and 1.0 is: " + Smallest(3.0, 1.0, 1.0));

    }
}
