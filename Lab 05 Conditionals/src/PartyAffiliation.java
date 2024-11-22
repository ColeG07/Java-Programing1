import java.util.Scanner;

public class PartyAffiliation {

    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their party affiliation
        System.out.println("Choose your party affiliation: D for Democrat, R for Republican, I for Independent");
        System.out.print("Enter your choice: ");
        char choice = scanner.next().toUpperCase().charAt(0);

        // Cascaded if-else structure to determine the output based on the choice
        if (choice == 'D') {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice == 'R') {
            System.out.println("You get a Republican Elephant.");
        } else if (choice == 'I') {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }
    }
}
