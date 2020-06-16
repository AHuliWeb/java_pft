package ru_stqa_pft_sandbox;
public class MyFirstProgramm {
    public static void main (String[] args){
        hello ("World");
        hello ("Alexa");
        double l = 5;
        System.out.println("area of square with side " + l + " = " + area(l));
        double a = 4;
        double b = 6;
        System.out.println("area of triangel with sides " + a + " and " + b + " = " + area(a, b));
        }
    public static void hello (String someone){
        System.out.println("Hello, " + someone + "!");

    }
    public static double area (double len){
            return len*len;
    }
    public static double area (double a, double b){
        return a*b;
    }


}

