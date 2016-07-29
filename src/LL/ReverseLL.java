package LL;

import java.util.LinkedList;

/**
 * Created by Amata on 7/18/2016 AD.
 */
public class ReverseLL {

    // returns a first index making a loop in a list. -1, if no loop.
    public int loopPosition(LL list) {
        /* one pointer travels with a double speed of another
         1) finds the point where they meet.
         2) starts looping through from that point.
         3) loop position = total number of steps traveled so far - number of nodes in the loop.
        */

/*
        int i = 0;
        Node slow, fast = list.head;
        while (slow != null || slow != fast) {
            if (slow.next == null || fast.next.next == null)
                return -1;
            slow = slow.next;
            fast = fast.next.next;
            i++;
        }
*/
        return 0;
    }

    public static void main(String[] args) throws Exception {
        LL ll = new LL();
        ll.addToFirst(new Node(1));
        ll.addToFirst(new Node(2));
        ll.addToFirst(new Node(3));
        ll.addToFirst(new Node(4));

        System.out.println("Before reverse");
        ll.traverse();
        System.out.println("After reverse");

        ll.traverse();


    }
}


class LL {
    protected Node head;

    public void addToFirst(Node node) {
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void traverse() {
        Node node = this.head;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public void removeFirst() {
        this.head = this.head.next;
    }


    public void remove(int n) throws Exception {
        if (n == 0) {
            removeFirst();
        }
        else {
            Node node = this.head;
            for (int i = 0; i < n - 1 && node != null; i++) {
                node = node.next;
            }

            if (node == null || node.next == null) {
                throw new NullPointerException();
            }

            Node toRemove = node.next;
            node.next = toRemove.next;
            toRemove.next = null;
        }
    }

    public void reverse() {
        Node idx;
        Node prev = null;
        while (this.head.next != null) {
            idx = this.head;
            this.head = this.head.next;
            idx.next = prev;
            prev = idx;
        }
        this.head.next = prev;
    }

}

class Node {
    protected int val;
    protected Node next;

    public Node(int val) {
        this.val = val;
    }
}