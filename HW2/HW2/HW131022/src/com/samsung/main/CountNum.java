package com.samsung.main;
import java.util.Scanner;
public class CountNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n,count = 0;
        do{
            n = in.nextInt();
            count++;
        }while(n>=0);
        System.out.println(count);
    }
}
