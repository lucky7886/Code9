package day11.basics;
import java.util.Random;
public class SelectionSort {
private int[] data;
private static Random generator = new Random();
public SelectionSort(int index)
{
data = new int[index];
for(int i=0;i<data.length;i++)
	data[i]=10+generator.nextInt(90);
}
public void sortThrough()
{
	System.out.println("UNSORTED ARRAY: ");
	for(int i=0;i<data.length;i++)
	System.out.printf("%d ",data[i]);
	int smallest;
	for(int i=0;i<data.length-1;i++)
	{
		smallest=i;
		for(int index=i+1;index<data.length;index++)
			if(data[index]<data[smallest])
				smallest=index;
		swap(i,smallest);
		
		
		
	}
	print();
}
public void swap(int first, int second)
{
	int temporary;
	temporary=data[first];
	data[first]=data[second];
	data[second]=temporary;
}
public void print()
{
	System.out.println("\n\nSorted array: ");
for(int i=0;i<data.length;i++)
	System.out.printf("%d ",data[i]);
}
}

