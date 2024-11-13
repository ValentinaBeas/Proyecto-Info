//Escribe una función recursiva que calcule la suma de los primeros n enteros positivos. 
//Por ejemplo, n=4 es 1+2+3+4=10.

package Recursividad;

import java.util.Scanner;

public class EJ2 {
    public static void menu(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un numero para ver la suma de los numeros reales hasta ese numero");
            int i = sc.nextInt();
            int result = sumatoria(i);
            if (result!=0){
                System.out.println("La suma de los primeros "+i+" numeros reales es de: " + result );
            }
        }
    }

    public static int sumatoria (int i){
        
        if (i ==1){
             return i;
        }
        else if(i>1) {
            return i + sumatoria(i-1);
        }else{
            System.out.println("Valor fuera de rango");
            return 0;
        }
    }
}
