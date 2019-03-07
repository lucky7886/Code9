package singleton;

public class Single {

	public static volatile Single instance=null;
	public int count;

	private Single() {

	}

	public static Single getInstance() {
		if (instance == null) {
			instance = new Single();
		}
		return instance;
	}

	public static void m1() {
		System.out.println("Hello1");
	}

	public static void m2() {
		System.out.println("Hello2");
	}
}
