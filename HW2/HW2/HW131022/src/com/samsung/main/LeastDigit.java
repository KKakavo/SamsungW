package com.samsung.main;
import java.util.Scanner;
public class LeastDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 9;
        while(n >= 1){
            if(n % 10 < ans && n % 10 > 0)
                ans = n % 10;
            n /= 10;

        }
        System.out.println(ans);
    }
}