import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get a valid SSN from the user using the pattern ^\\d{3}-\\d{2}-\\d{4}$
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (format: ###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered a valid SSN: " + ssn);

        // Get a valid UC Student M number using the pattern ^(M|m)\\d{5}$
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (format: M#####)", "^(M|m)\\d{5}$");
        System.out.println("You entered a valid M number: " + mNumber);

        // Get a valid menu choice using the pattern ^[OoSsVvQq]$
        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O/S/V/Q)", "^[OoSsVvQq]$");
        System.out.println("You selected: " + menuChoice);

        in.close();
    }
}
