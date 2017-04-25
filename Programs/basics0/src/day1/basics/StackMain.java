package day1.basics;

public class StackMain {

	public static void main(String[] args) {

		Stack myStack = new Stack(4);
		
		myStack.push("1");
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
	}

}
