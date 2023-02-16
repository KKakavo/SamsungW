package com.samsung;
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private long number;

    public Person(String name, int age, long number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getNumber() {
        return number;
    }

    @Override
    public int compareTo(Person person) {
        if(this.getNumber() % 100 > person.getNumber() % 100) return 1;
        else if(this.getNumber() % 100 < person.getNumber() % 100) return -1;
        else
            if(this.getAge() > person.getAge()) return 1;
            else if(this.getAge() < person.getAge()) return 1;
            else return this.getName().compareTo(person.getName());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append("Name: ").append(this.getName()).append("\n")
                .append("Age: ").append(this.getAge()).append("\n")
                .append("Phone number: ").append(this.getNumber()).append("\n\n");
        return sb.toString();
    }
}
