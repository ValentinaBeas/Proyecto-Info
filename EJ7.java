//Escriba un método recursivo que devuelva el número de unos en la representación
//binaria de N. Use el hecho de que es igual al número de unos en la representación
//binaria de N/2, más 1 si N es impar.

package Recursividad;

import java.util.Scanner;

public class EJ_7 {
    public static void menu() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ingrese un numero para ver su expresion binaria");
            int n = sc.nextInt();
            System.out.println("Número en decimal: " + n);
            System.out.print("Número en binario: ");
            binario(n);
        }
    }

    public static void binario(int num){
        if (num>1){//Si el numero es mayor a 1, llamamos de nuevo a la funcion dividiendo el numero en 2
            binario(num/2);
            System.out.print(num%2);//Una vez terminamos de dividir el numero hasta llegar a 0 o 1, se empiezan a imprimir los restos de las divisiones anteriores
        }else{
            System.out.print(num);//Si el numero es 1 o 0, imprimimos el numero
        }
    }
}
