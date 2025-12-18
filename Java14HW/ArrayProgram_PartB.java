public class ArrayProgram_PartB {
    public static void main(String[] args) {
        double[] numbers = { 2.2, 1.0, 3.7, 4.1, 88.0 };
        double number = 0;
        for (double x : numbers) {
            System.out.println(x);
            number = number + x;
        }
        number = number / numbers.length;
        System.out.println("Average is " + number);
    }
}
