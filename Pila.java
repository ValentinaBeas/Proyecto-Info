package Pila_Cola_List;

public class Pila {

    public NodoPila ultimo; // Nodo que apunta al final de la pila
    private int tamaño; // almacena el tamaño de la pila
    
    //Constructor
    public Pila(){
        this.ultimo = null;
        this.tamaño = 0;
    }
    
    //Metodo que verifica si la pila esta vacia
    public boolean isEmpty (){
        return(this.ultimo == null);
    }

    //Metodo para insertar un nuevo elemento
    public NodoPila insertar (String dato,NodoPila stack){ //PUSH
        NodoPila newNode=new NodoPila(dato,stack);
        this.tamaño++;
        return newNode;
    }
    
    //Metodo para borrar un elemento de la pila
    public NodoPila borrar(NodoPila stack) { //POP
        if (isEmpty()) { //Si esta vacia la pila
            System.out.println("La lista se encuentra vacía");
            return null;
        }
        if (stack.siguiente==null) { //Si tiene un solo elemento 
            stack = null;
        } else { //Si hay mas elementos
            stack=stack.siguiente;
        }
        this.tamaño--;
        return stack;
    }
 
    //Metodo para mostrar el elemento tope de la pila
    public void mostrarTop() {
        if (isEmpty()) { // Si la lista está vacía
            System.out.println("La pila está vacía");
        } else {
            System.out.println("El elemento en el tope de la pila es: " + ultimo.dato);
        }
    }

    public String obtenerTop (){
        if (isEmpty()){
            return null;
        }
        return ultimo.dato;
    }


    public void mostrarTamaño (){
        System.out.println("El tamaño de la pila es: " + this.tamaño);
    }
     // Método para imprimir todos los elementos de la pila
    public void imprimir(NodoPila stack) {
        NodoPila temp = stack;
        while (temp != null) {
            System.out.print(temp.dato+"\t");
            temp = temp.siguiente;
        }
        System.out.println("");
    }
    public int getTamaño (){
        return this.tamaño;
    }
}

