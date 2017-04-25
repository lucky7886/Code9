package experimental;

import java.util.Random;

public class demo23 {

	public static void main(String[] args) {

		int count=0;
		int count_1=0;
		int count2=0;
		int count5=0;
		Random r = new Random();
		int userChoice;
		int redDice;
		int blackDice; 
		for(int i=0;i<1296;i++){
			redDice = 1+r.nextInt(6);
			blackDice = 1+r.nextInt(6);
			userChoice = 1+r.nextInt(6);
		if(redDice==userChoice && userChoice==blackDice){
			count5++;
			count+=5;
		}
		if(redDice!=userChoice && userChoice!=blackDice){
			count_1++;
			count-=1;
		}
		//if((redDice==userChoice || userChoice==blackDice) && (!(redDice==userChoice && userChoice==blackDice)))
		if((redDice==userChoice || userChoice==blackDice) && (redDice!=blackDice)){
			count2++;
			count+=2;
		}
		}
		System.out.println(count_1+count2+count5);
		System.out.println("Overall amount won/lose is "+count);
		
	}

}
