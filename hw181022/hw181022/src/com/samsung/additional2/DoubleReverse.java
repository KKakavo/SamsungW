package com.samsung.additional2;
import java.util.Scanner;
public class DoubleReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) arr[i] = i + 1;
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        for(int i = A - 1; i <= (B + A)/2 - 1; i++){
            int temp = arr[i];
            arr[i] = arr[B  - 2 - (i - A)];
            arr[B  - 2 - (i - A)] = temp;
        }
        for(int i = C - 1; i <= (C + D)/2 - 1; i++){
            int temp = arr[i];
            arr[i] = arr[D  - 2 - (i - C)];
            arr[D  - 2 - (i - C)] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
