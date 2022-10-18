package com.samsung.main;
import java.util.Scanner;
public class Xequal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int x = in. nextInt();
        String ans = "NO";
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == x){
                ans = Integer.toString(i + 1);
                break;
            }
        }
        System.out.println(ans);
    }
}
