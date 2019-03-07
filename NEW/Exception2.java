
public class Exception2 {

	public static void main(String[] args) {
	
		try {
			
			System.out.println("Hello");
		}
		
		finally {
			
			
			System.out.println(add());
			System.out.println("Finally");
			
		}
		
		

	}
	
	
	public static int add() {
		
		System.out.println("Addition");
		try {
		System.out.println(1/0);
		return 1;
		
		}
		
		catch(Exception e) {
			return 2;
		}
		
		finally {
			System.out.println("Finally2");
			return 3;
			
		}
	}
	
	

}
