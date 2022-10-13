package com.samsung.main;
import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, sum = 0;
        do{
            n = in.nextInt();
            if(n > 0 && n / 10>=1 && n / 10 <=9){
                sum += n / 10 + n % 10;
            }
        }while(n > 0 && n / 10>=1 && n / 10 <=9);
        System.out.println(sum);
    }
}
