
package elgamal;

//mi1 = k.divide(ci1);
//System.out.println(mi1);
//System.out.printf("The first pair is (%d,%d)",mi1,ni1);
//k1 = mi1.multiply(ci1).add(ni1);
//System.out.println("\n"+k1);
//bi4 = bi3.pow(12127);
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;
public class abc {
public static void main(String[] args){
	Scanner input =  new Scanner(System.in);
	 
	Random r =new Random();
	int num = Integer.parseInt("1111111111111111",2);
	System.out.println(num);
	BigInteger ai1,bi1,k,ci1,mi1,ni1,k1;
	int a = 17;
	int b = 13;
	int c = a^b;
	bi1 = new BigInteger("10000");
	
	boolean v;
	while(true){
	ai1 = new BigInteger(16,r);
	v = ai1.isProbablePrime(1);
	if(ai1.compareTo(bi1)==1){
	if(v)
	{
	break;	
	}	
	}	
	}	
	while(true){
		ci1 = new BigInteger(16,r);
		v = ci1.isProbablePrime(1);
		if(ci1.compareTo(bi1)==1){
		if(v)
		{
		break;	
		}	
		
		}
		}	
	while(true){
		mi1 = new BigInteger(16,r);
		v = mi1.isProbablePrime(1);
		if(mi1.compareTo(bi1)==1){
		if(v)
		{
		break;	
		}	
		}
		}	
	System.out.printf("\nThe first key is %d",ai1);
	System.out.printf("\nThe second key is %d",ci1);
	System.out.printf("\nThe third key is %d",mi1);
	
	
	
}
}