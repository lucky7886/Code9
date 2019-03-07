package pandemonium_Level7;

class Queue {
	private int capacity = 100, rear, front;
	private int[] arr = new int[capacity];

	Queue() {
		rear = front = -1;
	}

	public boolean enqueue(int value) {
		if (front == -1)
			front = 0;
		if (rear == capacity) {
			System.out.println("Queue is full");
			return false;
		} else {
			arr[++rear] = value;
			return true;
		}
	}

	public boolean dequeue() {
		if (rear == -1) {
			System.out.println("queue is empty");
			return false;
		} else {
			int i = arr[front];
			for (int j = front; j <= rear; j++) {
				arr[j] = arr[j+1];
			}
			System.out.println("\nElement popped: " + i);
			rear--;
			return true;
		}
	}

	public void printQueue() {
		for (int i = front; i <= rear; i++)
			System.out.print(arr[i] + " ");
	}

}

public class Main {

	public static void main(String[] args) {

		Queue q = new Queue();
		q.enqueue(12);
		q.enqueue(14);
		q.enqueue(16);
		q.enqueue(19);
		q.printQueue();
		q.dequeue();
		q.printQueue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.printQueue();
		
	}

}
