package randomness;

public class App {

	public static void main(String[] args) {

		m1(5);

	}

	public static void m1(int n) {

		if (n > 0) {
			m1(n - 1);
			System.out.println(n);
			m1(n - 1);
		}

	}

}
