package datastructure.linkedlist;

public class Demo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(0);
        linkedList.append(1);
        linkedList.prepend(2);
        linkedList.append(3);
        linkedList.prepend(4);
        linkedList.append(5);
        linkedList.prepend(6);
        linkedList.remove(2);
    }
}
