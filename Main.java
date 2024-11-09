import Recursividad.Recursivas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op=1;
        System.out.println("\n\nElija una opcion:\n1.Recursivas\n0.Salir");
        op = sc.nextInt();
        switch (op) {
            case 1:
                Recursivas.MenuRecursivas();
                break;
            case 2:
                //Menu Ordenamiento
                break;
            case 3:
                //Menu Pila&Cola
                break;
            case 4:
                //Menu Pila&Cola con Lista
                break;
            case 5:
                //Menu Arbol Binario
                break;
            case 6:
                //Menu Arbol Binario2
                break;
            case 7:
                //Menu ArbolAVL
                break;
            case 8:
                //Menu Arbol Rojinegro
                break;
            case 9:
                //Menu Monticulo binario, tabla hash, general
                break;
            default:
                System.out.println("Ingrese un numero valido");
            break;
        }    
    }        
}
