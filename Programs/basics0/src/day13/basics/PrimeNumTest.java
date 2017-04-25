package day13.basics;
import java.util.Scanner;
public class PrimeNumTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number to be tested");
int z= input.nextInt();
PrimeNum P1 = new PrimeNum(z);
System.out.print("Prime factors of the number are ");
P1.func();

	}

}
