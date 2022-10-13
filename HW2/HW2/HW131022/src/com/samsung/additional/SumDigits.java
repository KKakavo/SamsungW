package com.samsung.additional;
import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum=0;
        while(N >= 1){
            sum += N % 10;
            N /= 10;
        }
        System.out.println(sum);
    }
}
