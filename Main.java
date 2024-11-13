import Recursividad.SubMenuRecursivas;
import java.util.Scanner;

import ArbolBinario.SubMenuArbol;
import ArbolRojinegro.SubMenuRN;
import Arbol_AVL.SubMenuAVL;
import Monticulo_TablaHash.SubMenuMT;
import Ordenamiento.SubMenuOrd;
import Pila_Cola.SubmenuPilaCola;
import Pila_Cola_List.SubMenuPCL;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op=1;
        System.out.println("Elija una opcion:\n1.Recursivas\n2.Ordenamiento\n3.Pila y Cola en arreglo\n4.Pila y Cola con Lista\n5.Arbol binario\n6.Arbol AVL\n7.Arbol Rojinegro\n8.Monticulo binario, tabla hash, general\n0.Salir");
        op = sc.nextInt();
        System.out.println("\n");
        switch (op) {
            case 1://Menu Recursivas
                SubMenuRecursivas.MenuRecursivas();
                break;
            case 2://Menu Ordenamiento
                SubMenuOrd.MenuOrdenamiento();
                break;
            case 3://Menu Pila&Cola
                SubmenuPilaCola.menu();
                break;
            case 4://Menu Pila&Cola con Lista
                SubMenuPCL.menu();
                break;
            case 5://Menu Arbol Binario
                SubMenuArbol.menu();
                break;
            case 6://Menu ArbolAVL
                SubMenuAVL.menu();
                break;
            case 7://Menu Arbol Rojinegro
                SubMenuRN.Menu();
                break;
            case 8:
                SubMenuMT.MenuTablaMonticulo();
                //Menu Monticulo binario, tabla hash, general
                break;
            case 0:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Ingrese un numero valido");
            break;
        }
        sc.close();    
    }        
}
