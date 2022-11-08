package com.samsung;
import java.util.Scanner;
import com.samsung.model.Person;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toOctalString(n));
        System.out.println(Integer.toHexString(n));
        if(n <= Byte.MAX_VALUE && n >= Byte.MIN_VALUE)
            System.out.println("YES");
        else
            System.out.println("NO");
        if(n <= Short.MAX_VALUE && n >= Short.MIN_VALUE)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
