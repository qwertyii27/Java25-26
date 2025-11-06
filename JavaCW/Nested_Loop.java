public class Nested_Loop {
    public static void main(String[] args) {
        for (int r = 1; r <= 3; r++) { // rows is r
            for (int c = 1; c <= 3; c++) { // columns is c
                System.out.printf("%4d   ", c * r);
            }
            System.out.println("");
        }
    }
}
