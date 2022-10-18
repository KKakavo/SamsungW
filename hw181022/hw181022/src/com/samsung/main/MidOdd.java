package com.samsung.main;
import java.util.Scanner;
public class MidOdd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0,count = 0;
        boolean flag = false;
        for (int i : arr) {
            arr[i] = in.nextInt();
            if(Math.abs(arr[i]) % 2 == 1){
                sum += arr[i];
                count++;
                flag = true;
            }
        }
        if(flag) System.out.printf("%.2f",(double)sum / count);
        else System.out.println("NO");
    }
}
