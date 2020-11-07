package com.company;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args){
        System.out.println("Introduce tu nombre");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("Introduce tu primer apellido");
        Scanner entrada = new Scanner(System.in);
        String surname1 = entrada.next();

        System.out.println("Introduce tu segundo apellido");
        Scanner entrada2 = new Scanner(System.in);
        String surname2 = entrada2.next();

        System.out.println("Hola " + name + " " + surname1 + " " + surname2);
    }
}
