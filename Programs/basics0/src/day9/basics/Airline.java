package day9.basics;
import java.util.Scanner;
import java.util.Random;
public class Airline {
	static Scanner input = new Scanner(System.in);
	static boolean[] array = new boolean[11];
	public static void main(String[] args) {

		
for(int i=1;i<array.length;i++)
	array[i]=false;
int j=1;
do
{
	j++;
System.out.printf("AVAILABILITY OF SEATS\n");
System.out.printf("%s%15s\n","SEAT","AVAILABILITY");
for(int i=1;i<array.length;i++)
	System.out.printf("%4d%15s\n",i,array[i]);
System.out.println("Please type 1 for First class(1-5) and please type 2 for Economy(6-10)\n");
	int value = input.nextInt();
	if(value==1)
		First_Class();
	else if(value==2)
		Economy();
	else
		System.out.println("Invalid Response");
	if(array[5]==true && array[10]==true)
	{
		System.out.println("ALL SEATS ARE FULL");
        break;
	}
}
while(j<50);
	}
	public static void First_Class()
	{
		int i=1;
		while(i<6)
			{
			
			if(array[i]==false)
			{
				array[i]=true;
			
			System.out.printf("your seat number is: %d in the first class\n",i );
			break;
			}
			i++;	
			}
			if(i==6)
			{
				System.out.println("all seats are full!");
				if (array[10]!=true)
				{	
					System.out.println("do you want a seat in economy? If yes, press 2,otherwise press any other number");
				
		int y=input.nextInt();
		if(y==2)
			Economy();
		else
				System.out.println("next flight leaves in 3 hours");
				}
				else
					System.out.println("next flight leaves in 3 hours");	
			}
		
				
	
}
	public static void Economy()
	{
		int i=6;
		while(i<11)
			{
			
			if(array[i]==false)
			{
				array[i]=true;
			
			System.out.printf("your seat number is: %d in the economy class\n",i );
			break;
			}
			i++;	
			}
			if(i==11)
			{
				System.out.println("all seats are full!");
				if (array[5]!=true)
				{	
					System.out.println("do you want a seat in the first class? If yes, press 1,otherwise press any other number");
				
		int y=input.nextInt();
		if(y==1)
			Economy();else
				System.out.println("next flight leaves in 3 hours");
				}
				else
					System.out.println("next flight leaves in 3 hours");	
			}
		
				
	
}
}