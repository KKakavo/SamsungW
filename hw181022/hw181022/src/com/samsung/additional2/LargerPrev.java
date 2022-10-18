package com.samsung.additional2;

import java.util.Scanner;

public class LargerPrev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        int count = 0;
        for (int i = 0; i < arr.length; i++) arr[i] = in.nextInt();
        for (int i = 1; i < arr.length; i++)
            if(arr[i] > arr[i - 1]) count++;
        System.out.println(count);
    }
}
