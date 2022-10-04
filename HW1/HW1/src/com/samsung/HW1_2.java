package com.samsung;

import java.util.Scanner;
public class HW1_2
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        String ans = (x>0 && x<Math.PI && y>0 && y<0.5 && y<Math.sin(x)) ? "YES" : "NO";
        System.out.println(ans);
    }
}
