package com.company;

import java.util.Scanner;

class Number {

    public static boolean check(int a, int b, int c, int d){
        boolean operation;
        if ((a * d) - (b * c) != 0){
            operation = true;
        } else {
            operation = false;
        }
        return operation;
    }

    public static double solutionX(double a, double b, double c, double d, double e, double f){
        double numerator = (e * d) - (b * f);
        double denominator = (a * d) - (b * c);
        double x = numerator / denominator;

        return x;
    }

    public static double solutionY(double a, double b, double c, double d, double e, double f){
        double numerator = (a * f) - (e * c);
        double denominator = (a * d) - (b * c);
        double y = numerator / denominator;

        return y;
    }
}

public class TestEquation {
    public static void main(String[] args) {
        System.out.print("Con este programa puedes a resolver  ecuaciones lineal: \n");
        System.out.print("ax + by = e \n");
        System.out.print("cx + dy = f \n");

        if (Number.check(1, 1, 2, 2) == true) {
            int i = 0;
            do {
                i++;
                System.out.println("x = " + Number.solutionX(1,1,2,2,1,2));
                System.out.println("y = " + Number.solutionY(2,1,-1,2, 7,-1));
            } while (i <= 1);
        } else {
            System.out.println("No tiene solución");
        }
    }
}
