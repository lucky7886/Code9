package day11.basics;
import java.util.Scanner;
public class LinearSearchTest {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
LinearSearch L1 = new LinearSearch(15);
System.out.println("\nEnter the number to be searched or -1 to exit");
int num = input.nextInt();

while(num!=-1)
{
int position = L1.search(num);
if(position==-1)
	System.out.println("number not found");
else
	System.out.printf("number %d found at index %d\n ",num,position);
System.out.println("Enter the number to be searched or -1 to exit");
num=input.nextInt();

}

	}

}
