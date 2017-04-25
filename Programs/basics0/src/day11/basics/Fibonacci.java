package day11.basics;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter the number of terms in the series: ");
int term = input.nextInt();
int f1,f2=0,f3=1;
for(int a=0;a<term;a++)
{
	System.out.printf("%d, ",f3);
f1=f2;
f2=f3;
f3=f1+f2;
}
	}

}
