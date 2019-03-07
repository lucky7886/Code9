package ListsLinked;

class StackNode {

	int data;
	StackNode next;

}

class StackOps {
	StackNode top;

	public void push(int data) {
		StackNode stack = new StackNode();
		stack.data = data;
		if (top == null)
			top = stack;
		else {
			stack.next = top;
			top = stack;
		}
	}

	public void peek() {
		if (top != null)
			System.out.println(top.data);
		else
			System.out.println("Empty Stack");
	}

	public void print() {
		StackNode s = top;
		if (top == null)
			System.out.println("Stack is empty");
		else {
			while (s != null) {
				System.out.printf("%d ", s.data);
				s = s.next;
			}
			System.out.println();
		}
	}

	public void remove() {
		if (top == null)
			System.out.println("Empty Stack");
		else {
			top = top.next;
		}
	}

}

public class StackRunner {

	public static void main(String[] args) {

		StackOps obj = new StackOps();
		obj.print();
	}

}
