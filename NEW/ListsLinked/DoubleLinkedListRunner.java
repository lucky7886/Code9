package ListsLinked;

class Node3 {

	int data;
	Node3 next;
	Node3 prev;

	Node3(int data) {
		this.data = data;
	}
}

class DoubleLinkedList {
	Node3 head;
	Node3 tail;

	public void addNum(int data) {
		Node3 n = new Node3(data);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			n.prev = tail;
			tail = n;

		}
	}

	public void showList() {
		Node3 h = head;
		if (tail == null | head == null)
			System.out.println("The list is empty");
		while (h != null) {
			System.out.printf("%d ", h.data);
			h = h.next;
		}
		System.out.println();
	}

	public void printReverse() {
		Node3 h = tail;
		while (h != null) {
			System.out.printf("%d ", h.data);
			h = h.prev;
		}
		System.out.println();
	}

	public void add_beginning(int data) {
		Node3 n = new Node3(data);
		if (head == null) {
			head = n;
			tail = n;
		} else {

			n.next = head;
			head.prev = n;
			head = n;

		}

	}

	public void remodeNode_Last() {
		if (tail != null) {
			tail = tail.prev;
			if (tail != null)
				tail.next = null;
			else
				head = null;
		}

	}
}

public class DoubleLinkedListRunner {

	public static void main(String[] args) {
		DoubleLinkedList dList = new DoubleLinkedList();
		dList.addNum(23);
		dList.addNum(45);
		dList.addNum(90);
		/*
		 * dList.add_beginning(12); for (int i = 13; i < 150; i++) { if (i % 2 == 0)
		 * dList.add_beginning(i); else dList.addNum(i); } dList.showList();
		 * dList.printReverse();
		 */
		dList.showList();
		dList.remodeNode_Last();
		dList.showList();
		dList.remodeNode_Last();
		dList.showList();
		dList.remodeNode_Last();
		dList.showList();
		dList.addNum(90);
		dList.addNum(90);
		dList.addNum(90);
		dList.showList();

	}

}
