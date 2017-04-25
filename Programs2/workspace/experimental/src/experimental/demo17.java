package experimental;
public class demo17 {

	public static void main(String[] args) {
		Number m= 20;
		Number n = 20;
		int o=(int)n.longValue();
		int catch1=n.intValue();
		System.out.println(m.intValue());
		Error w = new Error();
		System.out.println(w.getMessage());
		char jk = 9007;
		System.out.println(jk);
	m1(2);
	m1('p');
	m2('q');
	//m2(2);
	}
	public static void m1(int m){
		System.out.println("hello");
		System.out.println(m);
	}
	public static void m2(char m){
		System.out.println("hello m");
	}
}
