package ListsLinked;

class Node2 {

	int data;
	Node2 random;
	Node2 next;

	Node2(int data) {

		this.data = data;

	}

}

class LinkedList2 {
	Node2 head;

	public void addNode(int data) {
		Node2 n = new Node2(data);
		if (head == null)
			head = n;
		else {
			Node2 p = head;
			while (p.next != null)
				p = p.next;
			p.next = n;
		}

	}

	public void showNodes() {
		Node2 p = head;
		while (p != null) {
			System.out.printf("%d ", p.data);
			p = p.next;
		}
		System.out.println();
	}

	// {Recommended usage: there should be atleast 5 nodes
	public void initializeRandomPointers() {
		Node2 p = head;
		int count = 0;
		while (p != null) {
			p = p.next;
			count++;
		}
		System.out.println("The number of nodes is " + count);
		p = head;
		Node2[] arr = new Node2[count];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = p;
			p = p.next;
		}
		//shuffle the array
		for(int i=0;i<arr.length;i++) {
			int j = (int) (Math.random() * count);
			Node2 temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		p=head;
		for(int i=0;i<arr.length;i++) {
			
			p.random=arr[i];
			p=p.next;
			
		}

	/*	p = head;
		int c = 0;
		int j = 0;
		while (true) {
			if (c == count)
				break;
			do {
				if (c == count)
					break;
				j = (int) (Math.random() * count);
			} while (arr[j] == null);
			p.random = arr[j];
			arr[j] = null;
			c++;
		}*/
		
		System.out.println(head);

		p = head;
		while (p != null) {
			System.out.println(p.random);
			System.out.println(p.next);
			p = p.next;
		}

	}

}

public class LinkedListRunner2 {

	public static void main(String[] args) {
		LinkedList2 list = new LinkedList2();
		list.addNode(2);
		list.addNode(8);
		list.addNode(1);
		list.showNodes();
		list.initializeRandomPointers();
	}

}
