//Escribe una función recursiva que calcule la potencia de un número base elevado a un exponente. 
//Por ejemplo, 2^3=2*2*2=8

package Recursividad;

import java.util.Scanner;

public class EJ3 {
    public static void menu() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ingrese la base");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("ingrese el exponente");
            int b = Integer.parseInt(sc.nextLine());
            System.out.println("\n");
            System.out.println(a + " elevado a " + b +" = "+potencia(a, b));
        }

    }
    public static int potencia (int a, int b){
        if (b == 0){
            return 1;
        } else {
            return a * potencia(a, b-1);
        }
    }
}
