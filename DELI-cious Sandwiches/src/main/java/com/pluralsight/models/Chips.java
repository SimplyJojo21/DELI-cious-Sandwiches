package com.pluralsight.models;

public class Chips {
    private final int type;
    private final double price = 1.50;

    public Chips(int type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public String getSummary() {
        return type + " - $" + String.format("%.2f", price);
    }
}

