package com.samsung.main;
import java.util.Scanner;
public class SortNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if(x > y)
            if(y > z) System.out.println(z + " " + y + " " + x);
            else if(z > x) System.out.println(y + " " + x + " " + z);
            else System.out.println(y + " "+ z + " " + x);
        else
            if(x > z) System.out.println(z + " "+ x +" " + y);
            else if(z > y) System.out.println(x + " " + y + " " + z);
            else System.out.println(x + " "+ z + " " + y);
    }
}
