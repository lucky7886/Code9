package codingAlgorithm;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Decrypt {
	static int random;
	static int k1=2048;
	static int k2=2;
	static int k3=1;
	static File file3 = new File("C:/Users/compaq/Desktop/text3.txt");
	static long[] arr1 = new long[2];
	static long[] arr4 = new long[50000];
	static int nm = 1;
	static long[] data = readFiles("C:/Users/compaq/Desktop/text2.txt");
	static int t = 0;

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 50000; i++) {
			arr4[i] = 123456789l * nm*nm;
			nm += 1;
		}
		Scanner input = new Scanner(System.in);
		int x = 0;
		int j = data.length;
		String input1 = JOptionPane.showInputDialog("Length of text is "+data.length+". Enter the private Key:");
		long hj = (long) Long.parseLong(input1);
		BigInteger b = BigInteger.valueOf(hj);
		String input2 = JOptionPane.showInputDialog("Enter the value of N:");
		long gh = (long) Long.parseLong(input2);
		BigInteger c = BigInteger.valueOf(gh);
		int i = 0;
		int h1 = 1;
		long q = 0;
		int w = data.length;
		int eu = 0;
		try (BufferedWriter br2 = new BufferedWriter(new FileWriter(file3))) {
			while (w != 0) {
				String or = "";
				if (w == j - 1)
					q = System.currentTimeMillis();
				long we = data[eu];
				long yu = (we >> k2) ^ arr4[eu];
				BigInteger a = new BigInteger("" + yu);
				eu++;
				char te = printerDecryptAlgo(a, b, c, arr1);
				or += te;
				br2.write(or);
				w--;
			}
		} catch (IOException e) {
			System.out.println("Unable to read file " + file3.toString());
		}

		long p =  System.currentTimeMillis();
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

	public static char printerDecryptAlgo(BigInteger x, BigInteger y, BigInteger z, long[] arr1) {

		BigInteger bigB_plainVal = x.modPow(y, z);
		long plainVal = bigB_plainVal.longValue();
		long plainVal1 = (plainVal >> k3) ^ k1;
		t++;
		return (char) plainVal1;
	}
}
