
public class start1 {
static int i=10;
static{
	m1();
	System.out.println(i);
	System.out.println("first static block");
}
	public static void main(String[] args) {

		m1();
		System.out.println("main method");
		
	}
	
	public static void m1(){
		System.out.println(j);
	}
static{
	m1();
	System.out.println("second static block");
}
static int j=20;
}
