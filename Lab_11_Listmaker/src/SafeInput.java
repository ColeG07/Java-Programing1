import java.util.Scanner;

public class SafeInput {

    private static Scanner in = new Scanner(System.in);

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String input;
        do {
            System.out.print(prompt + ": ");
            input = pipe.nextLine();
        } while (input.length() == 0);
        return input;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int input;
        do {
            System.out.print(prompt + " [" + low + "-" + high + "]: ");
            while (!pipe.hasNextInt()) {
                System.out.println("Invalid input. Enter an integer.");
                pipe.next();
            }
            input = pipe.nextInt();
            pipe.nextLine(); // clear newline
        } while (input < low || input > high);
        return input;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;
        do {
            System.out.print(prompt + ": ");
            input = pipe.nextLine();
            if (!input.matches(regEx)) {
                System.out.println("Invalid input. Please follow the pattern.");
            }
        } while (!input.matches(regEx));
        return input;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String input;
        do {
            System.out.print(prompt + " [Y/N]: ");
            input = pipe.nextLine().trim().toUpperCase();
        } while (!input.equals("Y") && !input.equals("N"));
        return input.equals("Y");
    }
}
