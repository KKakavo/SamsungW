package com.samsung.classes;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator){
        this.numerator = numerator;
        denominator = 1;
    }
    public Fraction(){
        this(0);
    }
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fraction(Fraction fr){
        this(fr.numerator,fr.denominator);
    }
    public static Fraction sum(Fraction fr1, Fraction fr2){
        int numerator = fr1.numerator * fr2.denominator + fr2.numerator * fr1.denominator;
        int denominator = fr1.denominator * fr2.denominator;
        int NOD = NOD(numerator, denominator);
        Fraction temp = new Fraction(numerator / NOD, denominator / NOD);
        return temp;
    }
    public static Fraction diff(Fraction fr1, Fraction fr2){
        int numerator = fr1.numerator * fr2.denominator - fr2.numerator * fr1.denominator;
        int denominator = fr1.denominator * fr2.denominator;
        int NOD = NOD(numerator, denominator);
        Fraction temp = new Fraction(numerator / NOD, denominator / NOD);
        return temp;
    }
    public static Fraction quot(Fraction fr1,Fraction fr2){
        int numerator = fr1.numerator * fr2.denominator;
        int denominator = fr1.denominator * fr2.numerator;
        int NOD = NOD(numerator, denominator);
        Fraction temp = new Fraction(numerator / NOD, denominator / NOD);
        return temp;
    }
    public static Fraction prod(Fraction fr1, Fraction fr2){
        int numerator = fr1.numerator * fr2.numerator;
        int denominator = fr1.denominator * fr2.denominator;
        int NOD = NOD(numerator, denominator);
        Fraction temp = new Fraction(numerator / NOD, denominator / NOD);
        return temp;
    }
    public void print(){
        System.out.println(numerator+"/"+denominator);
    }
    private static int NOD(int n1, int n2){
        if(n1 % n2 == 0)
            return n2;
        if(n2 % n1 == 0)
            return n1;
        if(n1 > n2) return NOD(n1 % n2,n2);
        return NOD(n1,n2 % n1);
    }

}
