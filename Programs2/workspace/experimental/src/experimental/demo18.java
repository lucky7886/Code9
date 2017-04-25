package experimental;


class demo_18 extends demo18{

public void m1(){
		System.out.println("child class");
		
	}
public void m2(){
	System.out.println("overridden method");
}
	
}
public class demo18 {
 protected void m2(){
	System.out.println("parent class");
}


	public static void main(String[] args) {

		
		demo_18 d = new demo_18();
		d.m1();
		d.m2();
		
		demo18 d5 = d;
		d5.m2();
		
		demo18 d1 = new demo18();
		d1.m2();
		//this can not be done ... child reference holding parent object!!
		//demo_18 d2 = (demo_18) new demo18();
		//d2.m1();
		//d2.m2();
		
		demo18 d3 = new demo_18();
		d3.m2();
		
		demo_18 d4 = (demo_18)d3;
		d4.m1();
		d4.m2();
	}

}