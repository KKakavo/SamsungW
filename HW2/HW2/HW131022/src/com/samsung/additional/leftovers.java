package com.samsung.additional;
import java.util.Scanner;
public class leftovers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int n = 10000;
        boolean flag = true;
        while(n <= 99999){
            if(n % a == b && n % c == d){
                System.out.print(n + " ");
                flag = false;
            }
            n++;
        }
        if(flag)System.out.println(-1);
    }
}
