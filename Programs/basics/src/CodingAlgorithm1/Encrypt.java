package CodingAlgorithm1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Encrypt {
	static int random;
	//static long[] arr = new long[9000];
	static	long[] arr3 = new long[60000];
	static int n=1;
	static File file2 = new File("C:/Users/compaq/Desktop/text8.txt");
	public static void main(String[] args) throws Exception {

//int checker=0;
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
	for(int i=0;i<9000;i++){
		arr3[i]=1024*n;
	n+=1;
	}
		FileReader file = new FileReader("C:/Users/compaq/Desktop/text8.txt");
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
		//System.out.println("\nLength of text: "+text.length());
	String input1 = JOptionPane.showInputDialog("Length of text is "+text.length()+". Enter the public key:");
	long hj = (long)Long.parseLong(input1);
	BigInteger pk = BigInteger.valueOf(hj);
	String input2 = JOptionPane.showInputDialog("Enter the private key:");
	long jk = (long)Long.parseLong(input2);
	BigInteger n = BigInteger.valueOf(jk);
		//System.out.println("Enter the public key:");
	//	BigInteger pk = input.nextBigInteger();
		//System.out.println("Enter the value of n:");
		//BigInteger n = input.nextBigInteger();
		//System.out.println("\n\nEncrypting THE Data...\n\n");
	//	System.out.println("Encrypted Message:\n\n ");
		/*
		int h=1;
		
		for(int i=0;i<text.length();i++){
			arr[i]= 8*h;
			h+=1;
		}
		*/

		int temp;
		long temp1;
		int p = (int)System.currentTimeMillis();
		
		
try(BufferedWriter br2 = new BufferedWriter(new FileWriter(file2))){
long z;
		for(int i=0;i<text.length();i++){
			String r=" ";		
			temp=(int)text.charAt(i);
			temp1=(temp^2048)<<1;
			long u = printerEncryptAlgo(temp1,pk,n,i);
			 z = (u^arr3[i])<<2;
			
r+=z;
			br2.write(r);
		}
}
catch(IOException e){
	System.out.println("Unable to read file "+file2.toString());
}		


//System.out.println("\nLength of text: "+text.length());
			 int q = (int)System.currentTimeMillis();
			 //System.out.printf("\n\nTotal time in encrypting %d ms", q-p);
		//System.out.println("\nThe key is: "+random);
		JOptionPane.showMessageDialog(null, "Time taken to encrypt is "+(q-p)+" ms");
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
	
	
		public static long printerEncryptAlgo(long x,BigInteger k1,BigInteger k2,int j) throws Exception{
		
		
					
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

}
