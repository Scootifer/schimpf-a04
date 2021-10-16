/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Scott Schimpf
 */

// The Product class will only consist of a name, price, and quantity variable, and the according
// Constructor


public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double p){
        this.price = p;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int q){
        this.quantity = q;
    }
}
