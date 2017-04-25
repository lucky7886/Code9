package experimental;


class demo_8 extends demo8{
	int b;
	public demo_8(){
		System.out.println("constructor invoked for demo_8");
	}
	
}
public class demo8 {

	int a;
	public demo8(){
		System.out.println("constructor invoked");
	}

	
	
	public static void main(String[] args) {

		demo_8 dd = new demo_8();
		
	}

}
