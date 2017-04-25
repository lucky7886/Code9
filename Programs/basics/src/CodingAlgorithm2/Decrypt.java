package CodingAlgorithm2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import exceptions.App;

public class Decrypt implements Runnable{
static long[] arr5 = new long[9000];
	static BigInteger n;
	static File file3 = new File("C:/Users/compaq/Desktop/text2.txt");
	static int t=0;
	static String g="";
	static String v="";
	static BigInteger m;
	static long[] data = readFiles("C:/Users/compaq/Desktop/text4.txt");
static int[] arr1 = new int[data.length];
static	int h=1;
static int d=data.length/2;
	
	int id;
public Decrypt(int id){
	this.id = id;
	
}


	static int nk=1;

public static void main(String[] args){
	for(int i=0;i<9000;i++){
		arr5[i]=123456789l * nk * nk;
		nk+=1;
	}
	Scanner input = new Scanner(System.in);
//	int[] data = readFiles("C:/Users/compaq/Desktop/text2.txt");
	for(int p=0;p<data.length;p++){
		arr1[p] = 8*h;
		h+=1;
	}
	//for(int i=0;i<data.length;i++)
		//System.out.println(data[i]);
	System.out.println(Arrays.toString(data));
System.out.println("Enter the private key: ");
 m = input.nextBigInteger();
//System.out.println("Enter the size of text");
//int j  = input.nextInt();
System.out.println("Enter the value of n: ");
n = input.nextBigInteger();
//System.out.println("Enter the ciphertext: ");        
	ExecutorService executor = Executors.newFixedThreadPool(2);
             long  a = System.currentTimeMillis();
             for(int i=0;i<2;i++)
             	executor.submit(new Decrypt(i));
             executor.shutdown();

             try {
             	executor.awaitTermination(1, TimeUnit.DAYS);
             } catch (InterruptedException e) {
             	// TODO Auto-generated catch block
             	e.printStackTrace();
             }
             String f = g+v;         
     try(BufferedWriter br2 = new BufferedWriter(new FileWriter(file3))){
            	 br2.write(f);
            	 }
            	 catch(IOException e){
          	 	System.out.println("Unable to read file "+file3.toString());
            	 }		



//System.out.println(f);
long  b = System.currentTimeMillis();
System.out.println("Total time: "+(b-a)+" ms");


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
	@Override
	public void run() {
		if(id==0)
		for(int i=0;i<data.length/2;i++){
            			
			long we = data[i];
			long yu = (we>>2)^arr5[i];
			BigInteger a = new BigInteger(""+yu);
			
				
				char b = printerDecryptAlgo(a,arr1,id);
			g+=b;
			}
		if(id==1)
		for(int i=data.length/2;i<data.length;i++){
			
			long we = data[i];
			long yu = (we>>2)^arr5[i];
			BigInteger a = new BigInteger(""+yu);
			
				
				char c = printerDecryptAlgo(a,arr1,id);
			v+=c;
			}


		}
	public static char printerDecryptAlgo(BigInteger x,int[] arr,int j)
	{
		if(j==1){
	//t=data.length/2;
		BigInteger y = m;
		BigInteger z = n;
		
	BigInteger bigB_plainVal = x.modPow(y,z);
		
	long plainVal = 	bigB_plainVal.longValue();
	long plainVal1 = (plainVal>>1)^2048;
	

	//	System.out.print((char)plainVal1);
		d++;
		return (char)plainVal1;
		}
		else{
			
		BigInteger y = m;
		BigInteger z = n;
		
	BigInteger bigB_plainVal = x.modPow(y,z);
		
	long plainVal = 	bigB_plainVal.longValue();
	long plainVal1 = (plainVal>>1)^2048;
	

	//	System.out.print((char)plainVal1);
		t++;
		return (char)plainVal1;
		}
		}

	
	}
	
	
	

