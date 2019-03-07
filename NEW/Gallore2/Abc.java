package Gallore2;

abstract class ccc {

	public abstract void m1();

	public ccc() {

	}

	public ccc(int m) {

	}

}

class xyz3{
	xyz3(){
		super();
		System.out.println("xyz3");
	}
	{
		System.out.println("Hello1");
	}
}

public class Abc extends xyz3 {
	double value;
	Abc(){
		this(Math.random()*7);
		System.out.println("Abc");
	}
	Abc (double n)
	{
		super();
		value=n;
		System.out.println("Hello2");
	}
	{
		System.out.println("Hello3");
	}

	public static void main(String[] args) {
	//	ccc c = new ccc();
		Abc x2 = new Abc();
		
	}

}
