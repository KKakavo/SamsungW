package com.samsung.main;
import java.util.Scanner;
public class BinNumSize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        while(n >= 1){
            n/=2;
            count++;
        }
        System.out.println(count);
    }
}
