package basics;
import java.util.*;
import java.math.BigInteger;
import java.util.Scanner;
public class Encryption {

	public static void main(String[] args) {
     //BigInteger x = new BigInteger(""+8);
    // System.out.println(x);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String a = input.nextLine();
		System.out.println("Enter the public key:");
		BigInteger pk = input.nextBigInteger();
		System.out.println("Enter the value of n:");
		BigInteger n = input.nextBigInteger();
		System.out.println("\n\nEncrypting THE Data...\n\n");
		System.out.println("Encrypted Message:\n\n ");
		
		int temp=0;
		int p = (int)System.currentTimeMillis();
		for(int i=0;i<a.length();i++){
		
			temp=(int)a.charAt(i);
			printerEncryptAlgo(temp,pk,n,i);
		}
			 int q = (int)System.currentTimeMillis();
			 System.out.printf("\n\nTotal time in encrypting %d", q-p);
		
		
	}
		public static void printerEncryptAlgo(int x,BigInteger k1,BigInteger k2,int j){
		
			
			BigInteger bigB_pubkey = new BigInteger(""+k1);	
			
		//BigInteger bigB_prvkey = new BigInteger("");
		
		BigInteger bigB_n = new BigInteger(""+k2);
		
		int asciival = x;
		
		BigInteger BigB_val = new BigInteger(""+asciival);
		BigInteger BigB_cipherVal = BigB_val.modPow(bigB_pubkey,bigB_n);
		if(j%3==0)
			System.out.println();
		System.out.printf("%d ",BigB_cipherVal);
		
		//BigInteger[] ab = new BigInteger[100];
		//int h=0;
		//ab[h++]=BigB_cipherVal;
		//printerDecryptAlgo(BigB_cipherVal,bigB_prvkey,bigB_n);
		}	
		
		public static void printerDecryptAlgo(BigInteger x,BigInteger y, BigInteger z)
		{
			
		BigInteger bigB_plainVal = x.modPow(y,z);
			
		int plainVal = 	bigB_plainVal.intValue();
			System.out.printf("plaintext: %s\n",(char)plainVal);
			
		}

}
