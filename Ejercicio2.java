package com.company;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args){

        //La CLASE SCANNER es utilizada para para leer datos desde el teclado o desde un fichero.
        //Para poder usarla tendremos que importar java.util.Scanner.

        System.out.println("Introduce un token");
        Scanner entrada = new Scanner(System.in);
        /* new Scanner(System.in) --> De esta forma definimos el scanner, System.in para que interaccione con el usuario,
                                      de esta forma recoge los parámetros que le pasamos.
         */

        System.out.println(entrada.hasNext());
        /* .hasNext() --> comprueba si se ha introducido algún token o no, retorna true
                          o false.
         */

        System.out.println(entrada.hasNextInt());
        /* .hasNextInt() --> según el tipo de datos que introducimos, en este caso un Int,
                             comprueba si se ha introducido algún Int o no, retorna true
                             o false.
         */

        System.out.println(entrada.hasNextDouble());
        /*  .hasNextDouble() --> según el tipo de datos que introducimos, en este caso un Double,
                                 comprueba si se ha introducido algún Double o no, retorna true
                                 o false.
        */

        //CREAMOS UN NUEVO SCANNER PARA LOS SIGUIENTES EJEMPLOS
        String cadena = "Hola 23 123 Pablo";
        Scanner sc = new Scanner(cadena);
        System.out.println(sc.next()); //Imprime Hola
        System.out.println(sc.next()); //Imprime 23
        System.out.println(sc.next()); //Imprime 123
        // .next() --> encuentra el siguiente término de la variable y lo imprime.

        //CREAMOS UN NUEVO SCANNER PARA LOS SIGUIENTES EJEMPLOS
        System.out.println("Introduce tu número favorito");
        Scanner numero = new Scanner(System.in);
        int number = numero.nextInt();
        // .nextInt() --> para retornar el token del Scanner pero en formato Int,
        //                parsea el tipo de variable Scanner a Int.
        System.out.println(number);

        System.out.println("Introduce tu número decimal favorito");
        Scanner numeroD = new Scanner(System.in);
        double numberD = numeroD.nextDouble();
        // .nextDouble() --> para retornar el token del Scanner pero en formato Double,
        //                   parsea el tipo de variable Scanner a Double.
        System.out.println(numberD);
    }
}
