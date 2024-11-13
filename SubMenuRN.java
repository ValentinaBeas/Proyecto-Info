package ArbolRojinegro;

public class SubMenuRN {
    public static void Menu() {
        ArbolRN arbol = new ArbolRN();
        int[] elementos = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("Orden de ingreso de los elementos:");
        for (int numero:elementos){
            System.out.print(numero+", ");
        }
        System.out.println("");
        System.out.println("Insertando elementos en el Arbol Rojinegro...");
        for (int elemento : elementos) {
            arbol.insertar(elemento);
        }

        // Visualizacion del arbol en orden ascendente con colores
        arbol.imprimirArbolAscendente();

        // Calculo de la altura negra
        System.out.println("\nAltura negra del arbol: " + arbol.alturaNegra());
        
         // Verificacion de las propiedades del arbol rojinegro
        System.out.println("\nEl arbol cumple con las propiedades de un arbol rojinegro: " + arbol.verificarPropiedades());
    }
}
