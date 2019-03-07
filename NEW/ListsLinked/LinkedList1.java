package ListsLinked;

public class LinkedList1 {

	Node head;

	static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String... args) {
		LinkedList1 link1 = new LinkedList1();
		link1.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		link1.head.next = second;
		second.next = third;
		link1.printList();
	}

	public void printList() {

		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

}
