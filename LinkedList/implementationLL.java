

public class implementationLL {
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
        void insertAtTail(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        void insertAtHead(int val) {
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
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtTail(60);
        list.insertAtHead(70);
        list.display();
        list.size();
    }
}
