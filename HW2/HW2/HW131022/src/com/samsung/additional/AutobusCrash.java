package com.samsung.additional;
import java.util.Scanner;
public class AutobusCrash {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int autobusHeight = 437;
        int N = in.nextInt();
        int n = 1;
        String ans = "No crash";
        while(n <= N){
            int height = in.nextInt();
            if(autobusHeight >= height){
                ans = "Crash " + Integer.toString(n);
                break;
            }
            n++;
        }
        System.out.println(ans);
    }
}
