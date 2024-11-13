package Recursividad;

import java.util.Scanner;

public class SubMenuRecursivas {
    public static void MenuRecursivas(){
        System.out.println("Elija una opcion para ver su solucion recursiva:\n1.Factorial\n2.Sumatoria\n3.Potencia\n4.Conteo Regresivo\n5.Multiplicacion\n6.Array inverso\n7.Decimal a binario\n");
        try (Scanner scan = new Scanner(System.in)) {
            int opcion=0;
            opcion=scan.nextInt();
            switch (opcion) {//Llamado a los menus de los diferentes ejercicios
                case 1:
                    EJ1.menu(); 
                    break;
                case 2:
                    EJ2.menu();
                    break;
                case 3:
                    EJ3.menu();
                    break;
                case 4:
                    EJ4.menu();
                    break;
                case 5:
                    EJ5.menu();
                    break;
                case 6:
                    EJ6.menu();
                    break;
                case 7:
                    EJ7.menu();
                    break;
                default:
                    System.out.println("Ingrese un numero valido");
                break;
            }
        }  
    }
}
