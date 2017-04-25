package CodingAlgorithm;


import java.math.BigInteger;
import java.util.Scanner; 
public class Decrypt {
	static int t=0;
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int x=0;
System.out.println("Enter the private key: ");
BigInteger b = input.nextBigInteger();

System.out.println("Enter the value of n: ");
BigInteger c = input.nextBigInteger();
System.out.println("Enter the ciphertext: ");
int[] arr1 = new int[10000];
int h=1;
for(int i=0;i<10000;i++){
	arr1[i] = 8*h;
	h+=1;
}
//System.out.println("Decrypting the Message...\n ");
int q = (int)System.currentTimeMillis();
int i=0;
int h1=1;
x=667;
while(x!=0)
{
	
	BigInteger a = input.nextBigInteger();
		//x++;
		
		printerDecryptAlgo(a,b,c,arr1);
		
	x--;
}
//System.out.println("Plaintext: ");
int p = (int)System.currentTimeMillis();
System.out.printf("\n\nTime taken for decryption is: %dms", p-q);
	}
	
	
	public static void printerDecryptAlgo(BigInteger x,BigInteger y, BigInteger z,int[] arr)
	{
		
		
	BigInteger bigB_plainVal = x.modPow(y,z);
		
	int plainVal = 	bigB_plainVal.intValue();
	int plainVal1 = (plainVal>>1)-arr[t];
		System.out.print((char)plainVal1);
		t++;
	}

	

}
