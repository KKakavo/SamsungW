package com.samsung.additional1;
import java.util.Scanner;
public class NumFact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 1;
        for (int i = 2; i <= n ; i++) ans *= i;
        System.out.println(ans);
    }
}
