package MonticuloTablaHash;

import java.util.Scanner;

public class MonticuloTest {
    public static void menu() {
        Scanner sc= new Scanner(System.in);
        int valor;
        System.out.println("Ingrese la cantidad de valores a colocar en el monticulo");
        int capacidad=sc.nextInt();
        Monticulo Monticulo = new Monticulo(capacidad);
        // Insertar elementos en el montículo
        for (int i=0;i<capacidad;i++){
            System.out.println("Ingrese el "+(i+1)+"° valor:");
            valor=sc.nextInt();
            Monticulo.insert(valor);
        }


        System.out.println("Elementos insertados en el montículo.");
        
        // Extraer el elemento de menor valor varias veces
        System.out.println("Extrayendo elementos en orden de prioridad (mínimos):");
        while (true) {
            try {
                int min = Monticulo.extractMin();
                System.out.println("Elemento extraído: " + min);
            } catch (IllegalStateException e) {
                System.out.println("El montículo está vacío.");
                break;
            }
        }
    }
}
