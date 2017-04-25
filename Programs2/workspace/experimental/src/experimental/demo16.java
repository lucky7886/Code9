package experimental;

public class demo16 {

	public static void main(String[] args) {
		int p=10;
				int c=p;
		c++;
		//System.out.println(p);
		//System.out.println(c);
		Integer x=10;
		Integer y=x;
		x++;
		//System.out.println(x);
		//System.out.println(y);
		Integer b=128;
		Integer v=128;
		System.out.println(b==v);
		Character n = 97;
		System.out.println(n);
		String[] f={""};
		hel("12","12","11","12","12","12","12","12");
		m1(2.0000000000000000000000000000000000000000000000000);
		Object o=10;
		Number l =10;
	}
	public static void hel(String... g){
		System.out.println(g.length);
	}
	public static void m1(float m){
		System.out.println("float method");
	}
	public static void m1(double m){ 
	System.out.println("double method");
}
}