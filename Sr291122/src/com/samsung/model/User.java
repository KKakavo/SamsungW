package com.samsung.model;

public abstract class User {
    protected String name;
    protected String surname;
    protected String patronymic;
    protected String phoneNum;

    public User(String name, String surname, String patronymic, String phoneNum) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.phoneNum = phoneNum;
    }

    public User(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public abstract void sayHello();
}
