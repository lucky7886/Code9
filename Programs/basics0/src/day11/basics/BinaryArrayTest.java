package day11.basics;
import java.util.Scanner;
public class BinaryArrayTest {

	public static void main(String[] args) {
int searchInt;
int position;
Scanner input = new Scanner(System.in);
		BinaryArray b1 = new BinaryArray(20);
		
System.out.print("please enter an integer value (-1 to quit)");
searchInt=input.nextInt();
System.out.println();
while(searchInt!=-1)
{
	position = b1.binarySearch(searchInt);
	if(position==-1)
		System.out.printf("the integer "+searchInt+" was not found.\n");
	else
		System.out.printf("the integer "+searchInt+" was found in position "+position+".\n");

	System.out.print("please enter an integer value (-1 to quit)");
	searchInt=input.nextInt();
	System.out.println();
	


}
}
}