public class Pie_Sale {
    public static void main(String[] args) {
        final double piePrice = 10.00;
        int piesPurchased = 3;
        double discount = (piesPurchased >= 3) ? 0.9 : 1;

        System.out.println("Discount: " + discount + "%!");

    }
}