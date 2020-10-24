package com.codegym.model;

public class Products {
    private int id;
    private int price;
    private int amount;
    private String description;
    private String name;

    public Products() {
    }

    public Products(int id,String name, int price, int amount, String description) {
        this.id = id;
        this.name=name;
        this.price = price;
        this.amount = amount;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

