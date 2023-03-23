package com.godoro.draw;

public class Test {

    public static void main(String[] args) {

        Drawer drawer=new Drawer();
        Function f1=new Polynomial(new double[]{-6,5,1});
        drawer.draw(f1,10,15,5);
        Function f2=new Sinusoidal(10,2,Math.PI/6);
        drawer.draw(f2,20,30,8);
    }
}
