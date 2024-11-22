import java.util.Random;

public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        // Task 1: Declare and initialize the dataPoints array
        int[] dataPoints = new int[100];
        Random rnd = new Random();

        // Task 2: Populate dataPoints with random values from 1 to 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 3: Display the values in dataPoints
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + (i < dataPoints.length - 1 ? " | " : "\n"));
        }

        // Task 4: Calculate and display the sum and average of dataPoints
        int sum = 0;
        for (int val : dataPoints) {
            sum += val;
        }
        double average = sum / (double) dataPoints.length;
        System.out.println("The sum of the values is: " + sum);
        System.out.println("The average of the values is: " + average);

        // Task 5: Prompt the user for a value to search and count its occurrences
        int userValue = SafeInput.getRangedInt("Enter a value between 1 and 100 to count occurrences: ", 1, 100);
        int count = 0;
        for (int val : dataPoints) {
            if (val == userValue) count++;
        }
        System.out.println("The value " + userValue + " was found " + count + " times in the dataPoints array.");

        // Task 6: Prompt the user for another value and find its first occurrence
        int searchValue = SafeInput.getRangedInt("Please enter another integer value between 1 and 100 to find its position: ", 1, 100);
        boolean found = false;
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue) {
                found = true;
                position = i;
                break;
            }
        }
        if (found) {
            System.out.println("The value " + searchValue + " was found at array index " + position + ".");
        } else {
            System.out.println("The value " + searchValue + " was not found in the dataPoints array.");
        }

        // Task 7: Find and display the minimum and maximum values in the dataPoints array
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) min = dataPoints[i];
            if (dataPoints[i] > max) max = dataPoints[i];
        }
        System.out.println("The minimum value in the dataPoints array is: " + min);
        System.out.println("The maximum value in the dataPoints array is: " + max);

        // Task 8: Display the average using the getAverage method
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    // Static method to calculate the average of an integer array
    public static double getAverage(int values[]) {
        int sum = 0;

        for (int val : values) {
            sum += val;
        }

        // Cast to double to get a more precise average
        return sum / (double) values.length;
    }
}
