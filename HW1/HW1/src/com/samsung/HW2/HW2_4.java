package com.samsung.HW2;
import java.util.Scanner;
public class HW2_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a>=100 && a<=999 && a%5==0);
    }
}
