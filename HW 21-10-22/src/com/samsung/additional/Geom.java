package com.samsung.additional;

public class Geom {
    public static void main(String[] args) {
        System.out.println(trianglePerimetr(0, 0, 1, 0, 0, 1));
    }
    public static double segmentLength(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    public static double trianglePerimetr(int x1, int y1, int x2, int y2, int x3, int y3){
        double P= segmentLength(x1,y1,x2,y2) + segmentLength(x1,y1,x3,y3) + segmentLength(x2,y2,x3,y3);
        return P;
    }
}
