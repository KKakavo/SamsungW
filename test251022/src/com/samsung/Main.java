package com.samsung;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean b = true;
        int sum = 0;
        do{
            String s = in.next();
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c != '0' && c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8' && c != '9') {
                    b = false;
                    break;
                }
            }
             if(b)
             sum += Integer.parseInt(s);
        }while(b);
        System.out.println(sum);
    }
}
