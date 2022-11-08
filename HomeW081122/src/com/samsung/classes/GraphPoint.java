package com.samsung.classes;

public class GraphPoint extends Point{
    float[]a;
    public GraphPoint(float x, float y,float[]a){
        super(x, y);
        this.a = new float[a.length];
        for (int i = 0; i < a.length; i++) {
            this.a[i] = a[i];
        }
    }
    public void print(){
        for (float i : a) {
            System.out.print(i + " ");
        }
    }
}
