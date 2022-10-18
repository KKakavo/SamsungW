package com.samsung.additional1;
import java.util.Scanner;
public class CompareMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] arr = new int[N][N];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = count++;
            }
        }
        count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               if(arr[j][i] == count)
                   System.out.print(count + " ");
               count++;
            }

        }
    }
}
