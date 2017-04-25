package experimental;

import java.util.Random;

public class demo21 {

	public static void main(String[] args) {

		int choice=0;
		int door_1=0;
		int door_2=0;
		int door_3=0;
		Random generator = new Random();
		int winsWhenSwitched=0;
		int winsWithoutSwitch=0;
	for(int i=0;i<20000;i++){	
		
		int prize = 1+generator.nextInt(3);
		
		switch(prize){
		case 1:door_1=prize;
		break;
		case 2:door_2=prize;
		break;
		case 3:door_3=prize;
		break;
		}
		
		int userChoice = 1+generator.nextInt(3);
		choice=userChoice;
		if(door_1==prize){
			
			if(userChoice==1)
			{
				int randomDoor = generator.nextInt(2);
				if(randomDoor==0){
				//	System.out.println("Door_2 is empty");
				userChoice=3;
				}
				if(randomDoor==1){
				//	System.out.println("Door_3 is empty");
					userChoice=2;
				}
			}
			else	if(userChoice==2){
				//System.out.println("Door_3 is empty");
				userChoice=1;
			}
			else	if(userChoice==3){
				//System.out.println("Door_2 is empty");
				userChoice=1;
			}
			
		}
	    if(door_2==prize){
	    	if(userChoice==2)
			{
				int randomDoor = generator.nextInt(2);
				if(randomDoor==0){
				//	System.out.println("Door_1 is empty");
				userChoice=3;
				}
				if(randomDoor==1){
					//System.out.println("Door_3 is empty");
					userChoice=1;
				}
			}
	    	else	if(userChoice==1){
				//System.out.println("Door_3 is empty");
				userChoice=2;
			}
	    	else	if(userChoice==3){
				//System.out.println("Door_1 is empty");
				userChoice=2;
			}
			
	    }
	    
	    if(door_3==prize){
	    	if(userChoice==3)
			{
				int randomDoor = generator.nextInt(2);
				if(randomDoor==0){
					//System.out.println("Door_1 is empty");
				userChoice=2;
				}
				if(randomDoor==1){
					//System.out.println("Door_2 is empty");
					userChoice=1;
				}
			}
	    	else	if(userChoice==1){
				//System.out.println("Door_2 is empty");
				userChoice=3;
			}
	    	else	if(userChoice==2){
			//	System.out.println("Door_1 is empty");
				userChoice=3;
			}
			
	    }
	    if(userChoice==prize)
	    	winsWhenSwitched++;
	    if(choice==prize)
	    	winsWithoutSwitch++;
	}
	    System.out.printf("\nNumber of wins with switching: %d",winsWhenSwitched);
	    System.out.printf("\nNumber of wins without switching: %d",winsWithoutSwitch);
	}

}

