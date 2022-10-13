package com.samsung.additional;
import java.util.Scanner;
public class SameDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int prev = N % 10;
        String ans = "NO";
        N /= 10;
        while(N >=1){
            if(N % 10 == prev){
                ans = "YES";
            }
            else prev = N % 10;
            N /= 10;
        }
        System.out.println(ans);

    }
}
