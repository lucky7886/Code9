package pandemonium_Level8;

class Node {

	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}

}

class Queue {
	Node front;
	Node rear;

	public boolean enqueue(int data) {
		if (front == null) {
			front = rear = new Node(data);
			return true;
		} else {

			Node n = new Node(data);
			rear.next = n;
			rear = n;
			return true;
		}
	}

	public boolean dequeue() {
		if (front == null) {
			System.out.println("Queue is empty");
			return false;
		}
		System.out.println("\nThe deleted value is: " + front.data);
		front = front.next;
		return true;
	}

	public void printQueue() {
		Node n = front;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

}

public class Main {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(15);
		q.printQueue();
		q.dequeue();
		q.printQueue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
	}

}
