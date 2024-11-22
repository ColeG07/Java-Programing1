import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0;
        boolean validInput = false;

        // Loop until a valid temperature is entered
        do {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // discard invalid input
            }
        } while (!validInput);

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        // Test for freezing and boiling points
        if (celsius == 0) {
            System.out.println("This is the freezing point of water.");
        } else if (celsius == 100) {
            System.out.println("This is the boiling point of water.");
        }
    }
}
