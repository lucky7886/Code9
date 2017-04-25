package Pearl1;

public class MultiArr {

	public static void main(String[] args) {

		int[][] firstArray = {{1,2},{5,6,7},{9}};
		
		int[][] secondArray = {{23,57},{124,89}};
		
		display(firstArray);
		display(secondArray);
		
	}
	public static void display(int[][] ab)
	{
		for(int row=0;row<ab.length;row++)
		{
			for(int col=0;col<ab[row].length;col++)
			
			System.out.print(ab[row][col]+"\t");
			
			
		System.out.println();
	}
	}
}
