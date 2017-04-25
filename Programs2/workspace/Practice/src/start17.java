import java.util.Random;
import java.util.Scanner;

public class start17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the matrix");
		int size = input.nextInt();
		int[][] array = new int[size][size];
		
		Random r = new Random();
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				array[i][j]=r.nextInt(15);
			}
		}		
			for(int i=0;i<array.length;i++){
				for(int j=0;j<array[i].length;j++){
					System.out.print(array[i][j]+"   ");
				}
				System.out.println();
			
		}
		
		int sumL = 0;
		int sumR = 0;
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
			
				if(i==j){
					sumL+=array[i][j];
				}
				if(i==0 && j==size-1){
					sumR+=array[i][j];
				}
				if(j==0 && i==size-1){
					sumR+=array[i][j];
				}
				
			}
			
		
	}
	
System.out.println("Difference between diagonals is: "+Math.abs((sumR-sumL)));
	}
	}
