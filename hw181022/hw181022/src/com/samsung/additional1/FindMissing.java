package com.samsung.additional1;
import java.util.Scanner;
public class FindMissing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length - 1; i++) {
            int input = in.nextInt();
            arr[input - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                System.out.println(i+1);
            }
        }
    }
}
