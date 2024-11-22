import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String userResponse;

        do {
            System.out.printf("%-10s%-10s%-10s%-10s%-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            for (int rollCount = 1; rollCount <= 3; rollCount++) {
                int die1 = rand.nextInt(6) + 1;
                int die2 = rand.nextInt(6) + 1;
                int die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                // Print the roll results in table format
                System.out.printf("%-10d%-10d%-10d%-10d%-10d%n", rollCount, die1, die2, die3, sum);
            }

            System.out.print("Do you want to roll again? (yes/no): ");
            userResponse = scanner.nextLine().trim().toLowerCase();

        } while (userResponse.equals("yes"));

        scanner.close();
    }
}
