package experimental;

import java.util.Random;
import java.util.Scanner;

public class demo22 {
//hhh player number is 100
//	thh player number is 200	
	public static void main(String[] args) {
		char insert=' ';
		String computerChoice="";
		Scanner input = new Scanner(System.in);
		
		String outcomes = "";
		int numOfWinsForUser=0;
		int numOfWinsForComputer=0;
		Random r = new Random();
		int tossedCoin;
		String answer="";
		String result="";
		int count=0;
		try{
		do{
			computerChoice="";
			System.out.println("Enter your choice please.");
			String c1 = input.nextLine();
			char[] characters = new char[3];
			for(int i=0;i<characters.length;i++)
				characters[i]=c1.charAt(i);
			if(characters[1]=='h')
				insert = 't';
			else if(characters[1]=='t')
				insert='h';
			for(int i=characters.length-1;i>0;i--){
			
				characters[i]=characters[i-1];
				if(i==1)
					characters[i-1]=insert;
			}
			for(int i=0;i<characters.length;i++){
				computerChoice+=characters[i];
			}
			System.out.printf("\nThe computer has taken %s\n",computerChoice);
			if(count==0){
			System.out.println("Do you wanna start? yes/no");
			answer=input.nextLine();
		}
		if(answer.contains("no"))
			break;			
			outcomes="";
		while (!outcomes.contains(c1) && !outcomes.contains(computerChoice)) {
			tossedCoin = r.nextInt(2);
			if (tossedCoin == 0){
				outcomes += "h";
				result="heads(h)";
			System.out.printf("\nThe result of toss is %s\n", result);
			if(!outcomes.contains(c1) && !outcomes.contains(computerChoice))
			input.nextLine();
			}
			
			else if (tossedCoin == 1){
				outcomes += "t";
				result="tails(t)";
				System.out.printf("\nThe result of toss is %s\n", result);
				if(!outcomes.contains(c1) && !outcomes.contains(computerChoice))
					input.nextLine();
			}
		}
		if(outcomes.contains(c1)){
			numOfWinsForUser++;
		System.out.println("user has won!");
		}
		else if(outcomes.contains(computerChoice)){
			numOfWinsForComputer++;
			System.out.println("computer has won!");
		}
		count++;
		
			System.out.println("Do you wanna play again? yes/no");
		    answer=input.nextLine();
		
		}
		while(answer.contains("yes"));
		}
		catch(Exception e){
		System.out.printf("\nThe number of times %s won is %d","user",numOfWinsForUser);
		System.out.printf("\nThe number of times %s won is %d","computer",numOfWinsForComputer);
	if(count>=5 && numOfWinsForUser>numOfWinsForComputer)
		System.out.println("You have won bumper prize!!!");
	//System.out.println(e);
	}
	}
}
