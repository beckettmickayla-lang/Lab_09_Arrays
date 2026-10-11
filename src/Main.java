import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int[] dataPoints = new int[100];
        int sum = 0;
        int count = 0;


        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        System.out.println("The random array dataPoints has been created with a length of: " + dataPoints.length);

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);

            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.printf("The average of the random array dataPoints is: %.2f%n", average);
        System.out.println();

        int userValue = SafeInput.getRangedInt(in, "Enter an integer to search for", 1, 100);

        System.out.println("You entered: " + userValue);

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " time(s) in the dataPoints array.");
        System.out.println();

        int targetValue = SafeInput.getRangedInt(in, "Enter another integer to find its first position", 1, 100);
        int foundIndex = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == targetValue) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("The value " + targetValue + " was found at array index " + foundIndex);
        } else {
            System.out.println("THe value " + targetValue + "was not found in the dataPoints array.");
        }
    }
}