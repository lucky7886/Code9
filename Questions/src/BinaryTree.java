
class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}

}

class BinaryTree {

	Node node;

	public BinaryTree() {
		node = null;
	}

	public void printPreOrder(Node node) {
		if(node==null)
			return;
		System.out.printf("%d  ", node.key);
		printPreOrder(node.left);		
		printPreOrder(node.right);
	}

	public void printInOrder(Node node) {
		if(node==null)
			return;		
		printInOrder(node.left);		
		System.out.printf("%d  ", node.key);
		printInOrder(node.right);
	}

	public void printPostOrder(Node node) {
		if(node==null)
			return;
		printPostOrder(node.left);		
		printPostOrder(node.right);
		System.out.printf("%d  ", node.key);
		
	}

/*	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.node = new Node(1);
		tree.node.left = new Node(2);
		tree.node.right = new Node(3);
		tree.node.left.left = new Node(4);
		tree.node.left.right = new Node(5);
		System.out.println("Preorder is: \n");
		tree.printPreOrder(tree.node);
		System.out.println("\n\nPostorder is: \n");
		tree.printPostOrder(tree.node);
		System.out.println("\n\nInorder is: \n");
		tree.printInOrder(tree.node);
	}*/
	
	public static void main(String[] args) {
		
		Node node1 = new Node(1);
		System.out.println(node1.key);
		
		Node node = node1;
		
		node1.left = new Node(2);
		node1.right = new Node(3);
		
		
	}
	
	

}
