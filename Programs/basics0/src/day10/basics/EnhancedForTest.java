package day10.basics;

public class EnhancedForTest {

	public static void main(String[] args) {
int[] array = {1,2,3,4,5,12,13,14,15};
int total=0;
for(int number:array)
	total+=number;
System.out.printf("the sum of the numbers in the array is : %d",total);
	}

}
