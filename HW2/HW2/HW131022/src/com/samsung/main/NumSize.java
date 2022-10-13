package com.samsung.main;

import java.util.Scanner;
public class NumSize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println((int)Math.log10(N)+1);
    }
}
