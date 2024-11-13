package Pila_Cola_List;

import java.util.Scanner;

public class Main6 {
    public static void menu () {
        Cola c = new Cola();
        Scanner scanner = new Scanner(System.in);
        int op;
        int num;
        int i = 1;
        int suma = 0;
        do{
            System.out.println("\n¿Desea ingresar una número?");
            System.out.println("0. NO\t 1. SI");
            op = scanner.nextInt();

            if (op == 1) {
                System.out.print(i + "° número: ");
                num = scanner.nextInt();

                c.enqueue(num);
                System.out.println("\n**COLA COMPLETA**");
                System.out.println("");
                c.mostrarCola();
                i++;   
            }
        } while (op != 0);

        System.out.println("\n***COLA FINAL***");
        c.mostrarCola();
        System.out.println("");
        
        while (!c.isEmpty()){
            int valor = c.dequeue();
            suma = suma + valor;
            System.out.println("Número descolado: "+ valor);
        }

        System.out.println("\nLa sumatoria de todos los valores es de: "+suma);
        System.out.println("");
        scanner.close();
    }
}
