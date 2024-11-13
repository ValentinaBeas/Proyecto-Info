package Pila_Cola;

import java.util.Scanner;

public class SubmenuPilaCola {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Pila pila = new Pila(10);
        int opcion;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Operaciones con Pila");
            System.out.println("2. Verificar Palindromo");
            System.out.println("3. Verificar Expresion Matematica Equilibrada");
            System.out.println("4. Operaciones con Cola");
            System.out.println("5. Ordenar Cola");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    pila.push(12);
                    pila.push(24);
                    pila.push(11);
                    pila.push(29);
                    pila.push(31);
                    pila.push(105);
                    pila.push(10);
                    pila.push(2);
                    pila.imprimirPila();
                    System.out.println("Tope de la pila: " + pila.peek());
                    pila.pop();
                    System.out.println("Tope de la pila despues de pop: " + pila.peek());
                    break;

                case 2:
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese una cadena: ");
                    String cadena = scanner.nextLine();
                    System.out.println("Es palindromo: " + Palindromo.esPalindromo(cadena));
                    break;

                case 3:
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese una expresion matematica: ");
                    String expresion = scanner.nextLine();
                    System.out.println("Expresion equilibrada: " + ExpresionMatematica.estaEquilibrada(expresion));
                    break;

                case 4:
                    Cola colaOperaciones = new Cola(10);
                    colaOperaciones.enqueue(3);
                    colaOperaciones.enqueue(4);
                    colaOperaciones.enqueue(100);
                    colaOperaciones.enqueue(45);
                    colaOperaciones.enqueue(33);
                    colaOperaciones.enqueue(14);
                    colaOperaciones.enqueue(23);
                    colaOperaciones.enqueue(84);
                    colaOperaciones.imprimirCola();
                    System.out.println("Frente de la cola: " + colaOperaciones.top());
                    colaOperaciones.dequeue();
                    System.out.println("Frente de la cola despues de dequeue: " + colaOperaciones.top());
                    break;

                case 5:
                    Cola colaOrdenar = new Cola(10);
                    colaOrdenar.enqueue(5);
                    colaOrdenar.enqueue(2);
                    colaOrdenar.enqueue(9);
                    colaOrdenar.enqueue(1);
                    System.out.println("Ordenando cola...");
                    OrdenarCola.ordenarColaAscendente(colaOrdenar);
                    while (!colaOrdenar.estaVacia()) {
                        System.out.print(colaOrdenar.dequeue() + " ");
                    }
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
