import java.util.Scanner;

public class SafeInput {
    public static int getRangedInt(Scanner console, String prompt, int low, int high) {
        int value;
        do {
            System.out.print(prompt);
            while (!console.hasNextInt()) {
                System.out.print("Invalid input. " + prompt);
                console.next();
            }
            value = console.nextInt();
            if (value < low || value > high) {
                System.out.println("Please enter a number between " + low + " and " + high + ".");
            }
        } while (value < low || value > high);
        return value;
    }

    public static boolean getYNConfirm(Scanner console, String prompt) {
        String response;
        do {
            System.out.print(prompt);
            response = console.next().trim().toUpperCase();
            if (!response.equals("Y") && !response.equals("N")) {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        } while (!response.equals("Y") && !response.equals("N"));
        return response.equals("Y");
    }
}
