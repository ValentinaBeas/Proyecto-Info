package Pila_Cola_List;

import java.util.Scanner;

public class SubMenuPCL {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int op=1;
        System.out.println("\nElija una opcion:\n1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4. Ejercicio 4\n5. Ejercicio 5\n6. Ejercicio 6\n7. Ejercicio 7\n8. Ejercicio 8\n0.Salir");
        op = scanner.nextInt();
        switch (op) {
            case 0: 
                break;
            case 1:
                Main1.menu();
                //Ejercicio 1
                break;
            case 2:
                Main2.menu();
                //Ejercicio 1
                break;
            case 3:
                Main3.menu();
                //Ejercicio 3
                break;
            case 4:
                Main4.menu();
                //Ejercicio 4
                break;
            case 5:
                Main5.menu();
                //Ejercicio 5
                break;
            case 6:
                Main6.menu();
                //Ejercicio 6
                break;
            case 7:
                Main7.menu();
                //Ejercicio 7
                break;
            case 8:
                Main8.menu();
                //Ejercicio 8
                break;
            default:
                System.out.println("Ingrese un numero valido");
            break;
        }
        scanner.close();
    }
}
