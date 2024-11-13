package MonticuloTablaHash;

import java.util.LinkedList;

class TablaHash {
    // Clase interna para almacenar pares de clave y lista de valores
    class Entry {
        String key;
        LinkedList<Integer> values;

        public Entry(String key) {
            this.key = key;
            this.values = new LinkedList<>();
        }
    }

    private LinkedList<Entry>[] table;
    private int capacity;

    // Constructor que inicializa la tabla hash con una capacidad específica
    public TablaHash(int capacity) {
        this.capacity = capacity;
        this.table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Función hash para calcular el índice a partir de la clave
    private int hash(String key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // Método para insertar un elemento en la tabla hash
    public void insert(String key, int value) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.values.add(value); // Agregar nuevo valor a la lista de valores
                return;
            }
        }
        // Si la clave no existe, se crea una nueva entrada y se agrega el primer valor
        Entry newEntry = new Entry(key);
        newEntry.values.add(value);
        table[index].add(newEntry);
    }

    // Método para buscar los valores asociados a una clave
    public LinkedList<Integer> search(String key) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.values; // Retorna la lista de valores si se encuentra la clave
            }
        }
        return null; // Retorna null si la clave no se encuentra
    }

    // Método para eliminar un elemento de la tabla hash por su clave
    public void delete(String key) {
        int index = hash(key);
        table[index].removeIf(entry -> entry.key.equals(key));
    }
}

