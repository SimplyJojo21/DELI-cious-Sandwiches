package com.pluralsight;

public class Chips {
    private String type;
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

