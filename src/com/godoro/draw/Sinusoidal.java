package com.godoro.draw;

public class Sinusoidal implements Function{

   private double a;
   private double b;
   private double c;

   public Sinusoidal(double a, double b, double c) {
      this.a = a;
      this.b = b;
      this.c = c;
   }


   @Override
   public double evaulate(double x) {
      return a*Math.sin(b*x+c);
   }
}
