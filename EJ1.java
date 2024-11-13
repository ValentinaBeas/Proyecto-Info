//Escribe una función recursiva que calcule el factorial de un número entero positivo n.
//Por ejemplo, 4! es 1x2x3x4=24.

package Recursividad;

import java.util.Scanner;

public class EJ1 {
    public static void menu() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el numero del cual quiere saber su factorial");
            int num=sc.nextInt();;
            int factorial;
            factorial=factorial(num);
            System.out.println("El factorial de "+num+" es: "+factorial);
        }
    }


    public static int factorial(int parametro){
        if(parametro>0){
            int total= parametro* factorial(parametro-1);
            return total;
        }else{
            return 1;
        }
    }
}
