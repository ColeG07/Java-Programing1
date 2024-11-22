import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user for their age
        System.out.print("Enter your age: ");

        // Check if the input is an integer
        if (in.hasNextInt()) {
            int age = in.nextInt();
            in.nextLine(); // Clear the input buffer

            // If age is 21 or over, display the wrist band message
            if (age >= 21) {
                System.out.println("You get a wrist band.");
            }
        } else {
            // Invalid input; read as string to clear the buffer
            String trash = in.nextLine();
            System.out.println("Invalid input. Please enter a valid age.");
        }
    }
}
