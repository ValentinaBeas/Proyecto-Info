//Escriba un método recursivo que imprima los elementos de un arreglo en orden inverso.

package Recursividad;
public class EJ_6 {
    public static void menu() {
        int array [] = {4, 2, 7, 1, 9};
        System.out.println("***ARREGLO NORMAL***");
        for (int i = 0; i < array.length; i++){
            System.out.println(" "+array[i]);
        }
        System.out.println("***ARREGLO INVERTIDO***");
        inverso(array, array.length -1);
    }    
    public static void inverso (int [] array, int i){
        if (i < 0){
            return ;
        } 
        System.out.println(" "+array[i]);
        inverso(array, i-1);
       
    }
}
