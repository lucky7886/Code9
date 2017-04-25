package exceptions;

public class App2 {

	public static void main(String[] args) {

		String[] texts = {"one","two","three"};
		
		try{
		System.out.println(texts[2]);
		
		int value = 7;
		String text = null;
		System.out.println(text.length());
		value = value/0;
		}
		catch(NullPointerException e){
			System.out.println("null value");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array not handled properly");
		}
		catch(Exception e)
		{
			System.out.println("divide by zero is not possible");
		}
		
		
		
		
		//System.out.println(value);
		
	}

}
