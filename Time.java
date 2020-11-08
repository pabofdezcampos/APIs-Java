package com.company;

import java.util.Scanner;

public class Time {
    public static void main(String[] args){
        int H, M, S;
        System.out.println("Introduce la hora (0-23)");
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();

        System.out.println("Introduce los minutos (0-59)");
        Scanner scanner = new Scanner(System.in);
        M = scanner.nextInt();

        System.out.println("Introduce los segundos (0-59)");
        Scanner scan = new Scanner(System.in);
        S = scan.nextInt();

        if(H < 0 || H > 23 || M < 0 || M > 59 || S < 0 || S > 59) {
            System.out.println("Hora introducida no válida");
        } else {
            System.out.println("Hora introducida válida: " + H + " " + M + " " + S);
        }
    }
}
