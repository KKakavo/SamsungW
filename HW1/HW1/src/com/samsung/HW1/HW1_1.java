package com.samsung.HW1;

import java.util.Scanner;

public class HW1_1
{
    public static void main(String[] ags)
    {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        String ans = (y > 0 && x < 2 && x*x+y*y>4 && y<x)? "YES":"NO";
        System.out.println(ans);
    }
}
