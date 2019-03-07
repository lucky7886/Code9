
public class Exception4 {
	int a = 1000;

	public static void main(String[] args) {
		Exception4 e = new Exception4();
		e.m1();

	}

	void m1() {
		if (a > 0)
			m2(a);
			//m2();
	}

	void m2(int a) {
		this.a--;
		m1();
		System.out.println(a);
	}
	
/*	void m2() {
		a++;
		m1();
		System.out.println(a);
	}*/

}
