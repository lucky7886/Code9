package elgamal;

import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Kdc implements Runnable {

int id;


public Kdc(int id){
	
	this.id = id;
	
	
	}


Random r = new Random();
boolean v;

public void run(){
		BigInteger ai1,bi1,k,ci1,mi1,ni1,k1;
	bi1 = new BigInteger("10000");
	if(id==1){
		System.out.printf("\nThread %d started. Key is being generated.",id);
			while(true){
				
				ai1 = new BigInteger(16,r);
				v = ai1.isProbablePrime(1);
				if(ai1.compareTo(bi1)==1){
				if(v)
				{
					System.out.printf("\nThe key k1 is %d",ai1);
				break;	
				}	
				}	
				
		}
		}
		if(id==2){
			System.out.printf("\nThread %d started. Key is being generated.",id);
			while(true){
				
				ci1 = new BigInteger(16,r);
				v = ci1.isProbablePrime(1);
				if(ci1.compareTo(bi1)==1){
				if(v)
				{
					System.out.printf("\nThe key k2 is %d",ci1);
				break;	
				}	
				
				}
				}	
}
		if(id==3){
			System.out.printf("\nThread %d started. Key is being generated.",id);
			while(true){
				
				mi1 = new BigInteger(16,r);
				v = mi1.isProbablePrime(1);
				if(mi1.compareTo(bi1)==1){
				if(v)
				{
					System.out.printf("\nThe key k3 is %d",mi1);
				break;	
				}	
				}
				}	
		}
}
		public static void main(String[] args){
			
			System.out.println("The three keys for vehicle A are: ");
			ExecutorService executor = Executors.newFixedThreadPool(3);
			for(int i=1;i<4;i++)
				executor.submit(new Kdc(i));
			executor.shutdown();
			try {
				executor.awaitTermination(1, TimeUnit.DAYS);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
		
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	

