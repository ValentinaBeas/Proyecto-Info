package MonticuloTablaHash;

import java.util.Scanner;

public class TablaHashTest {
    public static void menu() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese la capacidad de la Tabla Hash");
        int capacidad= sc.nextInt();
        // Crear una tabla hash
        TablaHash tablaHash = new TablaHash(capacidad);
        // Insertar elementos en la tabla hash
        for(int i=0;i<5;i++){
            System.out.println("Ingrese la clave String para el "+(i+1)+" elemento:");
            String key=sc.next();
            System.out.println("Ingrese el valor int para el "+(i+1)+" elemento:");
            int valor=sc.nextInt();
            tablaHash.insert(key,valor);
        }
        
        
        // Buscar elementos por clave
        System.out.println("Ingrese una key para hacer la busqueda:");
        String key=sc.next();
        System.out.println("Busqueda: " + tablaHash.search(key));

        // Eliminar un elemento
        System.out.println("Ingrese una key para eliminar los elementos de la Tabla Hash:");
        key=sc.next();
        tablaHash.delete(key);
        System.out.println("Clave '"+key+"' eliminada.");
       
        System.out.println("Buscar clave '"+key+"' después de la eliminación: " + tablaHash.search("dos"));
    }
}    

