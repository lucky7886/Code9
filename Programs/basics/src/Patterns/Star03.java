package Patterns;
import java.util.Scanner; 
public class Star03 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		System.out.println("enter the number ");
int n = input.nextInt();

for(int i=0;i<n;i++)
{
	
	for(int j=0;j<=i;j++)
		
		
		if(i%2==0)
		System.out.print("* ");
		
		
	
	
	System.out.println();
}
	for(int i=n;i<n+n+1;i++)
	{
		
		for(int j=n+n-2;j>=i;j--)
			
			
			if(i%2==0)
			System.out.print("* ");
			
			
		
		
		System.out.println();
	}



















/*		
for(int b=0;b<n-1;b++){
             System.out.print(" ");
             for(int a=0;a<b+1;a++){
                 System.out.print(" ");
             }
             for(int a=0;a<2*(n-b-1)-1;a++){
                 System.out.print("*");
             }
             System.out.print("\n");
         }*/


	}

}
