package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private final int breadType;
    private final int size;
    private final boolean toasted;
    private final List<String> meats = new ArrayList<>();
    private final List<String> cheeses = new ArrayList<>();
    private final List<String> toppings = new ArrayList<>();
    private final List<String> sauces = new ArrayList<>();
    private double price;

    public Sandwich(Integer breadType, int size, boolean toasted) {
        this.breadType = breadType;
        this.size = size;
        this.toasted = toasted;
        setBasePrice();
    }

    private void setBasePrice() {
        if (size == 4) price = 5.50;
        else if (size == 8) price = 7.00;
        else if (size == 12) price = 8.50;
    }

    public void addMeat(int meat, boolean isExtra) {
        meats.add(meat + (isExtra ? " (extra)" : ""));
        if (isExtra) {
            if (size == 4) price += 0.50;
            else if (size == 8) price += 1.00;
            else if (size == 12) price += 1.50;
        } else {
            if (size == 4) price += 1.00;
            else if (size == 8) price += 2.00;
            else if (size == 12) price += 3.00;
        }
    }

    public void addCheese(int cheese, boolean isExtra) {
        cheeses.add(cheese + (isExtra ? " (extra)" : ""));
        if (isExtra) {
            if (size == 4) price += 0.30;
            else if (size == 8) price += 0.60;
            else if (size == 12) price += 0.90;
        } else {
            if (size == 4) price += 0.75;
            else if (size == 8) price += 1.50;
            else if (size == 12) price += 2.25;
        }
    }

    public void addTopping(int topping) {
        toppings.add(String.valueOf(topping));
    }

    public void addSauce(int sauce) {
        sauces.add(String.valueOf(sauce));
    }

    public double getPrice() {
        return price;
    }

    public String getSummary() {
        return size + "\" " + breadType + " " + (toasted ? "(toasted)" : "") + "\n" +
                "Meats: " + meats + "\n" +
                "Cheeses: " + cheeses + "\n" +
                "Toppings: " + toppings + "\n" +
                "Sauces: " + sauces + "\n" +
                "Price: $" + String.format("%.2f", price);
    }
}
