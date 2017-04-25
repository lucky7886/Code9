package basics;

public class MyFirstClass {

	public static void main(String[] args) {

		int i=0;
		int j=1;
		int sum=0;
		int c=2;
		System.out.println("Fibonacci series!!!");
		System.out.printf("%d ",i);
		System.out.printf("%d ",j);
		while(sum<100)
		{
			
			sum=i+j;
			i=j;
			j=sum;
			c++;
			System.out.printf("%d ",sum);
			
			}
		
		
	}

}
