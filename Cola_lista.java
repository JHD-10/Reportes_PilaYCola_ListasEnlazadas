import java.util.LinkedList;
import java.util.Scanner;

class Queue<T> {
    private LinkedList<T> list;

    public Queue() {
        list = new LinkedList<>();
    }

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía. No se puede sacar ningún elemento.");
        }
        return list.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía. No se puede obtener ningún elemento.");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

public class Cola_lista {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Queue<String> cola =new Queue<>();

        System.out.println("Ingresa 5 elementos para llenar la cola:");

        for (int i=0; i<5; i++) {
            System.out.print("Elemento "+ (i + 1) + ": ");
            String elemento = scanner.nextLine();
            cola.enqueue(elemento);
        }

        System.out.println("Contenido de la cola: " + cola);

        System.out.println("Elemento sacado de la cola: " + cola.dequeue());
        System.out.println("Contenido de la cola después de sacar un elemento: " + cola);

        System.out.println("Elemento en el frente de la cola: " + cola.peek());

        scanner.close();
    }
}
