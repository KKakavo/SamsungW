package com.samsung.additional;
import java.util.Scanner;
public class RomNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String res="";
        String doz="";
        if(N / 100 == 1 )
            res+="C";
         N = N%100;
        switch (N / 10 % 5){
            case 4:
                if(N / 10 == 4)
                    doz+="XL";
                if(N / 10 == 9)
                    doz+="XC";
                break;
            case 3:
                doz+="X";
            case 2:
                doz+="X";
            case 1:
                doz+="X";
            case 0:
                if(N / 10 >= 5)
                    doz="L"+doz;

        }
        String units="";
        switch (N % 5){
            case 4:
                if(N % 10 == 9)
                    units+="IX";
                if(N % 10 == 4)
                    units+="IV";
                break;
            case 3:
                units+="I";
            case 2:
                units+="I";
            case 1:
                units+="I";
            case 0:
                if(N % 10 >= 5)
                    units="V"+units;

        }
        res = res + doz + units;
        System.out.println(res);
    }
}
