package com.samsung.additional2;
import java.util.Scanner;
public class EvenIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if(i % 2 == 0)
                System.out.print(arr[i] + " ");
        }
    }
}
