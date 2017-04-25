package CodingAlgorithm6;


import java.io.*;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import CodingAlgorithm2.Decrypt;
public class Encrypt implements Runnable {
	static String text = "";
	static BigInteger pk,n2;
	int id;
	public Encrypt(int id){
		this.id=id;
	}
	static int random;
	static String r="";
	static String q="";
	static String rq="";
	//static long[] arr = new long[9000];
	static	long[] arr3 = new long[60000];
	static int n=1;
	static File file2 = new File("C:/Users/compaq/Desktop/text2.txt");
	public static void main(String[] args) throws Exception {
		long p = (int)System.currentTimeMillis();
		int n1=1;
for(int i=0;i<9000;i++){
arr3[i]=1024*n1;
n1+=1;
}

		Scanner input = new Scanner(System.in);
		FileReader file = new FileReader("C:/Users/compaq/Desktop/text.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String line = reader.readLine();
		while(line!=null)
		{
		text += line;

		line = reader.readLine();
		}
		reader.close();
		System.out.println(text);
				
		System.out.println("\nLength of text: "+text.length());
		System.out.println("Enter the public key:");
		pk = input.nextBigInteger();
		System.out.println("Enter the value of n:");
		n2 = input.nextBigInteger();
		ExecutorService executor = Executors.newFixedThreadPool(2);
        long  a = System.currentTimeMillis();
        for(int i=0;i<2;i++)
        	executor.submit(new Encrypt(i));
        executor.shutdown();

        try {
        	executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
        	// TODO Auto-generated catch block
        	e.printStackTrace();
        }
		
		
		
		
		
int checker=0;
				Random r5 = new Random();
				/*
				while(true){
					checker=0;
				 random = 10000+r5.nextInt(90000);
			for(int ij=1;ij<=random;ij++)
				if(random%ij==0)
					checker++;
			if(checker==2)
				break;
				}
				*/

     //BigInteger x = new BigInteger(""+8);
    // System.out.println(x);
		
	//	BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter the String");
	//	String a = m.readLine();
		//String a = text;
		//System.out.println("\n\nEncrypting THE Data...\n\n");
	//	System.out.println("Encrypted Message:\n\n ");
		/*
		int h=1;
		
		for(int i=0;i<text.length();i++){
			arr[i]= 8*h;
			h+=1;
		}
		*/

		
		
		

rq = r+q;
		
		try(BufferedWriter br2 = new BufferedWriter(new FileWriter(file2))){
		br2.write(rq);	
	}
catch(IOException e){
	System.out.println("Unable to read file "+file2.toString());
}		


//System.out.println("\nLength of text: "+text.length());
			 int q = (int)System.currentTimeMillis();
			 System.out.printf("\n\nTotal time in encrypting %d ms", q-p);
		//System.out.println("\nThe key is: "+random);
		
	}

	/*
	public static void print(int q){
		//System.out.println(q);
		String r="";
		r+=q;
try(BufferedWriter br2 = new BufferedWriter(new FileWriter(file2))){
br2.write(r);
br2.newLine();
		}
		*/
	
	
		public static long printerEncryptAlgo(long x,BigInteger k1,BigInteger k2,int j){
		
		
					
			BigInteger bigB_pubkey = new BigInteger(""+k1);	
			
		//BigInteger bigB_prvkey = new BigInteger("");
		
		BigInteger bigB_n = new BigInteger(""+k2);
		
		long asciival = x;
		
		BigInteger BigB_val = new BigInteger(""+asciival);
		BigInteger BigB_cipherVal = BigB_val.modPow(bigB_pubkey,bigB_n);
		long big = BigB_cipherVal.longValue();
		//if(j%3==0)
			//System.out.println();
//		System.out.printf("%d ",big);
		//System.out.printf("%d ",BigB_cipherVal);
		return big;
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
		
		@Override
	
		public void run() {
if(id==0){
			for(int i=0;i<text.length()/2;i++){
				//String r=" ";		
				int temp=(int)text.charAt(i);
				long temp1=(temp^2048)<<1;
				long u;
				
					u = printerEncryptAlgo(temp1,pk,n2,i);
				
				long z = (u^arr3[i])<<2;
				
	              r+=" "+z;
//				br2.write(r);
			}	
		}
if(id==1){
	for(int i=text.length()/2;i<text.length();i++){
		//String r=" ";		
		int temp=(int)text.charAt(i);
		long temp1=(temp^2048)<<1;
		long u;
		
			u = printerEncryptAlgo(temp1,pk,n2,i);
		
		long z1 = (u^arr3[i])<<2;
		
          q+=" "+z1;
//		br2.write(r);
	}
}
		}
}
