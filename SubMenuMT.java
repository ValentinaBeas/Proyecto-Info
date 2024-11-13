package MonticuloTablaHash;

import java.util.Scanner;


public class SubMenuMT {
    public static void MenuTablaMonticulo(){
        System.out.println("Elija una opcion:\n1.Monticulo binario\n2.Tabla Hash\n");
        try (Scanner scan = new Scanner(System.in)) {
            int opcion=0;
            opcion=scan.nextInt();
            switch (opcion) {//Llamado a los menus de los diferentes ejercicios
                case 1:
                    MonticuloTest.menu();
                    break;
                case 2:
                    TablaHashTest.menu();
                    break;
                default:
                    System.out.println("Ingrese un numero valido");
                break;
            }
        }  
    }
}
