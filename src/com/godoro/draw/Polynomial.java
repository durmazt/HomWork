package com.godoro.draw;

public class Polynomial implements Function{

    double [] coefficients;

    public Polynomial(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double evaulate(double x) {
        double y=0;
        int ix=0;
        for(double coef: coefficients)
        {
            y+=coef*Math.pow(x,ix);
            ix++;
        }

        return y;
    }
}
