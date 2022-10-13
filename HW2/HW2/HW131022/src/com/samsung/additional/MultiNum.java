package com.samsung.additional;
import java.util.Scanner;
public class MultiNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int n = 1,ans = 0;
        while(n <= Math.abs(B)) {
            ans += A;
            n++;
        }
        if(B < 0) ans = 0 - ans;
        System.out.println(ans);
    }
}
