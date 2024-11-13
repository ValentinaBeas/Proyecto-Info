package Pila_Cola_List;

import java.util.Stack;

public class Cola {
    private NodoCola inicio, ultimo;

    // Constructor
    public Cola() {
        inicio = null;
        ultimo = null;
    }

    // Método para saber si la cola está vacía
    public boolean isEmpty() {
        return inicio == null;
    }

    // Método para agregar un elemento de tipo int al final de la cola (enqueue)
    public void enqueue(int dato) {
        NodoCola nuevo = new NodoCola(dato);  // Crear nodo con el valor int
        nuevo.siguiente = null;

        if (isEmpty()) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    // Método para extraer el primer elemento de tipo int de la cola (dequeue)
    public int dequeue() {
        if (!isEmpty()) {
            int dato = inicio.dato;
            inicio = inicio.siguiente;
            if (inicio == null) {
                ultimo = null;
            }
            return dato;
        }
        return Integer.MAX_VALUE; // Devuelve un valor alto para indicar que la cola está vacía
    }

    // Método para ver el primer elemento de tipo int de la cola sin extraerlo (top)
    public int top() {
        if (!isEmpty()) {
            return inicio.dato;
        }
        return Integer.MAX_VALUE; // Devuelve un valor alto para indicar que la cola está vacía
    }

    // Método para mostrar el contenido de la cola
    public void mostrarCola() {
        NodoCola recorrido = inicio;
        Stack<Integer> stack = new Stack<>();

        // Agregar elementos de la cola a la pila para mostrar en orden inverso
        while (recorrido != null) {
            stack.push(recorrido.dato);
            recorrido = recorrido.siguiente;
        }

        // Imprimir los elementos de la pila
        System.out.print("Contenido de la cola: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    /////////////////////////// MÉTODOS CON CHAR PARA MAIN8 /////////////////////////

    // Método para agregar un elemento de tipo char al final de la cola (enqueueC)
    public void enqueueC(char data) {
        NodoCola nuevo = new NodoCola(data);  // Crear nodo con el valor char
        if (isEmpty()) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    // Método para extraer el primer elemento de tipo char de la cola (dequeueC)
    public char dequeueC() {
        if (!isEmpty()) {
            char data = inicio.data;
            inicio = inicio.siguiente;
            if (inicio == null) {
                ultimo = null;
            }
            return data;
        }
        return '\0'; // Devuelve un carácter nulo si la cola está vacía
    }
}
