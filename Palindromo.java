package Pila_Cola;

public class Palindromo {
    // Metodo para verificar si una cadena es un palindromo
    public static boolean esPalindromo(String cadena) {
        cadena = cadena.replace(" ", "").toLowerCase();
        int longitud = cadena.length();
        Pila pila = new Pila(longitud / 2);

        // Llenar la pila con la primera mitad de la cadena
        for (int i = 0; i < longitud / 2; i++) {
            pila.push(cadena.charAt(i));
        }

        // Verificar la segunda mitad de la cadena
        for (int i = (longitud + 1) / 2; i < longitud; i++) {
            if (pila.pop() != cadena.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
