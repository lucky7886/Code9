package day10.basics;
import java.util.*;
public class ArrayList {
Scanner input = new Scanner(System.in);
	int[] array;
	public ArrayList()
	{
		array = new int[10];
	}
	public void array1()
	{
		int a,b,m;
		
		int u=10;
		while(u>0)
		{
		System.out.println("enter the index no. and value");
		
		a=input.nextInt();
		b=input.nextInt();
		insert(a,b);
		u--;
		}
		
			System.out.println("enter the index value of element which is to be removed");
			m=input.nextInt();
			remove(m);
		
		System.out.println("the values in the arraylist are: ");
		System.out.printf("%s%10s\n","INDEX","VALUE");
		for(int o=0;o<array.length;o++)
			System.out.printf("%5d%10d\n",o,array[o]);
		
	}
	public void insert(int z, int x)
	{
		
			if(array[z]==0 || z==9)
							array[z]=x;
		
	
			else
			{
				for(int i=array.length-2;i>=z;i--)
				
					array[i+1]=array[i];
				
				array[z]=x;
			}
	
		}
	public void remove(int c)
	{
		if(c==array.length-1)
			array[c]=0;
		else
		{
			for(int g=c;g<array.length-1;g++)
		
				array[g]=array[g+1];
              array[array.length-1]=0;
		}
		
	}
}
