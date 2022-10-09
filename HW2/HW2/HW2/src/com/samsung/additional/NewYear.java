package com.samsung.additional;
import java.util.Scanner;
public class NewYear {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int Days = in.nextInt();
        int DaysSum=Days;
        month--;
        switch (month){
            case 11:
                DaysSum+=30;
            case 10:
                DaysSum+=31;
            case 9:
                DaysSum+=30;
            case 8:
                DaysSum+=31;
            case 7:
                DaysSum+=31;
            case 6:
                DaysSum+=30;
            case 5:
                DaysSum+=31;
            case 4:
                DaysSum+=30;
            case 3:
                DaysSum+=31;
            case 2:
                DaysSum+=28;
            case 1:
                DaysSum+=31;
            case 0:
                break;
            default:
                DaysSum=366;
        }
        month++;
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && Days > 31)
            DaysSum=366;
        else if ((month == 4 || month == 6 || month == 9 || month == 11) && Days > 30)
            DaysSum=366;
        else if (month == 2 && Days > 28)
            DaysSum=366;

        System.out.println(365 - DaysSum);
    }
}
