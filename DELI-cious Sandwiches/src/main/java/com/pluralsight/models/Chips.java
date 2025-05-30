package com.pluralsight.models;

public class Chips {
    private final String type;
    private final double price = 1.50;

    public Chips(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public String getSummary() {
        return type + " - $" + String.format("%.2f", price);
    }
}

