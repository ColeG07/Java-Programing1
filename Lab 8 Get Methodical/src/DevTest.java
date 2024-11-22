import java.util.Scanner;

public class DevTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString
        System.out.println("Testing getNonZeroLenString:");
        String nonZeroString = SafeInput.getNonZeroLenString(in, "Enter a non-empty string");
        System.out.println("You entered: " + nonZeroString);

        // Test getInt
        System.out.println("\nTesting getInt:");
        int integerInput = SafeInput.getInt(in, "Enter any integer");
        System.out.println("You entered: " + integerInput);

        // Test getDouble
        System.out.println("\nTesting getDouble:");
        double doubleInput = SafeInput.getDouble(in, "Enter any double");
        System.out.println("You entered: " + doubleInput);

        // Test getRangedInt
        System.out.println("\nTesting getRangedInt:");
        int rangedInt = SafeInput.getRangedInt(in, "Enter an integer between 1 and 10", 1, 10);
        System.out.println("You entered: " + rangedInt);

        // Test getRangedDouble
        System.out.println("\nTesting getRangedDouble:");
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double between 0.5 and 9.5", 0.5, 9.5);
        System.out.println("You entered: " + rangedDouble);

        // Test getYNConfirm
        System.out.println("\nTesting getYNConfirm:");
        boolean ynConfirm = SafeInput.getYNConfirm(in, "Do you want to continue? [Y/N]");
        System.out.println("You responded: " + (ynConfirm ? "Yes" : "No"));

        // Test getRegExString
        System.out.println("\nTesting getRegExString:");
        String regExString = SafeInput.getRegExString(in, "Enter a valid SSN (e.g., 123-45-6789)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered: " + regExString);
    }
}
