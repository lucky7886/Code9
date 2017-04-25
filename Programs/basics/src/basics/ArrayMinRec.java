package basics;
import java.util.Random;
public class ArrayMinRec {

	public static void main(String[] args) {
		
		Random r = new Random();
		int[] a = new int[20];
		for(int i=0;i<20;i++)
			a[i]=r.nextInt(100);
		for(int c : a)
			System.out.printf("%d ",c);
		
		int ans = min(a,0);
		System.out.println("\n"+ans);
		
	}
	public static int min(int[] b, int index)
	{
		if(index==b.length-1)
			return b[index];
		int val = min(b,index+1);
		if(val>b[index])
			return b[index];
		else
			return val;
		
		
		
	}

}
