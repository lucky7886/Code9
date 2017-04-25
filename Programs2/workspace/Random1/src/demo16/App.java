package demo16;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		int keySize=0;
		int cipherText=0;
		int overHead;
		System.out.println("enter the keysize");
		 keySize = input.nextInt();
		  cipherText=2*keySize;
		  overHead=2*cipherText+keySize;
		System.out.println();
		System.out.printf("key size: %d, ciphertext: %d\n",keySize,cipherText);
		System.out.printf("\noverhead: %d",overHead);
		int k=0;
		
		for(int i=400;i>=0;i-=25){
			if(i==75){
				System.out.printf("\n\n\n     %s","* * * * * * * * * * * * * * * * * * * * * * *");
		k=1;
			}
				if(i%50==0 && k==0)
			System.out.printf("\n\n\n\n\n%d",i);
				if(i%50==0 && k==1){
					System.out.printf("\n\n%d",i);
		k=0;
				}
				}
		System.out.println();
		System.out.print("    ");
		for(int i=0;i<18;i+=2)
			System.out.printf("%d    ",i);
		System.out.println();
		
		System.out.println("\nx-axis ----> Number of vehicles.");
		System.out.println("\ny-axis ----> Overhead (bytes per vehicle*message)");

		
		System.out.println("Enter the overhead: ");
		int l = input.nextInt();
		k=0;
		int c=0;
		int d=0;
		for(int i=400;i>=0;i-=10){
			if(i==280){
				System.out.printf("\n\n     %s","* * * * * * * * * * * * * * * * * * * * * * *");
			c=1;
			d=1;
			}
			if(i==140 && c!=1){
				System.out.printf("\n     %s","* * * * * * * * * * * * * * * * * * * * * * *");
		k=1;
			}
				if(i%50==0 && k==0 && d==0)
			System.out.printf("\n\n\n\n\n%d",i);
				if(i%50==0 && k==1){
					System.out.printf("\n\n\n\n%d",i);
					k=0;
				}
					if(i%50==0 && d==1 ){
						System.out.printf("\n\n\n%d",i);
		d=0;
				}
				}
		System.out.println();
		System.out.print("    ");
		for(int i=0;i<18;i+=2)
			System.out.printf("%d    ",i);
		System.out.println();
		 }
	}



