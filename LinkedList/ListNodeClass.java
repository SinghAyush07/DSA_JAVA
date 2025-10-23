
// class Car {
//     int price;
//     String name;
//     Car(int price, String name) {
//         this.price = price;
//         this.name = name;
//     }
// }

// class Node {
// 	int val;
// 	Node next;
	
// 	Node(int val) {
// 		this.val = val;
// 	}
// }

public class ListNodeClass {
    static class Node {
	int val;
	Node next;
	
	Node(int val) {
		this.val = val;
	}
}
	public static void main(String[] args) {
		Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;                     // linking => a -> b
        // 10 -> 20
        b.next = c;                     // linking => b -> c
        // 10 -> 20 -> 30
        c.next = d;                     // linking => c -> d
        // 10 -> 20 -> 30 -> 40
        d.next = e;
        // 10 -> 20 -> 30 -> 40 -> 50
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);
	}
}
