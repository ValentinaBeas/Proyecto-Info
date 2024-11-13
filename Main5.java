//5. Implementación de una Cola con lista:
//  a. Crea una clase que represente una Cola y Nodo.
//  b. Implementa métodos para enqueue (agregar un elemento al final), dequeue (eliminar el elemento del frente) y top (ver el elemento del frente sin eliminarlo).
//  c. Prueba tu implementación utilizando diferentes operaciones y elementos.

package Pila_Cola_List;

public class Main5 {
    public static void menu () {
        Cola cola = new Cola();

        // Insertar elementos en la cola
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);

        // Mostrar el contenido de la cola
        System.out.println("\n* Cola después de las inserciones:");
        cola.mostrarCola();
        System.out.println("");

        // Ver el primer elemento sin extraerlo (top)
        System.out.println("Primer elemento de la cola (top): " + cola.top());

        System.out.println("");

        // Extraer un elemento de la cola
        int extraido = cola.dequeue();
        System.out.println("* Elemento extraído de la cola: " + extraido);
        System.out.println("\n* Cola después de extraer el primer elemento:");
        cola.mostrarCola();

        System.out.println("");
    }
}
