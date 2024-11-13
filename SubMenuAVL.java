
package proyecto;
public class Main {
    public static void main(String[] args) {
        ArbolAVL arbol = new ArbolAVL();

        // Generar un árbol con la secuencia {10, 100, 20, 80, 40, 70}
        int[] valores1 = {10, 100, 20, 80, 40, 70};
        System.out.println("Arbol AVL con secuencia {10, 100, 20, 80, 40, 70}:");
        for (int valor : valores1) {
            arbol.insertar(valor);
        }
        arbol.preOrder();
        System.out.println();

        // Generar un árbol con la secuencia ordenada {5, 10, 20, 30, 40, 50, 60}
        ArbolAVL arbolOrdenado = new ArbolAVL();
        int[] valores2 = {5, 10, 20, 30, 40, 50, 60};
        System.out.println("Arbol AVL con secuencia ordenada {5, 10, 20, 30, 40, 50, 60}:");
        for (int valor : valores2) {
            arbolOrdenado.insertar(valor);
        }
        arbolOrdenado.preOrder();
        System.out.println();

        
        // Generar un árbol con la secuencia {4,2,30,1,10,50,5,20,40,60}
         ArbolAVL arbolOrdenado3 = new ArbolAVL();
        int[] valores3 = {4,2,30,1,10,50,5,20,40,60};
        System.out.println("Arbol AVL con secuencia {4,2,30,1,10,50,5,20,40,60}:");
        for (int valor : valores3) {
            arbolOrdenado3.insertar(valor);
        }
        arbolOrdenado3.preOrder();
        System.out.println();
        // Eliminar 1 y 30 del árbol generado
        arbolOrdenado3.eliminar(1);
        System.out.println("Despues de eliminar 1:");
        arbolOrdenado3.preOrder();
        System.out.println();

        arbolOrdenado3.eliminar(30);
        System.out.println("Despues de eliminar 30:");
        arbolOrdenado3.preOrder();
        
    }
}

