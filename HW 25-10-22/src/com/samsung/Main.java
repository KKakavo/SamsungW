package com.samsung;
import java.util.Scanner;
public class Main {
    public static void main (String args[]){
        int[][] a;
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        a = new int[N][M];
        int n = 0,m = 0;
        while(n != N){
            a[n][m] = n * m;
            m++;
            if(m == M){
               m = 0;
               n++;
            }
        }
        for (int i1 = 0; i1 < a.length; i1++) {
            for (int j1 = 0; j1 < a[i1].length; j1++) {
                System.out.print(a[i1][j1] + " ");
            }
            System.out.println();
        }



    }
}
