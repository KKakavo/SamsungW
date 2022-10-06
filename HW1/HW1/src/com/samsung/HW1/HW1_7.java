package com.samsung.HW1;

import java.util.Scanner;

public class HW1_7 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        String ans = ((x<1 && y>2*x*x && y>1-x)|| (x<1 &&   y>1-x))? "YES" : "NO";
        System.out.println(ans);
    }
}