package com.samsung.additional;
import java.util.Scanner;
public class HowManyDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.println(31);
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            System.out.println(30);
        else if (month == 2)
            System.out.println(28);
        else
            System.out.println(0);

    }
}
