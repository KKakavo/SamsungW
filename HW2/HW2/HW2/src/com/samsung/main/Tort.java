package com.samsung.main;
import java.util.Scanner;
public class Tort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 100 / 10 ==1 || (n % 10 >=5 && n % 10 <=9) || n == 0) System.out.println(n + " TORTOV");
        else if(n % 10 == 1) System.out.println(n + " TORT");
        else System.out.println(n + " TORTA");
    }
}
