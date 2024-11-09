package Recursividad;

import java.util.Scanner;

public class EJ_5 {
    public static void menu() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese 2 numeros para multiplicarlos:\nIngrese A:");
            int a = sc.nextInt();
            System.out.println("ingrese B:");
            int b = sc.nextInt();
            System.out.println("\n");
            System.out.println(a + " multiplicado por " + b +" = "+multiplicacion(a, b));
        }

    }
    public static int multiplicacion (int a, int b){
        if (b == 0){
            return 0;
        } else {
            return a + multiplicacion(a, b-1);
        }
    }
}
