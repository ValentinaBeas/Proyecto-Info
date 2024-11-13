package ArbolRojinegro;

class ArbolRN {
    private NodoRojinegro raiz;
    private final boolean ROJO = true;
    private final boolean NEGRO = false;

    // Metodo de insercion principal
    public void insertar(int valor) {
        NodoRojinegro nuevoNodo = new NodoRojinegro(valor);
        raiz = insertarNodo(raiz, nuevoNodo);
        balancearInsercion(nuevoNodo);
    }

    // Metodo para insertar el nodo en el arbol
    private NodoRojinegro insertarNodo(NodoRojinegro raiz, NodoRojinegro nodo) {
        if (raiz == null) return nodo;

        if (nodo.valor < raiz.valor) {
            raiz.izquierdo = insertarNodo(raiz.izquierdo, nodo);
            raiz.izquierdo.padre = raiz;
        } else if (nodo.valor > raiz.valor) {
            raiz.derecho = insertarNodo(raiz.derecho, nodo);
            raiz.derecho.padre = raiz;
        }
        return raiz;
    }

    // Balanceo despues de la insercion para cumplir las propiedades del Arbol Rojinegro
    private void balancearInsercion(NodoRojinegro nodo) {
        NodoRojinegro padre, abuelo;

        while (nodo != raiz && nodo.color == ROJO && nodo.padre.color == ROJO) {
            padre = nodo.padre;
            abuelo = padre.padre;

            if (padre == abuelo.izquierdo) {
                NodoRojinegro tio = abuelo.derecho;

                if (tio != null && tio.color == ROJO) {
                    abuelo.color = ROJO;
                    padre.color = NEGRO;
                    tio.color = NEGRO;
                    nodo = abuelo;
                } else {
                    if (nodo == padre.derecho) {
                        rotarIzquierda(padre);
                        nodo = padre;
                        padre = nodo.padre;
                    }
                    rotarDerecha(abuelo);
                    boolean tempColor = padre.color;
                    padre.color = abuelo.color;
                    abuelo.color = tempColor;
                    nodo = padre;
                }
            } else {
                NodoRojinegro tio = abuelo.izquierdo;

                if (tio != null && tio.color == ROJO) {
                    abuelo.color = ROJO;
                    padre.color = NEGRO;
                    tio.color = NEGRO;
                    nodo = abuelo;
                } else {
                    if (nodo == padre.izquierdo) {
                        rotarDerecha(padre);
                        nodo = padre;
                        padre = nodo.padre;
                    }
                    rotarIzquierda(abuelo);
                    boolean tempColor = padre.color;
                    padre.color = abuelo.color;
                    abuelo.color = tempColor;
                    nodo = padre;
                }
            }
        }
        raiz.color = NEGRO;
    }

    // Rotacion a la izquierda
    private void rotarIzquierda(NodoRojinegro nodo) {
        NodoRojinegro derecho = nodo.derecho;
        nodo.derecho = derecho.izquierdo;

        if (nodo.derecho != null) nodo.derecho.padre = nodo;
        derecho.padre = nodo.padre;

        if (nodo.padre == null) raiz = derecho;
        else if (nodo == nodo.padre.izquierdo) nodo.padre.izquierdo = derecho;
        else nodo.padre.derecho = derecho;

        derecho.izquierdo = nodo;
        nodo.padre = derecho;
    }

    // Rotacion a la derecha
    private void rotarDerecha(NodoRojinegro nodo) {
        NodoRojinegro izquierdo = nodo.izquierdo;
        nodo.izquierdo = izquierdo.derecho;

        if (nodo.izquierdo != null) nodo.izquierdo.padre = nodo;
        izquierdo.padre = nodo.padre;

        if (nodo.padre == null) raiz = izquierdo;
        else if (nodo == nodo.padre.derecho) nodo.padre.derecho = izquierdo;
        else nodo.padre.izquierdo = izquierdo;

        izquierdo.derecho = nodo;
        nodo.padre = izquierdo;
    }

    // Visualizacion del arbol en orden ascendente con colores
    public void imprimirArbolAscendente() {
        System.out.println("Arbol Rojinegro en orden ascendente:");
        imprimirEnOrden(raiz);
        System.out.println();
    }

    private void imprimirEnOrden(NodoRojinegro nodo) {
        if (nodo != null) {
            imprimirEnOrden(nodo.izquierdo);
            String color = nodo.color == ROJO ? "ROJO" : "NEGRO";
            System.out.print(nodo.valor + "(" + color + ") ");
            imprimirEnOrden(nodo.derecho);
        }
    }

    // Calcular la altura negra del arbol
    public int alturaNegra() {
        return alturaNegra(raiz);
    }

    private int alturaNegra(NodoRojinegro nodo) {
        if (nodo == null) return 0;
        int alturaIzquierda = alturaNegra(nodo.izquierdo);
        return (nodo.color == NEGRO ? 1 : 0) + alturaIzquierda;
    }
    
       // Verificación de las propiedades del Árbol Rojinegro
    public boolean verificarPropiedades() {
        if (raiz == null) return true;

        // Propiedad 1: La raíz debe ser negra
        if (raiz.color != NEGRO) {
            System.out.println("La raiz no es negra.");
            return false;
        }

        // Propiedad 2: Verifica que no haya nodos rojos consecutivos y que se mantenga la altura negra
        return verificarPropiedadNodo(raiz, 0, -1);
    }

    // Verifica las propiedades de un nodo y sus hijos
    private boolean verificarPropiedadNodo(NodoRojinegro nodo, int negrosContados, int alturaNegraEsperada) {
        // Caso base: Llegar a una hoja (nodo nulo) cuenta como altura negra
        if (nodo == null) {
            if (alturaNegraEsperada == -1) {
                // Primer nodo nulo encontrado, establece la altura negra esperada
                alturaNegraEsperada = negrosContados;
            } else if (negrosContados != alturaNegraEsperada) {
                // Todos los caminos deben tener la misma cantidad de nodos negros
                System.out.println("El arbol no cumple con la altura negra.");
                return false;
            }
            return true;
        }

        // Propiedad 2: Verifica que no haya nodos rojos consecutivos
        if (nodo.color == ROJO) {
            if ((nodo.izquierdo != null && nodo.izquierdo.color == ROJO) || 
                (nodo.derecho != null && nodo.derecho.color == ROJO)) {
                System.out.println("Nodos rojos consecutivos encontrados.");
                return false;
            }
        }

        // Si el nodo es negro, incrementa el contador de nodos negros
        if (nodo.color == NEGRO) negrosContados++;

        // Verifica recursivamente los hijos izquierdo y derecho
        return verificarPropiedadNodo(nodo.izquierdo, negrosContados, alturaNegraEsperada) &&
               verificarPropiedadNodo(nodo.derecho, negrosContados, alturaNegraEsperada);
    }
}

