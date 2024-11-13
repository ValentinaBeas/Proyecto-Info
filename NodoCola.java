package Pila_Cola_List;

public class NodoCola {
    int dato;
    char data;
    NodoCola siguiente;

    // Constructor para enteros
    public NodoCola(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    // Constructor para caracteres
    public NodoCola(char data) {
        this.data = data;
        this.siguiente = null;
    }
}
