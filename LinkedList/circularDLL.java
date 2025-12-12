class circularDLL {
    static class Node {
        int val;
        Node next;
        Node prev;
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
    static class CDLL{
        Node head;
        Node tail;
        int size;
        void display() {
            Node temp = head;
            while(temp.next!=head) {
                System.out.print(temp.val+" -> ");
                temp = temp.next;
            }
            System.out.print(temp.val+" ->");
            System.out.println(" null");
        }
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = tail = temp;
                head.next = head;
                head.prev = head;
                size++;
            } else {
                temp.next = head;
                temp.prev = tail;
                head.prev = temp;
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
                tail.prev = head;
                size++;
            } else {
                tail.next = temp;
                temp.next = head;
                temp.prev = tail;
                head.prev = temp;
                tail = temp;
                size++;
            }
        }
        void insert(int idx, int val) {
            if(idx <0 || idx>size) {
                System.out.println("invalid index");
                return;
            }
            if(idx == 0) {
                insertAtHead(val); return;
            } else if(idx == size) {
                insertAtTail(val); return;
            }
            Node temp = new Node(val);
            Node x = head;
            for(int i=0; i<idx-1; i++) x = x.next;
            Node xnext = x.next;
            temp.next = xnext;
            temp.prev = x;
            x.next = temp;
            xnext.prev = temp;
            size++;
        }
        void deleteAtHead() {
            if(head == null) return;
            if(head == tail) {
                head = null;
                tail = null;
                size--;
                return;
            }
            tail.next = head.next;
            head = head.next;
            head.prev = tail;
            size--;
        }
        void deleteAtTail() {
            if(head == null) return;
            if(head == tail) {
                head = null;
                tail = null;
                size--;
                return;
            }
            Node ptr = tail.prev;
            ptr.next = head;
            head.prev = ptr;
            tail = ptr;
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
    }
    public static void main(String[] args) {
        CDLL list = new CDLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtTail(60);
        list.display();
    }
}