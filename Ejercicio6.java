package com.company;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String[] args){

        System.out.println("Introduce el número de columnas");
        Scanner sc = new Scanner(System.in);
        int column = sc.nextInt();

        System.out.println("Introduce un número");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number;){
            int matrix [][] = new int [1][column];
            for (int j = 0; j < matrix.length; j++){
                for (int k = 0; k < matrix[j].length; k++){
                    if(i <= number){
                        matrix[j][k] = i;
                        System.out.print(matrix[j][k] + " ");
                    }
                    i++;
                }
                System.out.println(" ");
            }
        }
    }
}
