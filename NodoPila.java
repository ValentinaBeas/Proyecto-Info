package Pila_Cola_List;

public class NodoPila {
    String dato;
    NodoPila siguiente;

    public NodoPila(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    public NodoPila(String dato, NodoPila siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
}
