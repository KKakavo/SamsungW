package com.samsung.additional;
import java.util.Scanner;
public class PrintEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int current = 2, count = 1;
        while(count <= N){
            System.out.print(current + " ");
            current+=2;
            count++;
        }
    }
}
