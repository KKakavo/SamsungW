package com.samsung.additional1;
import java.util.Scanner;
public class ReverseBin {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n >= 1){
            System.out.print(n % 2);
            n/=2;
        }
    }
}
