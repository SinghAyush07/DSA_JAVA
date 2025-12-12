// circular linked list
class circularLL {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static void print(Node head) {
        Node temp = head;
        while(temp.next != head) { 
            System.out.print(temp.val+ " -> ");
            temp = temp.next;
        }
        System.out.print(temp.val + " ->");
        System.out.println(" null");
    }
    static class CSLL {
        Node head;
        Node tail;
        int size;
        void display(Node head) {
            Node temp = head;
            while(temp.next != head) { 
                System.out.print(temp.val+ " -> ");
                temp = temp.next;
            }
            System.out.print(temp.val + " ->");
            System.out.println(" null");
        }
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = tail = temp;
                tail.next = head;
                size++;
            } else {
                temp.next = head;
                tail.next = temp;
                head = temp;
                size++;
            }
        }
        void insertAtTail(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = tail = temp;
                tail.next = head;
                size++;
            } else {
                tail.next = temp;
                temp.next = head;
                tail = temp;
                size++;
            }
        }
        void insert(int idx, int val) throws Error{
            if(idx < 0 || idx > size) {
                throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + size);
            }
            if(idx == 0) insertAtHead(val);
            else if(idx == size-1) insertAtTail(val);
            else {
                Node temp = new Node(val);
                Node x = head;
                for(int i=0; i<idx-1; i++) x = x.next;
                temp.next = x.next;
                x.next = temp;
                size++;
            }
        }
        void deleteAtHead() {
            if(head == null) {
                System.out.println("Empty List");
                return;
            }
            if (head == tail) {
                head = tail = null;
                size--;
                return;
            }
            tail.next = head.next;
            head = head.next;
            size--;
        }
        void deleteAtTail() {
            if(head == null) {
                System.out.println("Empty List");
                return;
            }
            if (head == tail) {
                head = tail = null;
                size--;
                return;
            }
            Node temp = head;
            while(temp.next != tail) temp = temp.next;
            temp.next = head;
            tail = temp;
            size--;
        }
        void delete(int idx) {
            if(idx <0 || idx >= size) return;
            else if(idx == 0) {
                deleteAtHead(); return;
            }
            else if(idx == size-1) {
                deleteAtTail();
                return;
            }
            else {
                Node temp = head;
                for(int i=0; i<idx-1; i++) temp = temp.next;
                temp.next = temp.next.next;
                size--;
            }
        }
        int get(int idx) {
            if(idx <0 || idx >= size) return -1;
            if(idx == size-1) return tail.val;
            Node t = head;
            for(int i=0; i<idx; i++) t = t.next;
            return t.val;
        }
        void set(int idx, int val) {
            if(idx <0 || idx >= size) return;
            if(idx == size-1) {
                tail.val = val;
                return;
            }
            Node t = head;
            for(int i=0; i<idx; i++) t = t.next;
            t.val = val;
        }
    }
    public static void main(String[] args) {
        // Node a = new Node(10);
        // Node b = new Node(20);
        // Node c = new Node(30);
        // Node d = new Node(40);
        // Node e = new Node(50);
        // a.next = b; 
        // b.next = c;
        // c.next = d;
        // d.next = e;
        // e.next = a;
        // print(a);
    }
}