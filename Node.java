package Lesson2;

public class Node<T> {
    Node next;
    T data;

    public Node(T data) {
        next = null;
        this.data = data;
    }
}
