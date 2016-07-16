package LinkedList;

/**
 * Created by Amata on 5/4/2016 AD.
 */
public class SinglyLinkedList {
    private Node first;
    
    public SinglyLinkedList(Node firstNode) {
        first = firstNode;
    }

    private Node goToLast() {
        Node next = first;
        while (next.hasChild()) {
            next = next.getChild();
        }
        return next;
    }

    public void listAll() {
        Node next = first;
        while (next != null) {
            System.out.println(next.getVal().toString());
            next = next.getChild();
        }
    }

    public int getLength() {
        int len = 0;
        Node next = first;
        while (next != null ) {
            len++;
            next = next.getChild();
        }
        return len;
    }

    public void addElement(Object ele) {
        Node last = goToLast();
        last.setChild(new Node(ele));
    }

    public Node indexOf(int i) {
        int idx = 0;
        Node next = first;
        while (next != null && idx < i) {
            idx++;
            next = next.getChild();
        }
        return next;
    }

    public void insertAt(Node ele, int i) {
        if (i < 0) {
            System.out.println("index must be non-negative number");
            return;
        }

        if (i == 0) {
            Node tmp = first;
            first = ele;
            first.setChild(tmp);
            return;
        }

        Node node = indexOf(i - 1);
        if (node != null) {
            Node toInsert = node.getChild();
            node.setChild(ele);
            ele.setChild(toInsert);
            return;
        }

        System.out.println("Node to insert is not existed!");
    }

    public void removeAt(int i) {
        if (i < 0) {
            System.out.println("index must be non-negative number");
            return;
        }

        if (i == 0) {
            if (first.getChild() == null) first = null;
            first = first.getChild();
            return;
        }

        Node node = indexOf(i - 1);
        if (node != null) {
            Node toRemove = node.getChild();
            if (toRemove != null) {
                node.setChild(toRemove.getChild());
                toRemove = null;
                return;
            }
        }

        System.out.println("Node to remove is not existed!");
    }

    
}
