package com.samsung.main;
import java.util.Scanner;
public class FrequentNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) arr[i] = in.nextInt();
        int CommonNum = 0,CommonCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int tempCount = 0;
            for(int j = i; j < arr.length; j++) tempCount+= (arr[j] == arr[i]) ? 1 : 0;
            if(tempCount > CommonCount){
                CommonCount = tempCount;
                CommonNum = arr[i];
            }
        }
        System.out.println(CommonNum);
    }
}
