package Pila_Cola;

public class ExpresionMatematica {
    // Metodo para verificar si los parentesis estan equilibrados en una expresion
    public static boolean estaEquilibrada(String expresion) {
        Pila pila = new Pila(expresion.length());

        for (char caracter : expresion.toCharArray()) {
            if (caracter == '(') {
                pila.push(caracter);
            } else if (caracter == ')') {
                if (pila.estaVacia()) {
                    return false;
                }
                pila.pop();
            }
        }

        return pila.estaVacia();
    }
}
