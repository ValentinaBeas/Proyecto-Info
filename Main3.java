//3. Verificación de Paréntesis
//  a. Escribe un programa que verifique si una expresión matemática tiene paréntesis 
//  balanceados. Por ejemplo, para la expresión ((3+2)*5) la salida debería ser 
//  "Paréntesis balanceados", mientras que para ((3+2)*5)) la salida debería ser "Paréntesis desbalanceados".
package Pila_Cola_List;

public class Main3 {

    public static String verificarParentesis(String expresion) {
        Pila pila = new Pila();

        for (char c : expresion.toCharArray()) {
            if (c == '(') {
                pila.ultimo=pila.insertar("(",pila.ultimo);  // Agregar paréntesis abierto a la pila
            } else if (c == ')') {
                if (pila.isEmpty()) {
                    return "Paréntesis desbalanceados";  // No hay paréntesis abierto correspondiente
                }
                pila.ultimo=pila.borrar(pila.ultimo);;  // Emparejar paréntesis cerrado
            }
        }

        // Si la pila está vacía al final, los paréntesis están balanceados
        return pila.isEmpty() ? "Paréntesis balanceados" : "Paréntesis desbalanceados";
    }

    public static void menu () {
        String expresion1 = "((3+2)*5)";
        String expresion2 = "((3+2)*5))";
        String expresion3 = "(2*8)*4)";

        System.out.println("Expresión: " + expresion1 + " - " + verificarParentesis(expresion1));
        System.out.println("Expresión: " + expresion2 + " - " + verificarParentesis(expresion2));
        System.out.println("Expresión: " + expresion3 + " - " + verificarParentesis(expresion3));

    }
}
