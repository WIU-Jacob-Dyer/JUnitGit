package org.greenshirtgames;

public class Calculation {

    public static double add(double a, double b){
        return a + b;
    }

    public static double sub(double a, double b){
        return a - b;
    }

    public static double divide(double a, double b){
        return a / b;
    }

    public static double mul(double a, double b){
        return a * b;
    }

    public static int factorial(int a){
        if(a < 0){
            return 0;
        }

        if(a == 1 || a == 0){
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }
}
