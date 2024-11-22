import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = generator.nextInt(10) + 1;
        int guess = 0;
        boolean validInput;

        // Input guess
        do {
            System.out.print("Guess the number (1-10): ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                if (guess >= 1 && guess <= 10) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please guess a number between 1 and 10.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                validInput = false;
                scanner.next();
            }
        } while (!validInput);

        // Compare guess to the random number
        System.out.println("The random number was: " + randomNumber);
        if (guess < randomNumber) {
            System.out.println("Your guess is too low!");
        } else if (guess > randomNumber) {
            System.out.println("Your guess is too high!");
        } else {
            System.out.println("Your guess is on the money!");
        }
    }
}
