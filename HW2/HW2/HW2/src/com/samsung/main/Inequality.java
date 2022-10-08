package com.samsung.main;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Inequality {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#");
        int A = in.nextInt();
        int B = in.nextInt();
        double n = (double)B / A;
        String chast = df.format(-n);
        if(n % 1 == 0) chast+=".0";
        if(A <= 0 && B<=0) System.out.println("no such x");
        else if(A >= 0 && B > 0) System.out.println("any x");
        else if(B < 0) System.out.println("x<-"+ chast + " or x>"+ chast);
        else if(A < 0) System.out.println("-"+chast + "<x<"+ chast);
    }
}
