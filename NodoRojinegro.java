package ArbolRojinegro;

class NodoRojinegro {
    int valor;
    NodoRojinegro izquierdo, derecho, padre;
    boolean color; // true para rojo, false para negro

    public NodoRojinegro(int valor) {
        this.valor = valor;
        this.izquierdo = this.derecho = this.padre = null;
        this.color = true; // Nuevo nodo es rojo por defecto
    }
}
