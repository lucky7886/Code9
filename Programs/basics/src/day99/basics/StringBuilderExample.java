package day99.basics;

public class StringBuilderExample {

	public static void main(String[] args) {

		StringBuilder buffer1 = new StringBuilder();
		StringBuilder buffer2 = new StringBuilder(10);
		StringBuilder buffer3 = new StringBuilder("hello");
		
		buffer3.append(" world");
		
		
		System.out.printf("buffer1 = \"%s\"\n",buffer1);
		System.out.printf("buffer2 = \"%s\"\n",buffer2);
		System.out.printf("buffer3 = \"%s\"\n",buffer3);
		
		
		
		
	}

}
