package com.samsung;
import java.util.Scanner;
public class HW1_3
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       double x = in.nextDouble();
       double y = in.nextDouble();
       String ans = ((y<2-x*x && y>x)||(y<2-x*x && y>0))?"YES":"NO";
       System.out.println(ans);
    }
}
