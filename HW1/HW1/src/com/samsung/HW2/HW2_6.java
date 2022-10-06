package com.samsung.HW2;
import java.util.Scanner;
public class HW2_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean ans =(a % 2 ==0) ? (b % 2 == 0 || c % 2 == 0) : (b % 2 == 0 && c % 2 == 0);
        System.out.println(ans);
    }
}
