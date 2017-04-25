package advanced;

public class Thread1Test {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Thread1("one"));
		Thread t2 = new Thread(new Thread1("two"));
		Thread t3 = new Thread(new Thread1("three"));
	t1.start();
	t2.start();
	t3.start();
	
	}

}
