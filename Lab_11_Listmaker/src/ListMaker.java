import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {

    private static ArrayList<String> list = new ArrayList<>();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            displayMenu();
            String choice = SafeInput.getRegExString(in, "Choose an option", "[AaDdIiPpQq]").toUpperCase();

            switch (choice) {
                case "A":
                    addItem();
                    break;
                case "D":
                    deleteItem();
                    break;
                case "I":
                    insertItem();
                    break;
                case "P":
                    printList();
                    break;
                case "Q":
                    quit = SafeInput.getYNConfirm(in, "Are you sure you want to quit?");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        System.out.println("Goodbye!");
    }

    private static void displayMenu() {
        System.out.println("\nCurrent List:");
        printList();
        System.out.println("\nMenu:");
        System.out.println("[A] Add an item");
        System.out.println("[D] Delete an item");
        System.out.println("[I] Insert an item");
        System.out.println("[P] Print the list");
        System.out.println("[Q] Quit");
    }

    private static void addItem() {
        String item = SafeInput.getNonZeroLenString(in, "Enter the item to add");
        list.add(item);
        System.out.println("Item added.");
    }

    private static void deleteItem() {
        if (list.isEmpty()) {
            System.out.println("The list is empty. Nothing to delete.");
            return;
        }
        int index = SafeInput.getRangedInt(in, "Enter the item number to delete", 1, list.size()) - 1;
        list.remove(index);
        System.out.println("Item deleted.");
    }

    private static void insertItem() {
        if (list.isEmpty()) {
            System.out.println("The list is empty. Adding as the first item.");
            addItem();
            return;
        }
        int index = SafeInput.getRangedInt(in, "Enter the position to insert (1 to " + (list.size() + 1) + ")", 1, list.size() + 1) - 1;
        String item = SafeInput.getNonZeroLenString(in, "Enter the item to insert");
        list.add(index, item);
        System.out.println("Item inserted.");
    }

    private static void printList() {
        if (list.isEmpty()) {
            System.out.println("[The list is empty]");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%d: %s%n", i + 1, list.get(i));
            }
        }
    }
}
