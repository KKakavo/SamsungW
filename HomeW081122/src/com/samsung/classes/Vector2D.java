package com.samsung.classes;

public class Vector2D {
    public double vX;
    public double vY;
    public static int count;
    Vector2D(){
        vX=1;
        vY = 1;
        count++;
    }
    public Vector2D(double vX,double vY){
        this.vX = vX;
        this.vY = vY;
        count++;
    }
    public Vector2D(Vector2D vector){
        vX = vector.vX;
        vY = vector.vY;
        count++;
    }
    public void print(){
        System.out.println("(" + String.format("%.2f", vX) + ", " + String.format("%.2f", vY) + ")");
    }
    public double length(){
        return Math.sqrt(vX * vX + vY * vY);
    }
    public void add(Vector2D v){
        vX += v.vX;
        vY += v.vY;
    }
    public void sub(Vector2D v){
        vX -= v.vX;
        vY -= v.vY;
    }
    public void scale(double ScaleFactor){
        vX *= ScaleFactor;
        vY *= ScaleFactor;
    }
    public void normalized(){
        double length = this.length();
        vX/=length;
        vY/=length;
    }
    public double dotProduct(Vector2D v){
        return vX * v.vX + vY * v.vY;
    }
}
