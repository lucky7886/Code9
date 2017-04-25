import java.util.Scanner;

public class Star5 {

	public static void main(String[] args) {
		int count=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int y = input.nextInt();
		
		for(int i=1;i<=y;i++){
			if(y%i==0){
             count++;
			}
		}
		if(count==2)
			System.out.println("The number is prime");
		else
			System.out.println("The number is not prime");
		}

}
