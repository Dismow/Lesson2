package Lesson2;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addElement("Привет");
        linkedList.addElement("Мир");
        linkedList.addElement("Hello");
        System.out.println(linkedList.getElement(1));
        linkedList.delete(2);
    }
}
