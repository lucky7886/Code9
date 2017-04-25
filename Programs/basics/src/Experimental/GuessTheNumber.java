package Experimental;
import java.util.Random;
import java.io.*;
public class GuessTheNumber {

	public static void main(String[] args)throws Exception {
Random r = new Random();
int guess=0;
BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
int x=0;
int c = 1;
while(c==1)
{
	guess=0;
	int z = 1 + r.nextInt(1000);
System.out.println("Guess a number between 1 - 1000");

do
	
{
	
	x = Integer.parseInt(m.readLine());
if(x==z){
	System.out.println("Congratulations. You guessed the number!");
	System.out.printf("You took %d guesses.",guess);
	System.out.println("Do you wanna play again? Press 1 for yes.");
	c = Integer.parseInt(m.readLine());
}
else
{
if(x>z){
	System.out.println("Too high. Try again.");
guess++;
}
	if(x<z){
	System.out.println("Too low. Try again.");
guess++;
	}
}
	
	
}
while(x!=z);
}		
		
		
	}

}
