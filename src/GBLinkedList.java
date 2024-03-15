public class GBLinkedList<T> implements GBList<T> {
    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public GBLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void add(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public void remove(T item) {
        if (head == null)
            return;

        if (head.data.equals(item)) {
            head = head.next;
            size--;
            return;
        }

        Node<T> current = head;
        Node<T> prev = null;
        while (current != null && !current.data.equals(item)) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
            size--;
        }
    }

    @Override
    public boolean contains(T item) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(item))
                return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Метод для отладки и тестирования
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
