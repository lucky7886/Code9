package day11.basics;
import java.util.Random;
public class InsertionSort {
private int[] data;
private static Random generator=new Random();
public InsertionSort(int value)
{
	data = new int[value];
	for(int i=0;i<data.length;i++)
		data[i]=10+generator.nextInt(90);
}
public void sortThrough()
{
	System.out.println("Unsorted Array: ");
	for(int i=0;i<data.length;i++)
		System.out.printf("%d ",data[i]);
int insert, moveItem;	
for(int next=1;next<data.length;next++)
{
insert=data[next];
moveItem=next;
while(moveItem>0 && data[moveItem-1]>insert)
{
data[moveItem]=data[moveItem-1];
moveItem--;
}
data[moveItem]=insert;
}

}
public void print()
{
	System.out.println("\nSorted Array: ");
	for(int i=0;i<data.length;i++)
		System.out.printf("%d ",data[i]);
}
}
