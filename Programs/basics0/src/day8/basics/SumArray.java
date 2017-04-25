package day8.basics;

public class SumArray {

	public static void main(String[] args) {
int[] array = {10,20,30,40,50};
int total=0;
for(int counter=0;counter<array.length;counter++)
	total+=array[counter];

	System.out.printf("%s%8s\n","Index","Value");
	for(int counter=0;counter<array.length;counter++)
		System.out.printf("%5d%8d\n",counter,array[counter]);
	System.out.printf("Sum of array's elements is: %d",total);
	}

}
