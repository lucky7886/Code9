import java.util.Random;
import java.util.Scanner;

public class AccountProject {

	int balance;
	int id;

	public AccountProject(int balance) {
		Random r = new Random();
		this.balance = balance;
		id = 100000000 + r.nextInt(999999999);
	}

	public static void main(String[] args) {
		int count = 0;
		System.out.println("Do you wanna open account?, Press 1 to continue, press any other number to discontinue");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		if (input == 1) {
			AccountProject account1 = new AccountProject(0);
			while (count != -1) {
				System.out.println("\nwelcome!!!, your account id is:\n" + account1.id);
				System.out.println("do you wanna perform transaction, Press 1 to deposit, press 2 to withdraw");
				input = s.nextInt();
				if (input == 1) {
					System.out.println("enter amount");
					input = s.nextInt();
					if (input > 0)
						account1.addValue(input);
					else
						System.out.println("please enter the correct amount");
				}
				if (input == 2) {
					System.out.println("enter amount");
					input = s.nextInt();
					if (input <= account1.balance)
						account1.subtractValue(input);
					else
						System.out.println("not sufficient fund");
				}
			}
		}
		else{
			System.out.println("operation declined");
		}

	}

	public void addValue(int val) {
		balance=balance+val;
		System.out.println("your balance: \n\n"+balance);
	}

	public void subtractValue(int val) {
		balance=balance-val;
		System.out.println("your balance: \n\n"+balance);
	}

}
