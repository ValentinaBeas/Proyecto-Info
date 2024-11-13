package Pila_Cola;

public class Pila {
    private final int[] arreglo;
    private int top;

    public Pila(int tamaño) {
        arreglo = new int[tamaño];
        top = -1; // Indica que la pila esta vacia
    }

    // Metodo para agregar un elemento a la pila
    public void push(int elemento) {
        if (top < arreglo.length - 1) {
            arreglo[++top] = elemento;
        } else {
            System.out.println("La pila esta llena.");
        }
    }

    // Metodo para eliminar el elemento en la cima de la pila
    public int pop() {
        if (top >= 0) {
            return arreglo[top--];
        } else {
            System.out.println("La pila esta vacia.");
            return -1;
        }
    }

    // Metodo para ver el elemento en la cima sin eliminarlo
    public int peek() {
        if (top >= 0) {
            return arreglo[top];
        } else {
            System.out.println("La pila esta vacia.");
            return -1;
        }
    }

    // Metodo para verificar si la pila esta vacia
    public boolean estaVacia() {
        return top == -1;
    }
    
    //Metodo para imprimir la pila
    public void imprimirPila(){
        System.out.print("Elementos en la pila: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
