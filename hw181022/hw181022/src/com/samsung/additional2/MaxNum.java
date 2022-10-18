package com.samsung.additional2;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) arr[i] = in.nextInt();
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
            if(arr[i] > max) max = arr[i];
        System.out.println(max);
    }
}
