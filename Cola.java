package Pila_Cola;

public class Cola {
    private int[] arreglo;
    private int front, back;

    public Cola(int tamano) {
        arreglo = new int[tamano];
        front = 0;
        back = -1;
    }

    // Metodo para agregar un elemento al final de la cola
    public void enqueue(int elemento) {
        if (back < arreglo.length - 1) {
            arreglo[++back] = elemento;
        } else {
            System.out.println("La cola esta llena.");
        }
    }

    // Metodo para eliminar el elemento del frente de la cola
    public int dequeue() {
        if (front <= back) {
            return arreglo[front++];
        } else {
            System.out.println("La cola esta vacia.");
            return -1;
        }
    }

    // Metodo para ver el elemento del frente sin eliminarlo
    public int top() {
        if (front <= back) {
            return arreglo[front];
        } else {
            System.out.println("La cola esta vacia.");
            return -1;
        }
    }

    // Metodo para verificar si la cola esta vacia
    public boolean estaVacia() {
        return front > back;
    }
    
    public void imprimirCola() {
    if (estaVacia()) {
        System.out.println("La cola esta vacia.");
        return;
    }
    System.out.print("Cola: ");
    for (int i = front; i <= back; i++) {
        System.out.print(arreglo[i] + " ");
    }
    System.out.println();
}

     
}