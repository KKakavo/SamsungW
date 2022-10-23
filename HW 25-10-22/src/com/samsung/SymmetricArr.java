package com.samsung;
import java.util.Scanner;
public class SymmetricArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = in.nextInt();
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != arr[j][i]) flag = false;
            }
        }
        System.out.println((flag == true)?"yes" : "no");
    }
}
