// By Georgio, no external help or AI. The program essentially gets an array of varying sizes,
//fills the array with a rdm int between 1 and array length, and uses both linear and binary
//search, comparing the time for each.

/* Notes:
As I predicted, binary search takes magnitudes less time to complete than linear. While
I do not yet know its algorithm, I can assume it is much more efficient, especially as
arrays become larger.
*/

import java.util.Arrays;

public class SearchMethods_PartC {

    public static int[] rdmArray(int size) { // makes random array full, range between 1 and array size.
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = (int) (Math.random() * (size - 1)) + 1;
        }
        return array;
    }

    public static int linearSearch(int[] array, int key) { // does linear search
        boolean found = false;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                found = true;
                return index;
            }
        }
        if (!found)
            return -1;
        return 0;
    }

    public static void main(String[] args) {
        int max;
        int key;
        int keyFound;
        long searchTime;
        int[] array10k;
        int[] array100k;
        int[] array1m;

        // for 10 thousand.
        max = 10000;
        key = (int) (Math.random() * (max - 1)) + 1;

        array10k = rdmArray(max);

        System.out.println("Key: " + key);
        { // uses coding block and System.nanoTime() to time.
            long startTime = System.nanoTime();
            keyFound = linearSearch(array10k, key);
            searchTime = System.nanoTime() - startTime;
        }

        if (keyFound > 0)
            System.out.printf("10K Key found at %d (linear)%n", keyFound);
        else
            System.out.println("10K Key not found. (linear)");
        keyFound = -1; // reset
        System.out.println("Time elapsed: " + searchTime + " nanoseconds (linear)");
        System.out.println();

        { // uses coding block and System.nanoTime() to time.
            Arrays.sort(array10k);
            long startTime = System.nanoTime();
            keyFound = Arrays.binarySearch(array10k, key);
            searchTime = System.nanoTime() - startTime;
        }
        if (keyFound > 0)
            System.out.printf("10K Key found at %d (binary)%n", keyFound);
        else
            System.out.println("10K Key not found. (binary)");

        System.out.println("Time elapsed: " + searchTime + " nanoseconds (binary)");
        System.out.println();

        // for 100,000.
        max = 100000;
        key = (int) (Math.random() * (max - 1)) + 1;

        array100k = rdmArray(max);

        System.out.println("Key: " + key);
        { // uses coding block and System.nanoTime() to time.
            long startTime = System.nanoTime();
            keyFound = linearSearch(array100k, key);
            searchTime = System.nanoTime() - startTime;
        }

        if (keyFound > 0)
            System.out.printf("100K Key found at %d (linear)%n", keyFound);
        else
            System.out.println("100K Key not found.");
        keyFound = -1; // reset

        System.out.println("Time elapsed: " + searchTime + " nanoseconds (linear)");
        System.out.println();

        { // uses coding block and System.nanoTime() to time.
            Arrays.sort(array100k);
            long startTime = System.nanoTime();
            keyFound = Arrays.binarySearch(array100k, key);
            searchTime = System.nanoTime() - startTime;
        }
        if (keyFound > 0)
            System.out.printf("100K Key found at %d (binary)%n", keyFound);
        else
            System.out.println("100K Key not found. (binary)");

        System.out.println("Time elapsed: " + searchTime + " nanoseconds (binary)");
        System.out.println();

        // for 1,000,000
        max = 1000000;
        key = (int) (Math.random() * (max - 1)) + 1;

        array1m = rdmArray(max);

        System.out.println("Key: " + key);

        { // uses coding block and System.nanoTime() to time.
            long startTime = System.nanoTime();
            keyFound = linearSearch(array1m, key);
            searchTime = System.nanoTime() - startTime;
        }

        if (keyFound > 0)
            System.out.printf("1M Key found at %d (linear)%n", keyFound);
        else
            System.out.println("1M Key not found.");
        keyFound = -1; // reset

        System.out.println("Time elapsed: " + searchTime + " nanoseconds (linear)");
        System.out.println();

        { // uses coding block and System.nanoTime() to time.
            Arrays.sort(array1m);
            long startTime = System.nanoTime();
            keyFound = Arrays.binarySearch(array1m, key);
            searchTime = System.nanoTime() - startTime;
        }

        if (keyFound > 0)
            System.out.printf("1M Key found at %d (binary)%n", keyFound);
        else
            System.out.println("1M Key not found. (binary)");

        System.out.println("Time elapsed: " + searchTime + " nanoseconds (binary)");
        System.out.println();
    }

}
