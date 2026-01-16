public class PrintingDimensions_PartB {
    public static void printArr(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = {
                { 8, 6, 7 },
                { 5, 3, 0 }
        };
        int[][] arr2 = {
                { 0, 7, 6, 5 },
                { 2, 2, 0, 1 },
                { 8, 4, 5, 7 }
        };
        System.out.println("Array 1: ");
        printArr(arr1);
        System.out.println();
        System.out.println("Array 2: ");
        printArr(arr2);
    }
}
