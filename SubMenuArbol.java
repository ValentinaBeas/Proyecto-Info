package ArbolBinario;
public class SubMenuArbol {
    public static void menu() {
        ArbolBinario arbol = new ArbolBinario();
        
        // 1. Insertar valores en el arbol binario con valores entre 0 y 25
        int[] valores = {10, 3, 14, 20, 8, 2, 11, 13, 1}; // Puedes cambiar estos valores o generar aleatoriamente
        
        System.out.println("Insertando valores en el arbol:");
        for (int valor : valores) {
            arbol.insertar(valor);
            System.out.print(valor + " ");
        }
        System.out.println("\n");

        // 2. Imprimir el arbol en formato estructurado
        System.out.println("Arbol binario en formato estructurado:");
        arbol.imprimir();
        System.out.println();

        // 3. Recorrido inorder para mostrar el arbol de manera ordenada
        System.out.println("Recorrido inorder del arbol (ordenado):");
        arbol.inorder();
        System.out.println();

        // 4. Calcular y mostrar la profundidad del arbol
        System.out.println("Profundidad del arbol:");
        int profundidad = arbol.depth();
        System.out.println("La profundidad del arbol es: " + profundidad);
        System.out.println();

        // 5. Borrar un valor del arbol y confirmar el borrado con un recorrido inorder
        int valorABorrar = 10; // Puedes cambiar este valor para probar con otros
        System.out.println("Borrando el valor " + valorABorrar + " del arbol:");
        arbol.dtree(valorABorrar);

        System.out.println("\nRecorrido inorder despues del borrado:");
        arbol.inorder();
        System.out.println();

        // Imprimir el arbol en formato estructurado despues del borrado
        System.out.println("Arbol binario despues del borrado en formato estructurado:");
        arbol.imprimir();
    }
}
