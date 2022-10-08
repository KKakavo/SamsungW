package com.samsung.main;

import java.util.Scanner;
public class NumType {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N>=0 && N<10) System.out.println("DIGIT");
        else if (N>=10 && N<100) System.out.println("NUM");
        else System.out.println("OTHER");
    }
}
