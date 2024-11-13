//8. Verificación de Palíndromos con cola
//  a. Desarrolla un programa que verifique si una palabra o frase es un palíndromo (se lee igual de izquierda a derecha que de derecha a
//  izquierda), ignorando los espacios y signos de puntuación.
package Pila_Cola_List;

import java.util.Scanner;
import java.util.Stack;

public class Main8 {
    // Método para verificar si una frase es un palíndromo
    public static boolean esPalindromo(String frase) {
        Cola cola = new Cola();
        Stack<Character> stack = new Stack<>();

        // Procesar la frase: convertir a minúsculas y eliminar espacios y signos de puntuación
        frase = frase.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Insertar cada carácter en la cola y en la pila
        for (char ch : frase.toCharArray()) {
            cola.enqueueC(ch);  // Almacena en la cola
            stack.push(ch);     // Almacena en la pila
        }

        // Comparar caracteres de la cola y la pila
        while (!cola.isEmpty()) {
            char colaChar = cola.dequeueC(); // Extrae de la cola
            char stackChar = stack.pop();    // Extrae de la pila

            if (colaChar != stackChar) {
                return false; // Si los caracteres no coinciden, no es un palíndromo
            }
        }
        return true; // Si todos coinciden, es un palíndromo
    }

    public static void menu () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String frase = scanner.nextLine();

        // Verificar si la frase ingresada es un palíndromo
        boolean esPalindromo = esPalindromo(frase);

        if (esPalindromo) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }

        scanner.close();
    }
}
