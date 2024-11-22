import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);

        int month = SafeInput.getRangedInt(in, "Enter your birth month (1-12)", 1, 12);

        int day = 0;

        switch (month) {
            case 2: // February
                day = SafeInput.getRangedInt(in, "Enter your birth day (1-29)", 1, 29);
                break;
            case 4: case 6: case 9: case 11: // Months with 30 days
                day = SafeInput.getRangedInt(in, "Enter your birth day (1-30)", 1, 30);
                break;
            default: // Months with 31 days
                day = SafeInput.getRangedInt(in, "Enter your birth day (1-31)", 1, 31);
                break;
        }

        int hour = SafeInput.getRangedInt(in, "Enter the hour of your birth (1-24)", 1, 24);

        int minute = SafeInput.getRangedInt(in, "Enter the minute of your birth (1-59)", 1, 59);

        System.out.printf("You were born on %d/%d/%d at %02d:%02d.%n", month, day, year, hour, minute);
    }
}
