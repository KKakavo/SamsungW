package com.samsung.main;
import java.util.Scanner;
public class OddNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String ans = "NO";
        while(n >= 1){
            if(n % 10 % 2 == 1) {
                ans = Integer.toString(n % 10);
                break;
            }
            n /= 10;
        }
        System.out.println(ans);
    }
}
