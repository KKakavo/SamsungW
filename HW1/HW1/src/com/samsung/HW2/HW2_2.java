package com.samsung.HW2;
import java.util.Locale;
import java.util.Scanner;
public class HW2_2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double a = in.nextDouble();
        System.out.println((a>=-3 && a<=5)||(a>=9 && a<=15));
    }
}
