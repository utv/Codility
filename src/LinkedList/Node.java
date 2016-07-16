package LinkedList;

/**
 * Created by Amata on 5/3/2016 AD.
 */
public class Node {
    private Object val;
    private Object parent;
    private Node child;

    public Node(Object theVal) {
        this.val = theVal;
        this.child = null;
    }

    public Node(Object theVal, Node tail) {
        this.val = theVal;
        this.child = tail;
    }

    public boolean hasChild() {
        if (child != null) return true;
        return false;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object obj) {
        val = obj;
    }

    public void setChild(Node node) {
        child = node;
    }

    public Node getChild() {
        return child;
    }

    public Object getParent() {
        return this.parent;
    }
}
