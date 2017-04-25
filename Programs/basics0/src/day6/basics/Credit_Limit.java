package day6.basics;
import java.util.Scanner;
public class Credit_Limit {
	
	
	
	 
	private int accountNumber;
	private int balBeginning;
	private int total;
	private int credits;
	private int newBal;
	private double allowedCredit;
	Scanner input = new Scanner(System.in);
	public void displayInformation()
	{
	System.out.println("enter the account number");
	accountNumber=input.nextInt();
	System.out.println("enter balance at the beginning");
	balBeginning=input.nextInt();
	System.out.println("enter the total of all items");
	total=input.nextInt();
	System.out.println("enter the total of all credits");
	credits=input.nextInt();
	System.out.println("enter the allowed credit limit");
	allowedCredit=input.nextInt();
	}
	public void calc()
	{
		newBal=balBeginning+total-credits;
		System.out.printf("new balance is: %d\n",newBal);
		if(newBal<allowedCredit)
			System.out.println("allowed credit limit exceeded");
	}

	}
