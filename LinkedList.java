package Lesson2;

public class LinkedList<E> {
    Node<E> first;
    int size = 0;

    public int getSize() {
        return size;
    }

    public LinkedList() {
        first = null;
    }

    public void addElement(E element) {
        if (first == null) {
            Node<E> newNode = new Node(element);
            first = newNode;
            size++;
        } else {
            Node<E> newNode = new Node(element);
            newNode.next = first;
            first = newNode;
            size++;
        }
    }

    public E getElement(int index) {
        Node<E> current = first;
        if (!checkIndex(index)) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = 0; i <= index; i++) {
                if (i == index)
                    break;
                current = current.next;
            }
        }
        return current.data;
    }

    public void deleteFirst() {
        first = first.next;
        size--;
    }

    public void delete(int index) {
        if (!checkIndex(index)) {
            throw new IndexOutOfBoundsException();
        } else if (first.next == null || index == 0) {
            deleteFirst();
        } else {
            Node<E> current = first;
            Node<E> temp = first;
            for (int i = 0; i < index; i++) {
                temp = current;
                current = current.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index <= size;
    }
}
