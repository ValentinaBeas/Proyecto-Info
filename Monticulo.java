package MonticuloTablaHash;

public class Monticulo {
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor que inicializa el montículo con una capacidad inicial
    public Monticulo(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    // Método para obtener el índice del nodo padre
    private int getParentIndex(int i) { return (i - 1) / 2; }

    // Método para obtener el índice del hijo izquierdo
    private int getLeftChildIndex(int i) { return 2 * i + 1; }

    // Método para obtener el índice del hijo derecho
    private int getRightChildIndex(int i) { return 2 * i + 2; }

    // Método para intercambiar elementos en el arreglo
    private void swap(int indexOne, int indexTwo) {
        int temp = heap[indexOne];
        heap[indexOne] = heap[indexTwo];
        heap[indexTwo] = temp;
    }

    // Método para insertar un nuevo elemento en el montículo
    public void insert(int value) {
        if (size == capacity) {
            throw new IllegalStateException("El montículo está lleno");
        }
        heap[size] = value;
        size++;
        heapifyUp();
    }

    // Método para mantener la propiedad del montículo después de la inserción
    private void heapifyUp() {
        int index = size - 1;
        while (index > 0 && heap[getParentIndex(index)] > heap[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    // Método para extraer el elemento de menor valor (raíz) del montículo
    public int extractMin() {
        if (size == 0) {
            throw new IllegalStateException("El montículo está vacío");
        }
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown();
        return min;
    }

    // Método para mantener la propiedad del montículo después de la extracción
    private void heapifyDown() {
        int index = 0;
        while (getLeftChildIndex(index) < size) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (getRightChildIndex(index) < size && heap[getRightChildIndex(index)] < heap[smallerChildIndex]) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if (heap[index] <= heap[smallerChildIndex]) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }
}

