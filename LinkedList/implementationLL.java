
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
        
        void insert(int idx, int val) {
            if (idx == 0) {
                insertAtHead(val);
                return;
            }
            if (idx == size) {
                insertAtTail(val);
                return;
            }
            if (idx > size) {
                System.out.println("Out Of Bound"); 
                return;
            }
            Node temp = new Node(val);
            Node x = head;
            for (int i=0; i<idx-1; i++) {
                x = x.next;
            }
            temp.next = x.next;
            x.next = temp;
            size++;
        }
        
        void get (int idx) throws Error{
            if (idx == size-1) {
                System.out.println("Element = "+ tail.val);
                return;
            }
            if (idx >= size || idx<0) {
                throw new Error("Invalid Index!!");
            }
            Node x = head;
            for(int i=0; i<idx; i++) {
                x = x.next;
            }
            System.out.println("Element = "+x.val);
        }
        
        void set (int idx, int val) throws Error{
            if (idx == size-1) {
                tail.val = val;
                return;
            }
            if (idx >= size || idx < 0) {
                throw new Error("Invalid Index!!");
            }
            Node x = head;
            for(int i=0; i<idx; i++) {
                x = x.next;
            }
            x.val = val;
        }

        void deleteAtHead () throws Error{
            if (head == null) throw new Error("List is Empty!");
            head = head.next;
            size--;
        }

        void delete (int idx) throws Error{
            if(idx == 0) deleteAtHead();
            if(idx >= size || idx<0) throw new Error("Invalid Index!!");
            Node temp = head;
            for (int i=0; i<idx-1; i++) {
                temp = temp.next;
            }
            if(temp.next == tail) tail = temp;          // maintaing tail
            temp.next = temp.next.next;
            size--;
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
        list.insert(2,100);
        list.display();
        list.set(3, 90);
        list.display();
        list.size();
        //list.deleteAtHead();
        list.delete(7);
        list.display();
        list.get(6);
        list.size();
    }
}
