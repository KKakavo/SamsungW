package com.samsung.main;

public class MyArrays {
    public static void main(String[] args) {
        //System.out.println(avgOf4Digit(3,[-8,15,8]));
    }
    public static double avgOf4Digit(int[] arr){
        double ans= 0.0;
        int count = 0;
        for (int i : arr) {
            if(i / 1000 >= 1 && i / 1000 <= 9){
                ans += i;
                count++;
            }
        }
        if(count == 0) return -1;
        else return ans / count;
    }
    public static int[] minToBegin(int[] arr){
        int min = arr[0];
        for (int i : arr) {
            if(min > i) min = i;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == min){
                for(int j = i; j>=1; j--){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                break;
            }
        }
        return arr;
    }
}
