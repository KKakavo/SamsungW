package com.samsung.additional;

public class MyMath {
    public static int min(int n1, int n2, int n3, int n4){
        int[] arr= new int[]{n1,n2,n3,n4};
        int min = arr[0];
        for (int i : arr) {
            if(i < min) min = i;
        }
        return min;
    }
}
