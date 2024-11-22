import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the price of the item
        System.out.print("Enter the price of the item: ");
        double itemPrice = scanner.nextDouble();

        // Variable to store the shipping cost
        double shippingCost;

        // Calculate shipping cost
        if (itemPrice >= 100) {
            shippingCost = 0.0;  // Free shipping for items priced at $100 or more
        } else {
            shippingCost = 0.02 * itemPrice;  // 2% shipping cost for items under $100
        }

        // Calculate the total price (item price + shipping cost)
        double totalPrice = itemPrice + shippingCost;

        // Display the shipping cost and total price
        System.out.println("Shipping Cost: $" + shippingCost);
        System.out.println("Total Price: $" + totalPrice);
    }
}
