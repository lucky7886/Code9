package basics;

public class Start14 {

	public static void main(String[] args) throws Exception {

		int val = 0;

		try {
			for (val = -5; val < 5; val++)
				System.out.println(50 / val);
		} catch (Exception e) {

			System.out.println("divide by zero exception");
			e.printStackTrace();

		}
		System.out.println("Completed Successfully");

	}

}
