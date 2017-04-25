package day15.basics;
import java.util.Scanner;

public class TicTacToeAdvanced {

	public static void main(String[] args) {
GameBoard myGame = new GameBoard();
Scanner input = new Scanner(System.in);
int counter=1;
int i=0;
boolean u=true;
while(u)
{
System.out.println("Do you wanna play against a person or the computer");
System.out.println("press 1 if you wanna play against a person, otherwise press 2");
i = input.nextInt();
if(i==1 || i==2)
	u=false;
else
	System.out.println("Invalid number, ENTER THE CHOICE AGAIN");
}
if (i==2)
{
	System.out.println("\nWELCOME\nTHE GAME BEGINS\n");
while(myGame.gameActive() && counter<11)
{
	
	if(counter==10)
	{
	System.out.print("\nIt's a DRAW!\n");
     break;
	}
	if(counter%2==0)
	myGame.askPlayer('X');
else
	myGame.askComputer('O',counter);
counter++;
System.out.println("\n");
myGame.displayBoard();
myGame.checkForWinner();

	
}
}
if(i==1)
{
	System.out.println("\nWELCOME\nTHE GAME BEGINS\n");
while(myGame.gameActive() && counter<11)
{
	
	if(counter==10)
	{
	System.out.print("\nIt's a DRAW!\n");
     break;
	}
	if(counter%2==0)
	myGame.askPlayer('X');
else
	myGame.askPlayer('O');
counter++;
System.out.println("\n");
myGame.displayBoard();
myGame.checkForWinner();

	
}
}
	}

}

