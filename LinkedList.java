public class LinkedList<T> {
    Node<T> head;
    int size;

    public void addBegin(T data) {
        Node<T> newNode = new Node<>(data);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    public void addEnd(T data) {
        Node<T> newNode = new Node<>(data);
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

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    public void print() {
        System.out.print("Linked list of size "+ size()+": ");

        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
