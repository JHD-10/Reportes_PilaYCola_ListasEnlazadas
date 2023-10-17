import java.util.LinkedList;
import java.util.Scanner;

class Stack<T> {
    private LinkedList<T> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public void push(T item) {
        list.addFirst(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía. No se puede sacar ningún elemento.");
        }
        return list.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía. No se puede obtener ningún elemento.");
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

public class Pila_lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> pila = new Stack<>();

        System.out.println("Ingresa 5 elementos para llenar la pila:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            String elemento = scanner.nextLine();
            pila.push(elemento);
        }

        System.out.println("-----Contenido de la pila-----: " + pila);

        System.out.println("Pop elemento de la pila: " + "-"+pila.pop()+"-");
        System.out.println("-----Contenido de la pila después de hacer pop-----: " + pila);

        System.out.println("Elemento en la cima de la pila: " + "-"+pila.peek()+"-");

        scanner.close();
    }
}
