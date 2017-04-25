package codingAlgorithm;

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
	static int k1=2048;
	static int k2=2;
	static int k3=1;
	static long[] arr3 = new long[50000];
	static int n = 1;
	static File file2 = new File("C:/Users/compaq/Desktop/text2.txt");

	public static void main(String[] args) throws Exception {
		Random r5 = new Random();
		for (int i = 0; i < 50000; i++) {
			arr3[i] = 123456789l * n*n;
			n += 1;
		}
		FileReader file = new FileReader("C:/Users/compaq/Desktop/text.txt");
		BufferedReader reader = new BufferedReader(file);
		String text = "";
		String line = reader.readLine();
		while (line != null) {
			text += line;

			line = reader.readLine();
		}
		reader.close();
		System.out.println(text);
		Scanner input = new Scanner(System.in);
		String a = text;
		String input1 = JOptionPane.showInputDialog("Length of text is " + text.length() + ". Enter the public key:");
		long hj = (long) Long.parseLong(input1);
		BigInteger pk = BigInteger.valueOf(hj);
		String input2 = JOptionPane.showInputDialog("Enter the value of N:");
		long jk = (long) Long.parseLong(input2);
		BigInteger n = BigInteger.valueOf(jk);
		int temp;
		long temp1;
		long p =  System.currentTimeMillis();
		try (BufferedWriter br2 = new BufferedWriter(new FileWriter(file2))) {
			long z;
			for (int i = 0; i < text.length(); i++) {
				String r = " ";
				temp = (int) text.charAt(i);
				temp1 = (temp ^ k1) << k3;
				long u = printerEncryptAlgo(temp1, pk, n, i);
				z = (u ^ arr3[i]) << k2;
				r += z;
				br2.write(r);
			}
		} catch (IOException e) {
			System.out.println("Unable to read file " + file2.toString());
		}
		long q =  System.currentTimeMillis();
		JOptionPane.showMessageDialog(null, "Time taken to encrypt is " + (q - p) + " ms");
	}

	public static long printerEncryptAlgo(long x, BigInteger k1, BigInteger k2, int j) throws Exception {

		BigInteger bigB_pubkey = new BigInteger("" + k1);
		BigInteger bigB_n = new BigInteger("" + k2);
		long asciival = x;
		BigInteger BigB_val = new BigInteger("" + asciival);
		BigInteger BigB_cipherVal = BigB_val.modPow(bigB_pubkey, bigB_n);
		long big = BigB_cipherVal.longValue();
		return big;
	}

}
