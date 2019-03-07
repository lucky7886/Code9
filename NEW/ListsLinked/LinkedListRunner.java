package ListsLinked;

class Node {

	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}
}

class LinkedList {
	Node head;

	public void insertElement(int data) {
		Node n = new Node(data);
		if (head == null)
			head = n;
		else {
			Node p = head;
			while (p.next != null) {
				p = p.next;
			}
			p.next = n;
		}
	}

	public void middleElement2() {
		Node[] nArr = new Node[size()];
		Node n = head;
		int i = 0;
		while (n != null) {
			nArr[i++] = n;
			n = n.next;
		}
		System.out.println("Middle element is " + nArr[i / 2].data);
	}

	public void middleElement3() {
		Node nSlow = head;
		Node mFast = head;
		while (mFast.next != null && mFast.next.next != null) {
			mFast = mFast.next.next;
			nSlow = nSlow.next;
		}
		System.out.println("Middle element is " + nSlow.data);
	}

	public void middleElement() {
		int len = size() / 2;
		int i = 0;
		Node p = head;
		while (i++ != len) {

			p = p.next;
		}
		System.out.printf("Middle element is %d ", p.data);
		System.out.println();
	}

	public void print() {
		Node p = head;
		while (p != null) {
			System.out.printf("%d ", p.data);
			p = p.next;

		}
		System.out.println();
	}

	public void print2() {
		Node p = head;
		for (int i = 0; i < 4; i++) {
			System.out.printf("%h ", p.next);
			p = p.next;
		}
		System.out.println();
	}

	public void circularOrNot() {
		Node[] nArr = new Node[5];
		Node n = head;
		boolean val = false;
		int i = 0;
		while (n != null) {
			System.out.println(n);
			for (int j = 0; j < i; j++) {
				if (nArr[j] == n) {
					val = true;
					break;
				}
			}
			if (val == true)
				break;

			nArr[i++] = n;

			n = n.next;

		}
		if (val)
			System.out.println("List is circular");
		else
			System.out.println("List is straight");
	}

	public void circularOrNot2() {
		Node nSlow = head;
		Node mFast = head;
		boolean value = false;
		while (mFast.next != null && mFast.next.next != null) {
			nSlow = nSlow.next;
			mFast = mFast.next.next;
			if (nSlow == mFast) {
				value = true;
				break;
			}
		}
		if (value)
			System.out.println("List is circular");
		else
			System.out.println("List is straight");
	}

	public int size() {
		int count = 0;
		Node n = head;
		while (n != null) {
			n = n.next;
			count++;
		}
		return count;

	}

	public void reverseLinkedList() {
		Node prev = null;
		Node cur = head;
		Node next = cur;

		while (cur != null) {
			next = next.next;
			cur.next = prev;
			prev = cur;
			cur = next;

		}
		head = prev;
	}

	public void makeListCircular() {
		Node n = head;
		while (n.next != null) {
			n = n.next;

		}
		n.next = head.next;

	}
}

public class LinkedListRunner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int[] arr = { 23, 24, 45, 67 };
		for (int i = 0; i < arr.length; i++)
			list.insertElement(arr[i]);
		// list.print();
		// list.middleElement3();
		// list.middleElement2();
		// list.middleElement();
		list.circularOrNot2();
		list.makeListCircular();
		list.circularOrNot2();
		// list.circularOrNot();
		// list.reverseLinkedList();
		// list.print();
	}

}
