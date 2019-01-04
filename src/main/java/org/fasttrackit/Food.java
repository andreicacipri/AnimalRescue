package org.fasttrackit;


import java.time.LocalDate;

public class Food {
   protected String name;
   private double price;
   private double  quantity;
   private LocalDate year;
   private boolean inStock;

//    public Food(String name, double price, double quantity, int year, boolean inStock) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//        this.year = year;
//        this.inStock = inStock;
//   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
