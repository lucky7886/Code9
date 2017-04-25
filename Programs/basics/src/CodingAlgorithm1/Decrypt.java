package CodingAlgorithm1;



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
static File file3 = new File("C:/Users/compaq/Desktop/text6.txt");	
static long[] arr1 = new long[2];
	static long[] arr4 = new long[60000];
	static int nm=1;
	static long[] data = readFiles("C:/Users/compaq/Desktop/text2.txt");
	static int t=0;
	//static File file2 = new File("C:/Users/compaq/Desktop/text4.txt");
	public static void main(String[] args) throws Exception {
for(int i=0;i<9000;i++){
	arr4[i]=1024*nm;
	nm+=1;
}

		Scanner input = new Scanner(System.in);
int x=0;
//System.out.println(Arrays.toString(data));
//System.out.println(data.length);
/*
FileReader file = new FileReader("C:/Users/compaq/Desktop/text2.txt");
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
*/
int j=data.length;
String input1 = JOptionPane.showInputDialog("Length of text is "+data.length+". Enter the private Key:");
//String input1 = JOptionPane.showInputDialog("Enter the private Key:");
long hj = (long)Long.parseLong(input1);
BigInteger b = BigInteger.valueOf(hj);
String input2 = JOptionPane.showInputDialog("Enter the value of n:");
long gh = (long)Long.parseLong(input2);
BigInteger c = BigInteger.valueOf(gh);
//System.out.println("Enter the private key: ");
//BigInteger b = input.nextBigInteger();
//System.out.println("Enter the key: ");
//random = input.nextInt();
//System.out.println("Enter the size of text");
//int j  = input.nextInt();
//System.out.println("Enter the value of n: ");
//BigInteger c = input.nextBigInteger();
//System.out.println("Enter the ciphertext: ");
/*
int h=1;
for(int i=0;i<data.length;i++){
	arr1[i] = 8*h;
	h+=1;
}
*/
//System.out.println("Decrypting the Message...\n ");
//int q = (int)System.currentTimeMillis();
int i=0;
int h1=1;
int q=0;
//x=667;
int w=data.length;
int eu=0;
try(BufferedWriter br2 = new BufferedWriter(new FileWriter(file3))){
while(w!=0)
{
	String or ="";
//	String r =" ";
if(w==j-1)
q = (int)System.currentTimeMillis();
//long we = input.nextLong();
long we = data[eu];
long yu = (we>>2)^arr4[eu];
BigInteger a = new BigInteger(""+yu);
eu++;
//BigInteger a = input.nextBigInteger();
	//x++;
	
	char te = printerDecryptAlgo(a,b,c,arr1);
	or+=te;
	br2.write(or);
//	char cf = (char)out;
//	r+=cf;
//	br2.write(r);
w--;
}
}
catch(IOException e){
	System.out.println("Unable to read file "+file3.toString());
}		

/*
try(BufferedWriter br2 = new BufferedWriter(new FileWriter(file2))){

	while(w!=0)
{
		String r =" ";
	if(w==j-1)
	q = (int)System.currentTimeMillis();
	int we = input.nextInt();
	int yu = we>>3;
	BigInteger a = new BigInteger(""+yu);
//	BigInteger a = input.nextBigInteger();
		//x++;
		
		int out = printerDecryptAlgo(a,b,c,arr1);
		char cf = (char)out;
		r+=cf;
		br2.write(r);
	w--;
}
}
catch(IOException e){
	System.out.println("Unable to read file "+file2.toString());
}		
*/
//System.out.println("Plaintext: ");
int p = (int)System.currentTimeMillis();
//System.out.printf("\n\nTime taken for decryption is: %dms", p-q);
JOptionPane.showMessageDialog(null,"Time taken to decrypt is "+(p-q)+" ms");
	}
	
	private static long[] readFiles(String file) {
	try{
		File f = new File(file);
		Scanner s = new Scanner(f);
		int ctr = 0;
		while(s.hasNextLong()){
			ctr++;
			s.nextLong();
		}
		long[] arr = new long[ctr];
		Scanner s1 = new Scanner(f);
		for(int i=0;i<arr.length;i++)
			arr[i]=(long)s1.nextLong();
		return arr;
	}
	catch(Exception e){
		return null;
	}
	}
	public static char printerDecryptAlgo(BigInteger x,BigInteger y, BigInteger z,long[] arr1)
	{
		
		
	BigInteger bigB_plainVal = x.modPow(y,z);
		
	long plainVal = 	bigB_plainVal.longValue();
	long plainVal1 = (plainVal>>1)^2048;
	

		//System.out.print((char)plainVal1);
		t++;
		return (char)plainVal1;
	}

	

}
