//By Georgio. i used google to research how to go about changing Math.random.
public class Random_PartC {
    public static void main(String[] args) {
        double values = 0;
        int rdmNumber;
        System.out.println();

        for (int i = 0; i < 1000; i++) {
            rdmNumber = (int) (Math.random() * 10); // turns tenths to ones
            if (rdmNumber == 0) { // turns zeros to tens
                rdmNumber = 10;
            }
            values = values + rdmNumber;
        }
        double average = values / 1000;
        System.out.println(average);
    }
}
