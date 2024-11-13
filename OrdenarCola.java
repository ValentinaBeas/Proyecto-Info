package Pila_Cola;

public class OrdenarCola {
    // Metodo para ordenar una cola en orden ascendente usando una cola auxiliar
    public static void ordenarColaAscendente(Cola cola) {
        Cola colaAuxiliar = new Cola(10); // Tamaño de la cola auxiliar se puede ajustar

        while (!cola.estaVacia()) {
            int min = cola.dequeue();
            
            // Mover elementos que sean mayores que el elemento actual (min) de regreso a cola
            while (!colaAuxiliar.estaVacia() && colaAuxiliar.top() < min) {
                cola.enqueue(colaAuxiliar.dequeue());
            }
            
            // Insertar el minimo en la cola auxiliar
            colaAuxiliar.enqueue(min);
        }

        // Mover los elementos ordenados desde la cola auxiliar a la cola original
        while (!colaAuxiliar.estaVacia()) {
            cola.enqueue(colaAuxiliar.dequeue());
        }
    }
}
