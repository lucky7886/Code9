package basicAlgorithm;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

import javax.swing.JOptionPane; 
public class Decrypt {
	static int io=0;
	static File file3 = new File("C:/Users/compaq/Desktop/text6.txt");
	static long[] data = readFiles("C:/Users/compaq/Desktop/text5.txt");
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int x=0;
//System.out.println("Enter the private key: ");
//BigInteger b = input.nextBigInteger();
String input1 = JOptionPane.showInputDialog("Length of text is "+data.length+". Enter the private Key:");
long hj = (long) Long.parseLong(input1);
BigInteger b = BigInteger.valueOf(hj);
String input2 = JOptionPane.showInputDialog("Enter the value of N:");
long gh = (long) Long.parseLong(input2);
BigInteger c = BigInteger.valueOf(gh);
//System.out.println("Enter the value of n: ");
//BigInteger c = input.nextBigInteger();
//System.out.println("Enter the ciphertext: ");
//System.out.println("Decrypting the Message...\n ");
long q=0;
int w = data.length;
int j=data.length;
int eu=0;
try (BufferedWriter br2 = new BufferedWriter(new FileWriter(file3))) {
	while (w != 0) {
		String or = "";
		if (w == j - 1)
			q = System.currentTimeMillis();
		long we = data[eu];
			BigInteger a = new BigInteger("" + we);
		eu++;
		char te = printerDecryptAlgo(a, b, c);
		or += te;
		br2.write(or);
		w--;
	}
} catch (IOException e) {
	System.out.println("Unable to read file " + file3.toString());
}
//System.out.println("Plaintext: ");
long p = System.currentTimeMillis();
//System.out.printf("\n\nTime taken for decryption is: %d", p-q);
JOptionPane.showMessageDialog(null, "Time taken to decrypt is " + (p - q) + " ms");
	}
	

	private static long[] readFiles(String file) {
		try {
			File f = new File(file);
			Scanner s = new Scanner(f);
			int ctr = 0;
			while (s.hasNextLong()) {
				ctr++;
				s.nextLong();
			}
			long[] arr = new long[ctr];
			Scanner s1 = new Scanner(f);
			for (int i = 0; i < arr.length; i++)
				arr[i] = (long) s1.nextLong();
			return arr;
		} catch (Exception e) {
			return null;
		}
	}
	public static char printerDecryptAlgo(BigInteger x,BigInteger y, BigInteger z)
	{
		
		
	BigInteger bigB_plainVal = x.modPow(y,z);
		
	int plainVal = 	bigB_plainVal.intValue();
	io++;
	if(io%50==0)
		System.out.println();
		//System.out.print((char)plainVal);
		return (char)plainVal;
	}

	

}
