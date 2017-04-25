package day15.basics;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class GameBoard {
	private char[][] gameBoard;
	private boolean gameOnGoing = true;
	public GameBoard()
	{
		gameBoard = new char[3][3];
		for(int row=0;row<gameBoard.length;row++)
			Arrays.fill(gameBoard[row],' ');
		
	}
	public boolean gameActive()
	{
		return gameOnGoing;
		
	}
	public void askPlayer(char player)
	{
		Scanner keyboard = new Scanner(System.in);
	int row,col;
		do
		{
			System.out.printf("Player %s please enter a row (1-3): ",player);
			row=keyboard.nextInt();
			System.out.printf("Player %s please enter a column (1-3): ",player);
            col = keyboard.nextInt(); 		
		}
		while(notValid(row,col));
		makeMove(player,row-1,col-1);
		}
	
	public boolean notValid(int row, int col)
	{
		if(row>3 || row<1 || col>3 || col<1 || !isEmpty(row,col))
			return true;
		
		return false;
	}
	public boolean isEmpty(int row, int col)
	{
		if(gameBoard[row-1][col-1]==' ')
			return true;
		else
		{
			System.out.println("that position is taken");
		    return false;
		}
	}
	public void askComputer(char player,int counter)
	{
		boolean q=true;
		boolean w = true;
		char opp = 'X';
		int c=1;
		while(q)
		{
			if(c==1)
			{
		for(int row=0;row<gameBoard.length;row++)
		{
			if(gameBoard[row][0]==gameBoard[row][1] && gameBoard[row][0]==player)
			{
				if(gameBoard[row][2]==' ')
				{		
				gameBoard[row][2]=player;
				c++;
				q=false;
				break;
				}
			}
			}
			}
			if(c==1)
			{
		for(int row=0;row<gameBoard.length;row++)
		{
			if(gameBoard[row][0]==gameBoard[row][2] && gameBoard[row][0]==player)
			{
				if(gameBoard[row][1]==' ')
				{
				gameBoard[row][1]=player;
				c++;
				q=false;
				break;
				
			}
			}
			}
			}
			if(c==1)
			{
		for(int row=0;row<gameBoard.length;row++)
		{
			if(gameBoard[row][1]==gameBoard[row][2] && gameBoard[row][1]==player)
			{
				if(gameBoard[row][0]==' ')
				{
				gameBoard[row][0]=player;
				c++;
				q=false;
				break;
				}
			}
			}
			}
			if(c==1)
			{
		for(int col=0;col<gameBoard.length;col++)
		{
			if(gameBoard[0][col]==gameBoard[1][col] && gameBoard[0][col]==player)
			{
				if(gameBoard[2][col]==' ')
				{
				gameBoard[2][col]=player;
				c++;
				q=false;
				break;
				}
			}
			}
			}
			if(c==1)
			{
		for(int col=0;col<gameBoard.length;col++)
		{
			if(gameBoard[0][col]==gameBoard[2][col] && gameBoard[0][col]==player)
			{
			if(gameBoard[1][col]==' ')
			{
		      gameBoard[1][col]=player;
		      c++;
		      q=false;
		      break;
			}
			}
			}
			}
			if(c==1)
			{
		for(int col=0;col<gameBoard.length;col++)
		{
			if(gameBoard[1][col]==gameBoard[2][col] && gameBoard[1][col]==player)
			{
				if(gameBoard[0][col]==' ')
				{
				gameBoard[0][col]=player;
				c++;
				q=false;
				break;
				}
			}
			}
			}
		if(gameBoard[0][0]==gameBoard[1][1] && gameBoard[0][0]==player)
		{
              if(gameBoard[2][2]==' ')
              {
			gameBoard[2][2]=player;
		
			break;
		}
              }
			if(gameBoard[0][0]==gameBoard[2][2] && gameBoard[0][0]==player)
			{
				if(gameBoard[1][1]==' ')
				{
				gameBoard[1][1]=player;
		break;
				}
			}
			if(gameBoard[1][1]==gameBoard[2][2] && gameBoard[1][1]==player)
			{
				if(gameBoard[0][0]==' ')
				{
				gameBoard[0][0]=player;
			break;
				}
				}
		if(gameBoard[0][2]==gameBoard[1][1] && gameBoard[0][2]==player)
		{
			if(gameBoard[2][0]==' ')
			{
			gameBoard[2][0]=player;
		break;
		}
			}
		if(gameBoard[0][2]==gameBoard[2][0] && gameBoard[0][2]==player)
			
		{	
			if(gameBoard[1][1]==' ')
			{
			gameBoard[1][1]=player;
		break;
		}
			}
		if(gameBoard[1][1]==gameBoard[2][0] && gameBoard[1][1]==player)
		{
			if(gameBoard[0][2]==' ')
			{
			gameBoard[0][2]=player;
	break;
		}
		}
		if(c==1)
		{
			for(int row=0;row<gameBoard.length;row++)
			{
				if(gameBoard[row][0]==gameBoard[row][1] && gameBoard[row][0]==opp)
			{
				if(gameBoard[row][2]==' ')
				{
				gameBoard[row][2]=player;
				c++;
				q=false;
				break;
			}
				}
		}
		}
		if(c==1)
		{
		for(int row=0;row<gameBoard.length;row++)
		{
			if(gameBoard[row][0]==gameBoard[row][2] && gameBoard[row][0]==opp)
			{
				if(gameBoard[row][1]==' ')
				{
				gameBoard[row][1]=player;
				c++;
				q=false;
				break;
			}
				}

		}
		}
		if(c==1)
		{
		for(int row=0;row<gameBoard.length;row++)
		{
			if(gameBoard[row][1]==gameBoard[row][2] && gameBoard[row][1]==opp)
			{
				if(gameBoard[row][0]==' ')
				{
				gameBoard[row][0]=player;
				c++;
				q=false;
				break;
			}
				}
		}
		}
		if(c==1)
		{
		for(int col=0;col<gameBoard.length;col++)
		{
			if(gameBoard[0][col]==gameBoard[1][col] && gameBoard[0][col]==opp)
			{
				if(gameBoard[2][col]==' ')
				
				{
					gameBoard[2][col]=player;
					c++;
					q=false;
					break;
			}
				}
		}
		}
		if(c==1)
		{
		for(int col=0;col<gameBoard.length;col++)
		{
			if(gameBoard[0][col]==gameBoard[2][col] && gameBoard[0][col]==opp)
			{
				if(gameBoard[1][col]==' ')
				{
				gameBoard[1][col]=player;
				c++;
				q=false;
				break;
			}
				}
		}
		}
		if(c==1)
		{
			
			for(int col=0;col<gameBoard.length;col++)
			{
				if(gameBoard[1][col]==gameBoard[2][col] && gameBoard[1][col]==opp)
			{
				if(gameBoard[0][col]==' ')
				{
				
				gameBoard[0][col]=player;
				c++;
				q=false;
				break;
			}
				}
		}
		}
		if(gameBoard[0][0]==gameBoard[1][1] && gameBoard[0][0]==opp && c==1)
		{
			if(gameBoard[2][2]==' ')
			{
			gameBoard[2][2]=player;
		break;
		}
		}
		if(gameBoard[0][0]==gameBoard[2][2] && gameBoard[0][0]==opp && c==1)
		{
			if(gameBoard[1][1]==' ')
			{
			gameBoard[1][1]=player;
		break;
		}
			}
		if(gameBoard[1][1]==gameBoard[2][2] && gameBoard[1][1]==opp && c==1)
		{
			if(gameBoard[0][0]==' ')
			{
			gameBoard[0][0]=player;
		break;
		}
		}
		if(gameBoard[0][2]==gameBoard[1][1] && gameBoard[0][2]==opp && c==1)
			{
			if(gameBoard[2][0]==' ')
			{
			gameBoard[2][0]=player;
			break;
			}
			}
		if(gameBoard[0][2]==gameBoard[2][0] && gameBoard[0][2]==opp && c==1)
		{
			if(gameBoard[1][1]==' ')
			{
			gameBoard[1][1]=player;
		break;
		}
			}
		if(gameBoard[1][1]==gameBoard[2][0] && gameBoard[1][1]==opp && c==1)
		{
			if(gameBoard[0][2]==' ')
			{
			gameBoard[0][2]=player;
		break;
		}
		}
		if(counter==1 && gameBoard[0][2]==' ')
		{
			
			
			gameBoard[0][2]=player;
		break;
		
		}
		if(counter==3 && gameBoard[0][0]==' ' && gameBoard[1][0]==' ' && 
				gameBoard[0][1]==' ' && c==1)
		{
			
			
			gameBoard[0][0]=player;
		break;
		
		}
		if(counter==3 && gameBoard[2][2]==' ' && gameBoard[1][2]==' '  &&
				gameBoard[2][1]==' ' && c==1)
		{
			
			
			gameBoard[2][2]=player;
		break;
		
		}
		if(counter==5 && gameBoard[2][0]==' ' && c==1)
		{
			
			
			gameBoard[2][0]=player;
		break;
		
		}
		if(counter==5 && gameBoard[2][2]==' ' && c==1)
		{
			
			
			gameBoard[2][2]=player;
		break;
		
		}
			Random R = new Random();
		while(w && c==1)
		{
		int a = R.nextInt(3);
		int b = R.nextInt(3);
		if(gameBoard[a][b]==' ')
		{
			gameBoard[a][b]=player;
			q=false;
			break;
		}
		}
		}
	}
	
	public boolean checkForWinner()
	{
		for(int row=0;row<gameBoard.length;row++)
			if(gameBoard[row][0]==gameBoard[row][1] && 
			gameBoard[row][1] == gameBoard[row][2] && gameBoard[row][0] != ' ' )
			{
				System.out.print("the winner is " + gameBoard[row][0]);
				gameOnGoing=false;
			
			}
		for(int col=0;col<gameBoard.length;col++)
			if(gameBoard[0][col]==gameBoard[1][col] && 
			gameBoard[1][col] == gameBoard[2][col] && gameBoard[0][col] != ' ' )
			{
				System.out.print("the winner is " + gameBoard[0][col]);
				gameOnGoing=false;
			
			}
		if(gameBoard[0][0] == gameBoard[1][1] && 
				gameBoard[1][1]==gameBoard[2][2] && gameBoard[1][1]!=' ')
		{
			System.out.print("the winner is " + gameBoard[1][1]);
			gameOnGoing=false;
			
		}
		if(gameBoard[0][2] == gameBoard[1][1] && 
				gameBoard[1][1]==gameBoard[2][0] && gameBoard[1][1]!=' ')
		{
			System.out.print("the winner is " + gameBoard[1][1]);
			gameOnGoing=false;
			
		}
		return false;
	}
	public void displayBoard()
	{
		for(int row=0; row<gameBoard.length;row++)
		{
			for(int col=0;col<gameBoard[row].length;col++)
			{
				System.out.print("\t"+gameBoard[row][col]);
		if(col==0 || col==1)
			System.out.print("|");
			}
			if(row==0 || row==1)
		System.out.print("\n---------------------------\n");
		
	}
		System.out.println();
		System.out.println();
		System.out.println();
	}
	public boolean makeMove(char player, int row, int col)
	{
		if(row>=0 && row<=2 && col<=2 && col>=0)
		{
		if(gameBoard[row][col] != ' ')
			return false;
		else
		{
			gameBoard[row][col]=player;
			return true;
		}
	}
		else
		return false;
		}
}
