package com.samsung;
import java.util.Scanner;
public class SnakeFill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0)
                for (int j = 0; j < arr[i].length; j++)
                    arr[i][j] = count++;
            else
                for (int j = arr[i].length - 1; j >= 0; j--)
                    arr[i][j] = count++;
        }
        System.out.print(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][0]);
            for (int j = 1; j < arr[i].length; j++) {
                if(arr[i][j] / 10 < 1)
                System.out.print("  " + arr[i][j]);
                else
                    System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
}
