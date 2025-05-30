package com.pluralsight;

import com.pluralsight.models.*;
import com.pluralsight.ui.UserInterface;
import com.pluralsight.util.ReceiptWriter;

public class Application {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();

        while (true) {
            int homeChoice = ui.showHomeScreen();
            if (homeChoice == 0) break;

            Order order = new Order();

            boolean ordering = true;
            while (ordering) {
                int menuChoice = ui.showOrderMenu();
                switch (menuChoice) {
                    case 1:
                        String bread = ui.promptForBreadType();
                        int size = ui.promptForSize();
                        boolean toasted = ui.promptForToasted();
                        Sandwich sandwich = new Sandwich(bread, size, toasted);

                        while (true) {
                            String meat = ui.promptForMeat();
                            if (meat.equalsIgnoreCase("done")) break;
                            boolean extra = ui.promptForExtraMeat();
                            sandwich.addMeat(meat, extra);
                        }

                        while (true) {
                            String cheese = ui.promptForCheese();
                            if (cheese.equalsIgnoreCase("done")) break;
                            boolean extra = ui.promptForExtraCheese();
                            sandwich.addCheese(cheese, extra);
                        }

                        while (true) {
                            String topping = ui.promptForTopping();
                            if (topping.equalsIgnoreCase("done")) break;
                            sandwich.addTopping(topping);
                        }

                        while (true) {
                            String sauce = ui.promptForSauce();
                            if (sauce.equalsIgnoreCase("done")) break;
                            sandwich.addSauce(sauce);
                        }

                        order.addSandwich(sandwich);
                        break;

                    case 2:
                        String drinkSize = ui.promptForDrinkSize();
                        String flavor = ui.promptForDrinkFlavor();
                        order.addDrink(new Drink(drinkSize, flavor));
                        break;

                    case 3:
                        String chipType = ui.promptForChipsType();
                        order.addChips(new Chips(chipType));
                        break;

                    case 4:
                        System.out.println("\nOrder Summary:");
                        System.out.println(order.getOrderSummary());
                        if (ui.promptForConfirmation()) {
                            ReceiptWriter.saveReceipt(order);
                            System.out.println("Receipt saved. Thank you!");
                        } else {
                            System.out.println("Order cancelled.");
                        }
                        ordering = false;
                        break;

                    case 0:
                        System.out.println("Order cancelled.");
                        ordering = false;
                        break;
                }
            }
        }

        System.out.println("Have a DELI-cious Day!");
    }
}
