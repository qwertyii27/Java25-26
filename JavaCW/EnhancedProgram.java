public class EnhancedProgram {
    public static void main(String[] args) {
        double[] numbers = { 8, 6, 7, 5, 3, 0, 9 };
        double sum = 0;
        for (double currVal : numbers) {
            sum = sum + currVal;
        }
        sum = sum / numbers.length;
        System.out.println(sum);
    }
}
