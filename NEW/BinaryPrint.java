import java.util.Scanner;

public class BinaryPrint {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number");

		int r1 = input.nextInt();

		System.out.println("Enter second number");

		int r2 = input.nextInt();

		for(int i=r1;i<r2;i++) {
			boolean val=true;
			String value = String.valueOf(i);
			
			for(int j=0;j<value.length();j++) {
				if(value.charAt(j)!='0' && value.charAt(j)!='1') {
					val=false;
					
					break;
					
				}
				
			}
			if(val)
			System.out.println(value);
		}
		
	}

}
