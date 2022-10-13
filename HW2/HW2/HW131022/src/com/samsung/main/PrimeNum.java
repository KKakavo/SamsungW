package com.samsung.main;
import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        while(true){
            N++;
            int n = 2;
            while(n <= N / 2){
                if(N % n == 0) break;
                n++;
            }
            if(n>N/2)break;
        }
        System.out.println(N);
    }
}
