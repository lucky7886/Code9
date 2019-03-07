
public class Exception3 {
	static int c = 0;

	public static void main(String[] args) {

		if (c < 3) {
			System.out.println("XYZ");
			m1();
		}

	}

	public static void m1() {
		c++;
		main(new String[] { "hello" });
		System.out.println("ABC");
		System.out.println(c);
	}

}
