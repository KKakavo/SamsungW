package com.samsung.main;
import java.util.Scanner;
public class NegativeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) arr[i]= in.nextInt();
        int CurrentPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                for(int j = i; j > CurrentPos; j--) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                CurrentPos++;
            }
        }
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i]+" ");
    }
}
