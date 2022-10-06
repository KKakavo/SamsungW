package com.samsung.HW1;

import java.util.Scanner;

public class HW1_5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        String ans = ((x<0 && x*x+y*y<1) || (y>x && x*x+y*y<1))? "YES" : "NO";
        System.out.println(ans);
    }
}
