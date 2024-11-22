import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons = 0, efficiency = 0, pricePerGallon = 0;
        boolean validInput;

        // Gallons of gas
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallons = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next();
            }
        } while (!validInput);

        // Fuel efficiency
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                efficiency = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next();
            }
        } while (!validInput);

        // Price per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next();
            }
        } while (!validInput);

        // Calculations
        double costPer100Miles = (100 / efficiency) * pricePerGallon;
        double maxDistance = gallons * efficiency;

        System.out.println("Cost to drive 100 miles: $" + costPer100Miles);
        System.out.println("Maximum distance with a full tank: " + maxDistance + " miles");
    }
}
