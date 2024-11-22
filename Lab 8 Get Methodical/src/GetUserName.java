import java.util.Scanner;

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String firstName = "";
    String lastName = "";

    // Get user input for first and last name
    firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
    lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");

    // Display the full name
    System.out.println("\nYour full name is: " + firstName + " " + lastName);

    in.close(); // Close the scanner to prevent resource leaks
}
