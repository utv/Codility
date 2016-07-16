package LinkedList;

import static org.junit.Assert.*;

/**
 * Created by Amata on 5/5/2016 AD.
 */
public class SinglyLinkedListTest {

    private SinglyLinkedList init() {
        SinglyLinkedList ll = new SinglyLinkedList(new Node(new Integer(5)));
        ll.addElement(new Integer(3));
        ll.addElement(new Integer(4));
        return ll;
    }

    @org.junit.Test
    public void removeAt() throws Exception {
        SinglyLinkedList ll = init();
        ll.removeAt(0);
        assertEquals(new Integer(3), ll.indexOf(0).getVal());
        assertEquals(new Integer(4), ll.indexOf(1).getVal());

    }

}