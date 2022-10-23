package com.samsung;
import java.util.Scanner;
public class SpiralFill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n * 2 + 1][n * 2 + 1];
        int moves = 1;
        int count = 0;
        int CurrentLine= n, CurrentColumn = n;
        arr[CurrentLine][CurrentColumn] = count++;
        CurrentLine--;
        for(int i = 0; i < arr.length/2; i++){
            int temp = CurrentColumn - moves;
            for(;CurrentColumn > temp; CurrentColumn--)
                arr[CurrentLine][CurrentColumn] = count++;
            moves++;
            temp = CurrentLine + moves;
            for(;CurrentLine < temp; CurrentLine++)
                arr[CurrentLine][CurrentColumn] = count++;
            temp = CurrentColumn + moves;
            for(;CurrentColumn < temp;CurrentColumn++)
                arr[CurrentLine][CurrentColumn] = count++;
            temp = CurrentLine - moves;
            for(;CurrentLine >= temp; CurrentLine--)
                arr[CurrentLine][CurrentColumn] = count++;
            moves++;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] / 10 >=1)
                    System.out.print(" " + arr[i][j]);
                else
                    System.out.print("  " + arr[i][j]);
            }
            System.out.println();
        }
    }
}
