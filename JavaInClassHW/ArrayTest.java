import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
public static void main(String[] args){

double[] testScores = new double[10];
double greatest = 0.0;
double avg = 0.0;
double workAvg = 0.0;
int avgCount = 0;
Scanner in = new Scanner(System.in);

for (int i = 0; i < testScores.length; i++){ //record scores
System.out.println("Please input a test score.");
if (in.hasNext("Q") || in.hasNext("q"))
	break;
testScores[i] = in.nextDouble();
avgCount ++;
}
System.out.println("Number of entries:" + avgCount);
for (double score : testScores){ //get greatest
if (score > greatest)
	greatest = score;
}
System.out.println("Greatest is: " + greatest);

for (double score : testScores){ // get average
	workAvg = workAvg + score;
}
avg = workAvg / avgCount;
System.out.println("Average is: " + avg);
} //ending brackets
}
