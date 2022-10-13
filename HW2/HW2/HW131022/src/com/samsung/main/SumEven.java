package com.samsung.main;

import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Current = 25,sum = 0;
        while(Current <= N){
            if(Current % 2 == 0) sum += Current;
            Current++;
        }
        System.out.println(sum);
    }
}
