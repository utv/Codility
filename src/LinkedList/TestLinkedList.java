package LinkedList;

/**
 * Created by Amata on 5/3/2016 AD.
 */
public class TestLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList(new Node(new Integer(5)));
        ll.addElement(new Integer(3));
        ll.addElement(new Integer(4));
        System.out.println("Before");
        ll.listAll();

        System.out.println("After remove last");
        ll.removeAt(2);
        ll.insertAt(new Node(new Integer(9)), 0);
        ll.insertAt(new Node(new Integer(9)), 3);
        ll.listAll();

    }
}
