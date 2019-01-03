package org.fasttrackit;


public class Food {
    String name;
    double price;
    double  quantity;
    int year;
    boolean inStock;

    public Food(String name, double price, double quantity, int year, boolean inStock) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.year = year;
        this.inStock = inStock;
    }
}
