package day1.basics;

public class array1 {
public static void main(String[] args)
{
	

int[] arr = new int[5];
for(int a=0;a<arr.length;a++)
	arr[a]=1;
for(int s : arr)
System.out.printf("%d\n",s);


useArray(arr);


for(int s : arr)
System.out.printf("%d\n",s);




}
	
public static void useArray(int[] abc)
{
	
for(int s =0;s<abc.length;s++)
abc[s]=9;
for(int s : abc)
System.out.printf("%d\n",s);


}
	
	
	
}
