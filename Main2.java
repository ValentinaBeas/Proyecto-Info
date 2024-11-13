//Pila de Palabras:
//  a. Implementa una pila que almacene palabras. Crea un programa que solicite 
//  al usuario ingresar palabras y las apile. Luego, desapílalas e imprímelas en orden inverso.
package Pila_Cola_List;

import java.util.Scanner;

public class Main2 {
    public static void menu () {
        Pila h = new Pila();
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        int i = 1;
        String palabra;

        do {
            System.out.println("¿Quiere ingresar una palabra?");
            System.out.println("0. NO\t 1. SI");
            op = Integer.parseInt(scanner.nextLine());

            if (op == 1) {
                System.out.print(i + "° palabra: ");
                palabra = scanner.nextLine();

                h.ultimo=h.insertar(palabra,h.ultimo);
                System.out.println("\n**PILA COMPLETA**");
                System.out.println("");
                h.imprimir(h.ultimo);
                i++;
                
            }
        } while (op == 1);

        System.out.println("\n*** PILA FINAL ***");
        h.imprimir(h.ultimo);
        System.out.println("");

        

        for (int j = 0; j <= h.getTamaño()+1; j++){

            h.ultimo=h.borrar(h.ultimo);
            System.out.println("* Ultimo elemento eliminado:");
            h.imprimir(h.ultimo);
        }

        System.out.println("Lista Vacía1");
        System.out.println("\nPrograma terminado.");
        scanner.close();
    }

    
}
