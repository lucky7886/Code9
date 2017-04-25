package day12.basics;
import java.util.Random;
import java.util.Scanner;
public class KnightTour {
	private static final Random r = new Random();
	private static int [][] board = new int[8][8];
	private static int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
	private static int[] vertical =   {-1,-2,-2,-1,1,2,2,1};
	private static int currentRow=3;
    private static int currentColumn=4;

	
	public static void main(String[] args) {
		int i=1;
board[3][4]=i;
int d=1;
int c=1;
//Scanner input=new Scanner(System.in);
while(c<=64 && d<3000)
{
		
		System.out.println("enter the move (0-7)");
// int moveNumber = input.nextInt();
	int moveNumber = r.nextInt(8);
if(moveNumber>=0 && moveNumber<=7)
{
	if(currentRow+vertical[moveNumber]<=7 && currentRow+vertical[moveNumber]>=0)
	{
	if(currentColumn+horizontal[moveNumber]<=7 && currentColumn+horizontal[moveNumber]>=0)
	{
		if(board[currentRow+vertical[moveNumber]][currentColumn+horizontal[moveNumber]]==0)
	{
		currentRow+=vertical[moveNumber];
		currentColumn+=horizontal[moveNumber];
		board[currentRow][currentColumn]=++i;
		c++;
		System.out.printf("moves: %d\n",c);
		System.out.printf("current position of the knight is: %d %d\n",currentRow,currentColumn);
	}
		
	else
	{
		System.out.println("Invalid Move due to repetition of position!");
	d++;
	}	
	}
	else
	{
		System.out.println("Invalid move!!");
	d++;
	}
	}
	else
	{
		System.out.println("Invalid move!!");
d++;
	}
}
else
	System.out.println("Invalid move!!");
	}

		
	for(int y=0;y<=7;y++)
	{
		for(int j=0;j<=7;j++)
		
		System.out.printf("%2d   ",board[y][j]);
	System.out.println();
	}
	System.out.printf("\nTotal moves: %d",c);
	}

}
