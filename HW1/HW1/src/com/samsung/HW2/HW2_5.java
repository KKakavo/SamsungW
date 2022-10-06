package com.samsung.HW2;
import java.util.Scanner;
public class HW2_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        int fourth = in.nextInt();
        boolean ans = (first == -1*second || first == -1 * third || first == -1*fourth)?true : (second == -1* third || second == -1 * fourth)? true : (third == -1 * fourth)?true:false;
        System.out.println(ans);
    }
}
