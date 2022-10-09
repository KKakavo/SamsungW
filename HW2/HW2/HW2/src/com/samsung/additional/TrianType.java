package com.samsung.additional;
import java.util.Scanner;
public class TrianType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int biggest,first,second;

        if(a > b) {
            if (a > c) {
                biggest = a;
                first = c;
            } else {
                biggest = c;
                first = a;
            }
            second = b;
        } else {
            if (b > c) {
                biggest = b;
                first = c;
            } else {
                biggest = c;
                first  = b;
            }
            second = a;
        }

        if(second + first <= biggest)
            System.out.println("impossible");
        else if(first*first + second*second == biggest*biggest)
            System.out.println("right");
        else if(first*first + second*second > biggest*biggest)
            System.out.println("acute");
        else if(first*first + second*second < biggest*biggest)
            System.out.println("obtuse");
    }
}
