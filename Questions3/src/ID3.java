import java.util.Scanner;

public class ID3 {

	public static void main(String[] args) {
				
		System.out.println("Enter the number:");
		Scanner input = new Scanner(System.in);
		long primeOrNot=0;
		long largestPrime=0;
		long inp = input.nextLong();
		for(long i=1;i<=inp/2;i++){
			if(inp%i==0){
			primeOrNot = checkForPrime(i);
			if(primeOrNot!=-1)
				largestPrime=primeOrNot;
			}
		}
		System.out.println();
		System.out.printf("The largest Prime factor is: %d", largestPrime);
		
	}
	static long checkForPrime(long i){
		long counter=0;
		for(long j=1;j<=i/2;j++){
			if(i%j==0)
				counter++;
		}
		if(counter==1){
			System.out.printf("The number %d is a prime factor\n", i);
			return i;
		}
		return -1;
	}

}
