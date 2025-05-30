package com.pluralsight.ui;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner = new Scanner(System.in);

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

    public Integer promptForCheese() {
        System.out.print("Enter cheese type:");
        System.out.println("\n1) American");
        System.out.println("2) Swiss");
        System.out.println("3) Pepper Jack");
        System.out.println("4) Cheddar");
        System.out.println("5) Done");
        System.out.print("Enter choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public boolean promptForExtraCheese() {
        System.out.print("Extra cheese? (yes or no): ");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }

    public int promptForTopping() {
        System.out.print("Enter toppings:");
        System.out.println("\n1) Lettuce");
        System.out.println("2) Tomatoes");
        System.out.println("3) Onions");
        System.out.println("4) Peppers");
        System.out.println("5) Pickles");
        System.out.println("6) Olives");
        System.out.println("7) Done");
        System.out.print("Enter choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int promptForSauce() {
        System.out.print("Enter sauce:");
        System.out.println("\n1) Vinaigrette");
        System.out.println("2) Mustard");
        System.out.println("3) Ranch");
        System.out.println("4) Mayo");
        System.out.println("5) Spicy Mustard");
        System.out.println("6) Done");
        System.out.print("Enter choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String promptForDrinkSize() {
        System.out.print("Enter drink size (small, medium, large): ");
        return scanner.nextLine();
    }

    public int promptForDrinkFlavor() {
        System.out.print("Pick a drink:");
        System.out.println("\n1) Sprite");
        System.out.println("2) Coke");
        System.out.println("3) Pepsi");
        System.out.println("4) Lemonade");
        System.out.println("5) Sweet Tea");
        System.out.println("6) Unsweetened Tea");
        System.out.println("7) Water");
        System.out.println("8) Done");
        System.out.print("Enter choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int promptForChipsType() {
        System.out.print("Pick chips:");
        System.out.println("\n1) Lay's");
        System.out.println("2) Sun Chips");
        System.out.println("3) Doritos");
        System.out.println("4) Veggie Chips");
        System.out.println("5) Baked Cheetos");
        System.out.println("6) Done");
        System.out.print("Enter choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public boolean promptForConfirmation() {
        System.out.print("Confirm order? (yes or no): ");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }
}
