package singleton;

public class SingleTest {

	public static void main(String[] args) {
		
		
		
		Single s1 = Single.getInstance();
		
		
		
		Single s2 = Single.getInstance();
		
		System.out.println(s1.count);
		System.out.println(s2.count);
		
		
		s1.count=2;
		
		System.out.println(s1.count);
		System.out.println(s2.count);
		
	
		System.out.println(s1.instance);
		
		System.out.println(s2.instance);
		
	}

}
