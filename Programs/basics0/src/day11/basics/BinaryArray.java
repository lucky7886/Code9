package day11.basics;
import java.util.Arrays;
import java.util.Random;
public class BinaryArray {

	private int[] data;
	private static final Random generator = new Random();
	
	
	

public BinaryArray(int size)
{
	data = new int[size];
for(int i=0;i<size;i++)
	data[i]=10+generator.nextInt(90);
Arrays.sort(data);
}

public int binarySearch(int searchElement)
{
int high=data.length-1;
int low=0;
int middle=(low+high+1)/2;
int location=-1;
do
{
if(searchElement==data[middle])
	location=middle;
else if(searchElement<data[middle])

high=middle-1;	
else
low=middle+1;
middle=(high+low)/2;
}
while(low<=high && location==-1);

return location;
}

}


