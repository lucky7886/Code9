package pandemonium_Level6;

class Node {

	Node next;
	int data;

	public Node(int data) {
		this.data = data;
	}

}

class Stack {
	Node top;

	public boolean push(int data) {
		Node n = new Node(data);
		if (top == null) {
			top = n;
			System.out.println(data + " has been pushed into stack.");
			return true;
		}
		n.next = top;
		top = n;
		System.out.println(data + " has been pushed into stack.");
		return true;

	}

	public boolean pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow");
			return false;
		}
		int val = top.data;
		top = top.next;
		System.out.println(val + " has been popped of stack");
		return true;
	}

	public int peek() {
		if (top != null)
			return top.data;
		return -1;
	}

	public boolean isEmpty() {

		if (top == null)
			return true;
		return false;

	}

}

public class Main {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s.pop());
		
	}

}
