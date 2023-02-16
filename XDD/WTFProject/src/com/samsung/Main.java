package com.samsung;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("A",12,896662220103L),
                new Person("B",44,896662220140L),
                new Person("C",120,896662220131L),
                new Person("D",34,896662220196L),
                new Person("E",76,896662220103L),
                new Person("F",9,896662220103L)
        };
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}
