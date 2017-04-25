package MathFactory;
import java.io.*;
public class DecToHexOctBin {

	public static void main(String[] args)throws Exception {

BufferedReader m = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a number");
int n = Integer.parseInt(m.readLine());
int c=0;
int d=0;
int b=0;
int[] arr = new int[250];
int[] arr1 = new int[250];
int[] arr2 = new int[250];
int o=n;
int y=n;
int p=n;
while(n!=0)
{
	arr[++c]=n%2;
	n=n/2;
	
	
}
while(o!=0)
{
	arr1[++d]=o%8;
	o=o/8;
	
	
}
while(p!=0)
{
	arr2[++b]=p%16;
	p=p/16;
	
	
}
System.out.printf("Decimal\t\tBinary\n");
System.out.printf("%d\t\t",y);


		for(int i=c;i>0;i--)
			System.out.printf("%d",arr[i]);
		System.out.println();
		System.out.println();
		System.out.printf("Decimal\t\tOctal\n");
		System.out.printf("%d\t\t",y);
		for(int i=d;i>0;i--)
			System.out.printf("%d",arr1[i]);
		System.out.println();
		System.out.println();
		System.out.printf("Decimal\t\tHexadecimal\n");
		System.out.printf("%d\t\t",y);
		for(int i=b;i>0;i--)
		{
			if(arr2[i]<10)
			System.out.printf("%d",arr2[i]);
			else if(arr2[i]==10)
				System.out.printf("A");
			else if(arr2[i]==11)
				System.out.printf("B");
			else if(arr2[i]==12)
				System.out.printf("C");
			else if(arr2[i]==13)
				System.out.printf("D");
			else if(arr2[i]==14)
				System.out.printf("E");
			else if(arr2[i]==15)
				System.out.printf("F");
		}
	}

}
