package com.samsung.model;

public class Product {
    private String name;
    private int cost;
    private int count;
    public static int productCount = 0;
    public Product(String name, int cost, int count){
        this.name = name;
        this.cost = cost;
        this.count = count;
        productCount++;
    }
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append("Name : ").append(name).append("\n")
                .append("Cost : ").append(cost).append("\n")
                .append("Count : ").append(count).append("\n");
        return stringBuilder.toString();
    }
}
