package ArbolBinario;
class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRecursivo(nodo.derecho, valor);
        }
        return nodo;
    }

    public void inorder() {
        inorderRecursivo(raiz);
        System.out.println();
    }

    private void inorderRecursivo(Nodo nodo) {
        if (nodo != null) {
            inorderRecursivo(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inorderRecursivo(nodo.derecho);
        }
    }

    public int depth() {
        return calcularProfundidad(raiz);
    }

    private int calcularProfundidad(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        int profundidadIzquierda = calcularProfundidad(nodo.izquierdo);
        int profundidadDerecha = calcularProfundidad(nodo.derecho);
        return Math.max(profundidadIzquierda, profundidadDerecha) + 1;
    }

    public void dtree(int valor) {
        raiz = borrarRecursivo(raiz, valor);
    }

    private Nodo borrarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            System.out.println("Valor no encontrado en el arbol.");
            return null;
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = borrarRecursivo(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = borrarRecursivo(nodo.derecho, valor);
        } else {
            if (nodo.izquierdo == null && nodo.derecho == null) {
                return null;
            }
            if (nodo.izquierdo == null) {
                return nodo.derecho;
            } else if (nodo.derecho == null) {
                return nodo.izquierdo;
            }
            nodo.valor = encontrarMinimo(nodo.derecho);
            nodo.derecho = borrarRecursivo(nodo.derecho, nodo.valor);
        }
        return nodo;
    }

    private int encontrarMinimo(Nodo nodo) {
        int minimo = nodo.valor;
        while (nodo.izquierdo != null) {
            minimo = nodo.izquierdo.valor;
            nodo = nodo.izquierdo;
        }
        return minimo;
    }

    // Metodo para imprimir el arbol en formato estructurado
    public void imprimir() {
        imprimirRecursivo(raiz, 0);
    }

    private void imprimirRecursivo(Nodo nodo, int nivel) {
        if (nodo != null) {
            imprimirRecursivo(nodo.derecho, nivel + 1);
            // Imprime espacios para mostrar la estructura en niveles
            for (int i = 0; i < nivel; i++) {
                System.out.print("    ");
            }
            System.out.println(nodo.valor);
            imprimirRecursivo(nodo.izquierdo, nivel + 1);
        }
    }
}
