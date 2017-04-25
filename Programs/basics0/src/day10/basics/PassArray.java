package day10.basics;

public class PassArray {

	public static void main(String[] args) {
int [] array = {1,2,3,4,5,6};
System.out.println("values of the array are:");
for(int number:array)
	System.out.printf("%d\t",number);
modifyArray(array);
System.out.println();
System.out.println("values of the array after modification are:");
for(int number:array)
	System.out.printf("%d\t",number);
System.out.println();
modifyElement(array[2]);
System.out.printf("values of the array element after modification is: %d",array[2]);

	}
	public static void modifyArray(int [] b)
	{
		for(int i=0;i<b.length;i++)
			b[i]*=2;
		
	}
	public static void modifyElement(int b)
	{
		b=b*2;
		System.out.println(b);
		
	}

}
