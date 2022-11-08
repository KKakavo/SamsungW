package com.samsung;

import com.samsung.classes.Fraction;
import com.samsung.classes.GraphPoint;
import com.samsung.classes.Vector2D;

public class App {
    static String n = "Test";
    public static void main(String[] args) {
        float[] a = new float[]{1,2,3,4,5};
        GraphPoint p = new GraphPoint(1,2, a);
        p.print();
    }
}
