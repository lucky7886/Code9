package basics;

import java.math.BigInteger;
import java.util.Scanner; 
public class Decryption {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int x=0;
System.out.println("Enter the private key: ");
BigInteger b = input.nextBigInteger();

System.out.println("Enter the value of n: ");
BigInteger c = input.nextBigInteger();
System.out.println("Enter the ciphertext: ");
//System.out.println("Decrypting the Message...\n ");
int q = (int)System.currentTimeMillis();
while(x!=-1)
{
	
	BigInteger a = input.nextBigInteger();
		//x++;
		
		printerDecryptAlgo(a,b,c);
	
}
//System.out.println("Plaintext: ");
int p = (int)System.currentTimeMillis();
System.out.printf("\n\nTime taken for decryption is: %d", p-q);
	}
	
	
	public static void printerDecryptAlgo(BigInteger x,BigInteger y, BigInteger z)
	{
		
	BigInteger bigB_plainVal = x.modPow(y,z);
		
	int plainVal = 	bigB_plainVal.intValue();
		System.out.print((char)plainVal);
		
	}

	

}
