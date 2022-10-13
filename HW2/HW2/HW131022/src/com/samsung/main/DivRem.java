package com.samsung.main;
import java.util.Scanner;
public class DivRem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int count=0;
        while(A - B >= 0){
            A -= B;
            count++;
        }
        System.out.println(count + " " + A);
    }
}
