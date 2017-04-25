package day14.basics;

public class TicTacToe {

	public static void main(String[] args) {
GameBoard myGame = new GameBoard();

int counter=1;
while(myGame.gameActive() && counter<11)
{
	if(counter==10)
	{
	System.out.print("\nstale mate!\n");
     break;
	}
	if(counter%2==0)
	myGame.askPlayer('O');
else
	myGame.askPlayer('X');
counter++;
System.out.println("\n");
myGame.displayBoard();
myGame.checkForWinner();

	
}
	}

}
