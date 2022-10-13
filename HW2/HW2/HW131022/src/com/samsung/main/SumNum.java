package com.samsung.main;
import java.util.Scanner;
public class SumNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, count = 0;
        do{
            n = in.nextInt();
            if(n > 10) count+= n;
        }while(n % 5 != 0);
        System.out.println(count);
    }
}
