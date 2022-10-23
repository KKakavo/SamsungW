package com.samsung;
import java.util.Scanner;
public class RotateMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[][] arr = new int[N][M];
        for (int i = 0; i < arr.length; i++) 
            for (int j = 0; j < arr[i].length; j++) 
                arr[i][j] = in.nextInt();
        System.out.println(M + " " + N);
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = arr.length - 1; j >=0; j--) {
                System.out.print(arr[j][i] +" ");
            }
            System.out.println();
        }
    }
}
