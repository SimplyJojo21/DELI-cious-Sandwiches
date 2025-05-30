package com.pluralsight.models;


public class Drink {
    private final String size;
    private final int flavor;
    private double price;

    public Drink(String size, int flavor) {
        this.size = size;
        this.flavor = flavor;
        setPrice();
    }

    private void setPrice() {
        switch (size.toLowerCase()) {
            case "small":
                price = 2.00;
                break;
            case "medium":
                price = 2.50;
                break;
            case "large":
                price = 3.00;
                break;
            default:
                price = 0;
        }
    }

    public double getPrice() {
        return price;
    }

    public String getSummary() {
        return size + " " + flavor + " - $" + String.format("%.2f", price);
    }
}

