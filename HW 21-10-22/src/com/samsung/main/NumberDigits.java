package com.samsung.main;

public class NumberDigits {
    public static void main(String[] args) {
        //System.out.println(binFraction(0.9,10));
        binFraction(0.9,10);
    }
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>=1){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static int sumOfSeven(int a, int b){
        int sum = 0;
        for(int i = a;i <= b; i++)
            if( i / 10 >= 1 && i / 10 <=9 && i % 7 == 0)
                sum += i / 10 + i % 10;
        return sum;
    }
    public static int sumOfThirteen(int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            int sum = 0,nTemp = i;
            while(nTemp >= 1){
                sum += nTemp % 10;
                nTemp /= 10;
            }
            if(sum % 13 == 0)
                count++;
        }
        return count;
    }
    public static void binFraction(double x, int n){
        String ans = "";
        for(int i = 0; i < n; i++){
            x *=2;
            ans += Integer.toString((int)x);
            x = x - Math.floor(x);
        }
        System.out.println(ans);
    }
}
