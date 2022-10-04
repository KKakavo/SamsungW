package com.samsung;

import java.util.Scanner;
public class Classwork {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        String ans=(y>0 && x*x+y*y>4 && x<2)?"YES":"NO";
        System.out.println(ans);
    }
}
