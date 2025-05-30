package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Sandwich> sandwiches = new ArrayList<>();
    private final List<Drink> drinks = new ArrayList<>();
    private final List<Chips> chips = new ArrayList<>();

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chip) {
        chips.add(chip);
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public double getTotal() {
        double total = 0;
        for (Sandwich sandwich : sandwiches) {
            total += sandwich.getPrice();
        }
        for (Drink drink : drinks) {
            total += drink.getPrice();
        }
        for (Chips chip : chips) {
            total += chip.getPrice();
        }
        return total;
    }

    public String getOrderSummary() {
        StringBuilder summary = new StringBuilder();

        for (Sandwich sandwich : sandwiches) {
            summary.append("Sandwich:\n").append(sandwich.getSummary()).append("\n\n");
        }
        for (Drink drink : drinks) {
            summary.append("Drink: ").append(drink.getSummary()).append("\n");
        }
        for (Chips chip : chips) {
            summary.append("Chips: ").append(chip.getSummary()).append("\n");
        }

        summary.append("Total: $").append(String.format("%.2f", getTotal()));
        return summary.toString();
    }
}

