//7. Ordenamiento de Cola
//  a. Escribe un programa que ordene una cola de números enteros de forma ascendente. Puedes usar una pila como estructura auxiliar.

package Pila_Cola_List;

import java.util.Scanner;
import java.util.Stack;

public class Main7 {
    public static void ordenarCola(Cola cola) {
        Stack<Integer> stack = new Stack<>();

        // Paso 1: Mover todos los elementos de la cola a la pila
        while (!cola.isEmpty()) {
            int temp = cola.dequeue();

            // Paso 2: Ordenar la pila en orden ascendente
            while (!stack.isEmpty() && stack.peek() > temp) {
                cola.enqueue(stack.pop());
            }
            stack.push(temp);
        }

        // Paso 3: Mover los elementos de vuelta a la cola en orden ascendente
        while (!stack.isEmpty()) {
            cola.enqueue(stack.pop());
        }
    }

    public static void menu () {
        Scanner scanner = new Scanner(System.in);
        Cola cola = new Cola();

        System.out.println("Ingrese números enteros para encolar (ingrese '0' para terminar):");
        int numero;
        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();
            if (numero != 0) {
                cola.enqueue(numero);
            }
        } while (numero != 0);

        System.out.println("Cola antes de ordenar:");
        cola.mostrarCola();

        // Ordenar la cola
        ordenarCola(cola);

        System.out.println("Cola después de ordenar en forma ascendente:");
        cola.mostrarCola();

        scanner.close();
    }
}
