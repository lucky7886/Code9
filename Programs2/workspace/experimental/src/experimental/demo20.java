package experimental;

import java.util.Random;

public class demo20 {

	public static void main(String[] args) {

		int x, y, z = 0;
		int prize = 5000;
		x = prize;
		int numberOfWinsWhenSwapped=0;	
		int numberOfWinsWithoutSwap=0;
		int choice=0;
		int choice2=0;
		Random r = new Random();
		for(int i=0;i<1000;i++){
		 choice = 1 + r.nextInt(3);
		 //choice2 = choice;
		 choice2 = 1 + r.nextInt(3);
		 if(choice==1){
			int optional = 2+r.nextInt(2);
			if(optional==2)
				choice=3;
			else if(optional==3)
				choice=2;
		}
		else if(choice==2){
			choice=1;
		}
		else if(choice==3){
			choice=1;
		}
		
		if(choice==1)
			numberOfWinsWhenSwapped++;
		
		if(choice2==1)
			numberOfWinsWithoutSwap++;
		
		}
		System.out.println("Number of wins after swapping "+numberOfWinsWhenSwapped);
		System.out.println("Number of wins without swapping "+numberOfWinsWithoutSwap);
		
	}

}
