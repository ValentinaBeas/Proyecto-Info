package proyecto;
public class Nodo {
    int key; // Valor del nodo
    int height; // Altura del nodo
    Nodo left, right; // Hijos izquierdo y derecho

    // Constructor del nodo
    public Nodo(int key) {
        this.key = key;
        this.height = 1; // Los nodos nuevos tienen altura 1
        this.left = null;
        this.right = null;
    }
}

