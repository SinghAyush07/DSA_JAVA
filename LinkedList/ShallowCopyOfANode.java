public class ShallowCopyOfANode {
    static class Node {
        int val;
        Node next;
        Node (int val) {
            this.val = val;
        }
    }

    public static void print(Node head) {
        while(head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c; 
        c.next = d; 
        d.next = e;
        print(a);
    }
}
