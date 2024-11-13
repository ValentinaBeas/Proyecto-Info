//1. Implementación de una Pila con lista:
//  a. Crea una clase que represente una pila utilizando una lista.
//  b. Implementa métodos para push (agregar un elemento), pop (eliminar
//      el elemento en la cima) y top (ver el elemento en la cima sin eliminarlo).
//  c. Prueba tu implementación utilizando diferentes operaciones y elementos.

package Pila_Cola_List;

public class Main1 {
    public static void menu () {
        Pila h = new Pila();
        System.out.println("Orden de ingreso de Strings: 'Casa','Auto','Pileta'");
        h.ultimo = h.insertar("Casa",h.ultimo);
        h.ultimo = h.insertar("Auto",h.ultimo);
        h.ultimo = h.insertar("Pileta",h.ultimo);
    
        System.out.println("\nPILA COMPLETA");
        h.imprimir(h.ultimo);

        System.out.println("PILA ACTUALIZADA(Eliminacion de ultimo elemento)");
        h.ultimo=h.borrar(h.ultimo);
        h.imprimir(h.ultimo);
        h.mostrarTamaño();

        System.out.print("El top de la pila es ");
        h.mostrarTop();
    }
}
