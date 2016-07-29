package Tree;

/**
 * Created by Amata on 7/18/2016 AD.
 */
public class BST {

    private static int search(int[] A, int target) {
        int left = 0, right = A.length - 1;
        int half;
        while (left <= right) {
            half = left + (right - left)/2;
            if (A[half] == target) {
                return half;
            }
            else if (A[half] > target) {
                right = half - 1;
            }
            else if (A[half] < target) {
                left = half + 1;
            }
        }

        return -1;
    }

    private static Node insert(Node node, int val) {
        Node next;
        if (node == null) {
            node = new Node(val);
        }
        else {
            next = node;
            while (next.val != val) {
                if (val > next.val) {
                    if (next.right != null)
                        next = next.right;
                    else
                        next.right = new Node(val);
                }
                else if (val < next.val){
                    if (next.left != null)
                        next = next.left;
                    else
                        next.left = new Node(val);
                }
                else
                    return node;
            }
        }

        return node;
    }

    private static void decreaseLeftNodeVal(Node node) {
        if (node.left != null)
            node.left.val--;
    }

    private static void preOrderTravel(Node node) {
        // parent, left, right
        if (node != null) {
            System.out.println(node.val); // parent
            preOrderTravel(node.left);
            preOrderTravel(node.right);
        }
    }

    public static void main(String[] args) {
        int[] A = {3,4,20,21,44,50,99};
//        System.out.println("Number " + A[3] + " is at position " + search(A, A[3]));
//        System.out.println("Number " + A[4] + " is at position " + search(A, A[4]));
//        System.out.println("Number " + A[5] + " is at position " + search(A, A[5]));
        Node node = new Node(8);
        insert(node, 9);
        insert(node, 3);
        insert(node, 12);
        insert(node, 1);

        preOrderTravel(node);

    }
}



class Node {
    protected int val;
    protected Node left;
    protected Node right;

    public Node() {

    }

    public Node(int val) {
        this.val = val;
    }
}
