package com.samsung.additional2;
import java.util.Scanner;
public class VariousNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
        int count = 1;
        for (int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1] ) count++;
        }
        System.out.println(count);
    }
}
