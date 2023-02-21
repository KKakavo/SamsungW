package com.example.recyclerviewforbs.model;

public class Person {
    private String name;
    private String balance;

    public Person(String name, String balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getBalance() {
        return balance;
    }
}
