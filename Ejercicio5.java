package com.company;

import java.util.Scanner;

public class Ejercicio5 {

    public static int checkHour(int H){
        if (H < 0 || H > 24){
            System.out.println("Has introducido una hora no válida (0-24)");
        }
        return H;
    }

    public static int checkMin(int M){
        if (M < 0 || M > 59){
            System.out.println("Has introducido una cantidad de minutos no válida");
        }
        return M;
    }

    public static int checkSec(int S){
        if(S < 0 || S > 59){
            System.out.println("Has introducido una cantidad de segundos no válida");
        }
        return S;
    }


    public static void main (String[] args){

        System.out.println("Introduce una hora (0-24)");
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        checkHour(hour);

        System.out.println("Introduce los minutos (0-59)");
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        checkMin(minutes);

        System.out.println("Introduce los segundos (0-59)");
        Scanner scan = new Scanner(System.in);
        int seconds = scan.nextInt();
        checkSec(seconds);

        System.out.printf("La hora introducida es correcta\nLa hora es: %d %d %d ", hour, minutes, seconds);
    }
}
