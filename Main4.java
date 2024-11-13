//4. Conversión de Decimal a Binario:
//    a. Crea un programa que convierta un número decimal a su
//      representación en binario utilizando una pila. Puedes usar el 
//      algoritmo de división sucesiva por 2.
package Pila_Cola_List;

import java.util.Scanner;

public class Main4 {
    public static String convertirADecimalABinario(int numero) {
        Pila pila = new Pila();

        // Continuar dividiendo el número entre 2 hasta que el número sea 0
        while (numero > 0) {
            int residuo = numero % 2;
            pila.ultimo=pila.insertar(String.valueOf(residuo),pila.ultimo);  // Insertar el residuo en la pila
            numero = numero / 2;
        }

        // Construir el número binario extrayendo los elementos de la pila
        StringBuilder binario = new StringBuilder();
        while (!pila.isEmpty()) {
            binario.append(pila.obtenerTop());  // Obtener el último elemento en la pila
            pila.ultimo=pila.borrar(pila.ultimo); // Sacar el último elemento de la pila
        }

        return binario.toString();
    }

    public static void menu () {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese el numero que desea pasar a binario: ");
        numero = scanner.nextInt();
        String binario = convertirADecimalABinario(numero);
        System.out.println("\n* El número " + numero + " en binario es: " + binario);

        scanner.close();
    }
}
