package ArraysGallore;

public class Exp5 {

	public static void main(String[] args) {
	//	m1();
		
//		for(int i=0;i<3; System.out.println("hello"),System.out.println("hello2"),i++) {
	//		System.out.println("hello3");
	//	}

		
		outer:
			 for (int i=0; i<5; i++) {
			 for (int j=0; j<5; j++) {
			 System.out.println("Hello");
			 continue outer;
			 }
			 System.out.println("outer");
			 }
			System.out.println("Good-Bye");
		
		
		/*int age=34;
		outer:
			while(age<=21) {
				
			}*/
		
		
	}

	public static void m1() {
		for (int x = 0; x < 3; x++) {
			System.out.println("in for loop");
			return;
			/*
			 * if (x == 1) try { System.out.println(1 / 0); } catch (Exception e) {
			 * System.out.println("handled gracefully"); }
			 */
		}
		System.out.println("hello2");
	}

}
