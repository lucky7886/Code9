package day11.basics;
import java.util.Random;
public class LinearSearch {
private int[] data;
private static final Random generator=new Random();
public LinearSearch(int index)
{
data = new int[index];
for(int i=0;i<data.length;i++)
	data[i]=10+generator.nextInt(20);
for(int i=0;i<data.length;i++)
System.out.printf("%d ",data[i]);
}
public int search(int searchVal)
{	
for(int i=0;i<data.length;i++)
	if(data[i]==searchVal)
return i;
return -1;
}

}
