public class doublyLinkedListImplementation {
    static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val = val;
        }
    }
    static class DLL {
        Node head;
        Node tail;
        int size;
        void display() {
            Node temp = head;
            while(temp!=null) {
                System.out.print(temp.val+" ->");
                temp = temp.next;
            }
            System.out.println(" null");
        }
        void insertAtTail(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = tail = temp;
                size++;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
                size++;
            }
        }
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = tail = temp;
                size++;
            } else {
                temp.next = head;
                head.prev = temp;
                head = temp;
                size++;
            }
        }
        void insert(int idx, int val){
            if(idx<0 || idx>size) {
                System.out.println("invalid index");
                return;
            }
            if(idx == 0) {
                insertAtHead(val);
            } else if(idx == size - 1) {
                insertAtTail(val);
            }
            Node temp = new Node(val);
            Node x = head;
            for(int i=0; i<idx-1; i++) {
                x = x.next;
            }
            Node y = x.next;
            x.next = temp;
            temp.next = y;
            y.prev = temp;
            temp.prev = x;
            size++;
        }
        void deleteAtHead() {
            if(head == null) {
                System.out.println("empty list"); return;
            }
            head = head.next;
            head.prev = null;
            size--;
        }
        void deleteAtTail() {
            if(head == null) {
                System.out.println("empty list"); return;
            }
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        void delete(int idx) {
            if(idx == 0) deleteAtHead();
            if(idx == size-1) deleteAtTail();
            if(idx<0 || idx>size) {
                System.out.println("invalid index"); return;
            }
            Node temp = head;
            for(int i=0; i<idx-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp = temp.next;
            temp.prev = temp.prev.prev;
            size--;
        }
        void get(int idx) {
            if(idx<0 || idx>size) {
                System.out.println("invalid index"); return;
            }
            Node temp = head;
            for(int i=0; i<idx; i++) temp = temp.next;
            System.out.println(temp);
        }
        void set(int idx, int val) {
            if(idx<0 || idx>size) {
                System.out.println("invalid index"); return;
            }
            Node temp = head;
            for(int i=0; i<idx; i++) temp = temp.next;
            temp.val = val;
        }
    }
    public static void print(Node head) {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.val + " ->");
            temp = temp.next;
        }
        System.out.println(" null");
    }
    public static void printReverse(Node tail) {
        Node temp = tail;
        while(temp!=null) {
            System.out.print(temp.val + " ->");
            temp = temp.prev;
        }
        System.out.println(" null");
    }
    public static void display(Node node) {
        Node temp = node;
        while(temp.prev != null) {
            temp = temp.prev;
        }
        // now temp is at head
        print(temp);
    }
    public static void main(String[] args) {
        // Node a = new Node(10);
        // Node b = new Node(20);
        // Node c = new Node(30);
        // Node d = new Node(40);
        // a.next = b; b.prev = a;
        // b.next = c; c.prev = b;
        // c.next = d; d.prev = c;
        // print(a); printReverse(d);
        // display(c);
        DLL list = new DLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtHead(50);
        list.display();
        list.deleteAtHead();
        list.deleteAtTail();
        list.insert(2, 80);
        list.delete(2);
        list.display();
    }
}
