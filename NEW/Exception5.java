
public class Exception5 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Hello");
			int a=2/0;
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Hi");
			System.exit(0);
		}
		
		finally {
			
			System.out.println("Hellloooo");
		}
	}

}
