package com.samsung.main;
import java.util.Scanner;
public class SumEven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if(arr[i] % 2 == 0) {
                sum += arr[i];
                flag = true;
            }
        }
        if(flag) System.out.println(sum);
        else System.out.println("NO");
    }
}
