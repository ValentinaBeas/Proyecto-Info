//Escribe una función recursiva que imprima un conteo regresivo desde un número n hasta 1. 
//Por ejemplo, n=4 es 4,3,2,1.

package Recursividad;

import java.util.Scanner;

public class EJ_4 {
    public static void menu() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el numero para conteo regresivo");
            int num = sc.nextInt();
            System.out.println("***CONTEO REGRESIVO***");
            conteo (num);
        }
    }

    public static int conteo (int num){
    if (num <= 0){
        return 1;
    } else {
        System.out.println("" + num);
        return conteo(num-1);
        }
    }
}
