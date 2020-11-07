package com.company;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args){
        int third, second, first;

        System.out.println("Introduce un número de 3 cifras");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        third = number % 10;

        number = number / 10;
        second = number % 10;

        number = number / 10;
        first = number % 10;

        System.out.printf("%d\n%d\n%d", first, second, third);
        }
}
