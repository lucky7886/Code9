package CodingAlgorithm;
import java.io.*;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.math.BigInteger;
import java.util.Scanner;
public class Encrypt {

	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("C:/Users/compaq/Desktop/text.txt");
		BufferedReader reader = new BufferedReader(file);
		String text = "";
		String line = reader.readLine();
		while(line!=null)
		{
		text += line;

		line = reader.readLine();
		}
		reader.close();
		System.out.println(text);
				
     //BigInteger x = new BigInteger(""+8);
    // System.out.println(x);
		Scanner input = new Scanner(System.in);
	//	BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter the String");
	//	String a = m.readLine();
		String a = text;
		System.out.println("Enter the public key:");
		BigInteger pk = input.nextBigInteger();
		System.out.println("Enter the value of n:");
		BigInteger n = input.nextBigInteger();
		System.out.println("\n\nEncrypting THE Data...\n\n");
		System.out.println("Encrypted Message:\n\n ");
		int[] arr = new int[a.length()];
		int h=1;
		
		for(int i=0;i<a.length();i++){
			arr[i]= 8*h;
			h+=1;
		}
		int temp;
		int temp1;
		int p = (int)System.currentTimeMillis();
		for(int i=0;i<a.length();i++){
                		
			temp=(int)a.charAt(i);
			temp1=(temp+arr[i])<<1;
			printerEncryptAlgo(temp1,pk,n,i);
		}
			 int q = (int)System.currentTimeMillis();
			 System.out.printf("\n\nTotal time in encrypting %d ms", q-p);
		
		
	}
		public static void printerEncryptAlgo(int x,BigInteger k1,BigInteger k2,int j) throws Exception{
		
		
					
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
