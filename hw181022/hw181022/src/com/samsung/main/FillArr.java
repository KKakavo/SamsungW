package com.samsung.main;
import java.util.Scanner;
public class FillArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 4 + 3 * i;
            System.out.print(arr[i] + " ");
        }
    }
}
