package basicAlgorithm;
import java.io.*;
import java.util.*;
import java.math.BigInteger;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Encrypt {
	static File file2 = new File("C:/Users/compaq/Desktop/text5.txt");
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
		String input1 = JOptionPane.showInputDialog("Length of text is " + text.length() + ". Enter the public key:");
		long hj = (long) Long.parseLong(input1);
		BigInteger pk = BigInteger.valueOf(hj);
		String input2 = JOptionPane.showInputDialog("Enter the value of N:");
		long jk = (long) Long.parseLong(input2);
		BigInteger n = BigInteger.valueOf(jk);
		//System.out.println("Enter the public key:");
		//BigInteger pk = input.nextBigInteger();
		//System.out.println("Enter the value of n:");
		//BigInteger n = input.nextBigInteger();
		//System.out.println("\n\nEncrypting THE Data...\n\n");
		//System.out.println("Encrypted Message:\n\n ");
		
		int temp;
		
		long p = System.currentTimeMillis();
		try (BufferedWriter br2 = new BufferedWriter(new FileWriter(file2))) {
			long z;
			for (int i = 0; i < text.length(); i++) {
				String r = " ";
				temp = (int) text.charAt(i);
		
				long u = printerEncryptAlgo(temp, pk, n, i);
				
				r += u;
				br2.write(r);
			}
		} catch (IOException e) {
			System.out.println("Unable to read file " + file2.toString());
		}
			 long q = System.currentTimeMillis();
			 //System.out.printf("\n\nTotal time in encrypting %d ms", q-p);
			 JOptionPane.showMessageDialog(null, "Time taken to encrypt is " + (q - p) + " ms");
		
	}
		public static long printerEncryptAlgo(int x,BigInteger k1,BigInteger k2,int j) throws Exception{
		
		
					
			BigInteger bigB_pubkey = new BigInteger(""+k1);	
			
		//BigInteger bigB_prvkey = new BigInteger("");
		
		BigInteger bigB_n = new BigInteger(""+k2);
		
		int asciival = x;
		
		BigInteger BigB_val = new BigInteger(""+asciival);
		BigInteger BigB_cipherVal = BigB_val.modPow(bigB_pubkey,bigB_n);
		if(j%50==0)
			System.out.println();
		//System.out.printf("%d ",BigB_cipherVal);
		return BigB_cipherVal.longValue();
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
