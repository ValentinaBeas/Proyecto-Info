
package proyecto;
public class ArbolAVL {
    private Nodo root;

    // Obtener la altura de un nodo
    private int altura(Nodo N) {
        if (N == null)
            return 0;
        return N.height;
    }

    // Obtener el máximo entre dos valores
    private int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Rotación a la derecha
    private Nodo rotacionDerecha(Nodo y) {
        Nodo x = y.left;
        Nodo T2 = x.right;

        // Realizar la rotación
        x.right = y;
        y.left = T2;

        // Actualizar alturas
        y.height = max(altura(y.left), altura(y.right)) + 1;
        x.height = max(altura(x.left), altura(x.right)) + 1;

        return x; // Nueva raíz
    }

    // Rotación a la izquierda
    private Nodo rotacionIzquierda(Nodo x) {
        Nodo y = x.right;
        Nodo T2 = y.left;

        // Realizar la rotación
        y.left = x;
        x.right = T2;

        // Actualizar alturas
        x.height = max(altura(x.left), altura(x.right)) + 1;
        y.height = max(altura(y.left), altura(y.right)) + 1;

        return y; // Nueva raíz
    }

    // Rotación doble a la derecha (izquierda-derecha)
    private Nodo rotacionDobleDerecha(Nodo z) {
        z.left = rotacionIzquierda(z.left);
        return rotacionDerecha(z);
    }

    // Rotación doble a la izquierda (derecha-izquierda)
    private Nodo rotacionDobleIzquierda(Nodo z) {
        z.right = rotacionDerecha(z.right);
        return rotacionIzquierda(z);
    }

    // Obtener el factor de balance de un nodo
    private int obtenerBalance(Nodo N) {
        if (N == null)
            return 0;
        return altura(N.left) - altura(N.right);
    }

    // Insertar un nodo en el árbol AVL
    private Nodo insertar(Nodo nodo, int key) {
        // Inserción normal en árbol binario de búsqueda
        if (nodo == null)
            return new Nodo(key);

        if (key < nodo.key)
            nodo.left = insertar(nodo.left, key);
        else if (key > nodo.key)
            nodo.right = insertar(nodo.right, key);
        else
            return nodo; // No se permiten claves duplicadas

        // Actualizar la altura del nodo actual
        nodo.height = 1 + max(altura(nodo.left), altura(nodo.right));

        // Obtener el factor de balance
        int balance = obtenerBalance(nodo);

        // Verificar si el nodo está desbalanceado y realizar rotaciones si es necesario
        // Caso 1: Desbalance hacia la izquierda
        if (balance > 1 && obtenerBalance(nodo.left) > 1)
            return rotacionDerecha(nodo);

        // Caso 2: Desbalance hacia la derecha
        if (balance < -1 && obtenerBalance(nodo.right) < -1)
            return rotacionIzquierda(nodo);

        // Caso 3: Desbalance izquierda-derecha
        if (balance > 1 && obtenerBalance(nodo.right) < -1)
            return rotacionDobleDerecha(nodo);

        // Caso 4: Desbalance derecha-izquierda
        if (balance < -1 && obtenerBalance(nodo.left) > 1)
            return rotacionDobleIzquierda(nodo);
        
        return nodo; // Devuelve el nodo (sin cambios si no hay desbalance)
    }

    // Método público para insertar
    public void insertar(int key) {
        root = insertar(root, key);
    }

    // Eliminar un nodo
    private Nodo eliminar(Nodo root, int key) {
        // Eliminar como en un árbol binario de búsqueda
        if (root == null)
            return root;

        if (key < root.key)
            root.left = eliminar(root.left, key);
        else if (key > root.key)
            root.right = eliminar(root.right, key);
        else {
            if ((root.left == null) || (root.right == null)) {
                Nodo temp = (root.left != null) ? root.left : root.right;

                if (temp == null) {
                    root = null;
                } else {
                    root = temp;
                }
            } else {
                Nodo temp = obtenerMinimo(root.right);
                root.key = temp.key;
                root.right = eliminar(root.right, temp.key);
            }
        }

        if (root == null)
            return root;

        root.height = max(altura(root.left), altura(root.right)) + 1;

        int balance = obtenerBalance(root);

        // Rotaciones después de la eliminación
        if (balance > 1 && obtenerBalance(root.left) >= 0)
            return rotacionDerecha(root);

        if (balance > 1 && obtenerBalance(root.left) < 0) {
            root.left = rotacionIzquierda(root.left);
            return rotacionDerecha(root);
        }

        if (balance < -1 && obtenerBalance(root.right) <= 0)
            return rotacionIzquierda(root);

        if (balance < -1 && obtenerBalance(root.right) > 0) {
            root.right = rotacionDerecha(root.right);
            return rotacionIzquierda(root);
        }

        return root;
    }

    // Método público para eliminar
    public void eliminar(int key) {
        root = eliminar(root, key);
    }

    // Obtener el nodo con el valor mínimo (para eliminar)
    private Nodo obtenerMinimo(Nodo nodo) {
        while (nodo.left != null)
            nodo = nodo.left;
        return nodo;
    }

   // Método para mostrar el árbol en Preorden (izquierda,raiz, derecha)
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Nodo node) {
        if (node != null) {
            preOrder(node.left);
            System.out.print(node.key + " ");
            preOrder(node.right);
        }
    }
}