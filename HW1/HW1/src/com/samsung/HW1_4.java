package com.samsung;

import java.util.Scanner;

public class HW1_4
{
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    double x = in.nextDouble();
    double y = in.nextDouble();
    String ans = ((y>x*x-2 && y<-x)||(y>x*x-2 && y<x))?"YES":"NO";
    System.out.println(ans);
}
}
