import java.util.Scanner;

public class BirthMonth {
    public static class BirthMonthChecker {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your birth month (1-12): ");
            int month = scanner.nextInt();
            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("Error: Please enter a valid month (1-12).");
            }
            scanner.close();
        }
    }
}
