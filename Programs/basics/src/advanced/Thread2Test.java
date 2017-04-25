package advanced;

public class Thread2Test {

	public static void main(String[] args) {
Thread t1 = new Thread(new Thread2("one"));
Thread t2 = new Thread(new Thread2("two"));		
Thread t3 = new Thread(new Thread2("three"));
Thread t4 = new Thread(new Thread2("four"));
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	}

}
