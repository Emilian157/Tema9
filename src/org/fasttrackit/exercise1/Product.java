package org.fasttrackit.exercise1;

public class Product {
    private double price;
    private String name;
    private String description;
    private int quantity;

    public Product(double price, String name, String description, int quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public String getPrice() {
        return  price + " Lei";
    }

    public String getName() {
        return "Nume produs: " + name;
    }

    public String getDescription() {
        return "Descriere: " + description;
    }

    public String getQuantity() {
        return "Cantitatea/stocul: " + quantity;
    }

}
