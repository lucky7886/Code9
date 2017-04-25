package experimental;


class demo_10{
	int a=10;
	int b=2;
	void method(){
		System.out.println("i'm in parent class");
	}
	void method2(){
		System.out.println("i'm the second parent class method");
	}
}

public class demo10 extends demo_10 {
	int a=20;
	int c=3;
void method(){
	System.out.println("i'm in child class");
}
void method3(){
	System.out.println("i'm second method of child class");
}
	public static void main(String[] args) {

		demo_10 d = new demo_10();
		d.method();
		d.method2();
		System.out.println();
		demo10 d1 = new demo10();
		d1.method();
		d1.method2();
		d1.method3();
		
	
	System.out.println(d.a);
	System.out.println(d.b);
	System.out.println();
	System.out.println(d1.a);
	System.out.println(d1.b);
	System.out.println(d1.c);
	System.out.println();
	System.out.println();
	
	
	demo_10 d3 = new demo10();
	System.out.println(d3.a);
	System.out.println(d3.b);
	d3.method();
	d3.method2();
	demo10 d4;
	d4=(demo10)d3;
	d4.method3();
	System.out.println(d4.b);
d3.method2();	
d3.method();
	}

}
