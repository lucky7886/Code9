package pandemonium_Level5;

class Stack {
	final int max = 5;
	int top;
	int[] arr = new int[max];

	Stack() {
		top = -1;
	}

	boolean push(int value) {
		if (top == max - 1) {
			System.out.println("Stack overflow");
			return false;
		}
		arr[++top] = value;
		System.out.println(value+" pushed into stack.");
		return true;
	}

	int peek() {
		return arr[top];
	}

	boolean pop() {
		if(top<0) {
			System.out.println("Stack underflow");
			return false;
		}
		
		int val = arr[top--];
		System.out.println(val+" popped of stack");
		return true;
	}

	boolean isEmpty() {
		return top < 0;
	}

}

public class Main {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		System.out.println(s.push(70));
		
	}

}
