public class CtoFTableDisplay {

    public static void main(String[] args) {
        // Display header for the table
        System.out.printf("%-10s %-10s%n", "Celsius", "Fahrenheit");
        System.out.println("-------------------------");

        // Loop to generate and display Celsius to Fahrenheit conversions
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius);
            System.out.printf("%-10d %-10.2f%n", celsius, fahrenheit);
        }
    }

    /**
     * Converts Celsius to Fahrenheit
     * @param celsius The temperature in Celsius
     * @return The equivalent temperature in Fahrenheit
     */
    public static double CtoF(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
}
