public class implementationLL2 {
    static class Node {
        int val;
        Node next;
        Node (int val) {
            this.val = val;
        }
    }
    static class SLL {
        Node head;
        Node tail;
        int size;
        void insertAtBeginning(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
        void size() {
            System.out.println("Length of Linked List = " + size);
        }
    }
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);
        list.insertAtBeginning(50);
        list.insertAtBeginning(60);
        list.display();
        list.size();
    }
}
