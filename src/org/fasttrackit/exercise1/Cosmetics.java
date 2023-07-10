package org.fasttrackit.exercise1;

public class Cosmetics extends Product{
    private String color;
    private double weight;

    public Cosmetics(double price, String name, String description, int quantity, String color, double weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return "Culoarea este " + color;
    }

    public String getWeight() {
        return "Are greutatea de " + weight + "g";
    }
}
