package org.fasttrackit.exercise1;

public class Electronics extends Product{
    private String type;
    private double length;
    private double width;
    private double height;
    private double weight;

    public Electronics(double price, String name, String description, int quantity,
                       String type, double length, double width, double height, double weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getType() {
        return "Face parte din tipul " + type;
    }

    public String getLength() {
        return "Are lungimea de " + length + "m";
    }

    public String getWidth() {
        return "Are latimea de " + width + "m";
    }

    public String getHeight() {
        return "Are inaltimea de " + height + "m";
    }

    public String getWeight() {
        return "Are greutatea de " + weight + "Kg";
    }
}
