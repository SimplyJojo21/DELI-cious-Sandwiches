package com.pluralsight.ui;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);

    public int showHomeScreen() {
        System.out.println("=== Welcome to DELI-cious Sandwiches ===");
        System.out.println("1) New Order");
        System.out.println("0) Exit");
        System.out.print("Enter choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int showOrderMenu() {
        System.out.println("\n1) Add Sandwich");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Chips");
        System.out.println("4) Checkout");
        System.out.println("0) Cancel Order");
        System.out.print("Enter choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int promptForBreadType() {
        System.out.print("Enter bread type:");
        System.out.println("\n1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");
        System.out.print("Enter choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int promptForSize() {
        System.out.print("Enter size (4, 8, or 12 inches): ");
        return Integer.parseInt(scanner.nextLine());
    }

    public boolean promptForToasted() {
        System.out.print("Would you like it toasted? (yes or no): ");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }

    public int promptForMeat() {
        System.out.print("Enter meat type:");
        System.out.println("\n1) Chicken");
        System.out.println("2) Steak");
        System.out.println("3) Salami");
        System.out.println("4) Roast Beef");
        System.out.println("3) Bacon");
        System.out.println("4) Tofu");
        System.out.println("5) Done");
        System.out.print("Enter choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public boolean promptForExtraMeat() {
        System.out.print("Extra meat? (yes or no): ");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }

    public String promptForCheese() {
        System.out.print("Enter a cheese (American, Swiss, Pepper Jack, Cheddar) (or 'done' to finish): ");
        return scanner.nextLine();
    }

    public boolean promptForExtraCheese() {
        System.out.print("Extra cheese? (yes or no): ");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }

    public String promptForTopping() {
        System.out.print("Enter a topping (lettuce, tomatoes, onions, peppers, pickles, olives) (or 'done' to finish): ");
        return scanner.nextLine();
    }

    public String promptForSauce() {
        System.out.print("Enter a sauce (vinaigrette, mustard, ranch, mayo, spicy mustard) (or 'done' to finish): ");
        return scanner.nextLine();
    }

    public String promptForDrinkSize() {
        System.out.print("Enter drink size (small, medium, large): ");
        return scanner.nextLine();
    }

    public String promptForDrinkFlavor() {
        System.out.print("Enter drink flavor (Sprite, Coke, Pepsi, Lemonade, Sweet Tea, Unsweetened Tea, Water): ");
        return scanner.nextLine();
    }

    public String promptForChipsType() {
        System.out.print("Enter chip type (Lay's, Sun Chips, Doritos, Veggie Chips, Baked Cheetos): ");
        return scanner.nextLine();
    }

    public boolean promptForConfirmation() {
        System.out.print("Confirm order? (yes or no): ");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }
}
