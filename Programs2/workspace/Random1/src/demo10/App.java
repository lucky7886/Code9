package demo10;

public class App {

	public static void main(String[] args) {


		int[][] grid = {{1,2,3},
				{4,5},
				{6,7,8,9},
				{5}};
		{
	 int a = grid[2][2];
			
	 System.out.println(a);
		}
		int[] secondElement = grid[3];
		for(int a : secondElement)
		System.out.printf("%d ",a);
		
		String[][] texts = new String[3][];
		texts[2]=new String[3];
		texts[2][2] = "hi there";
		System.out.println(texts[2][2]);
		
		for(int[] a : grid){
			for(int b : a){
				System.out.printf("%d ",b);
			}
			System.out.println();
		}
		
		for(int row=0; row<grid.length;row++){
			for(int col=0; col<grid[row].length;col++){
				System.out.printf("%d ",grid[row][col]);
		}
			System.out.println();
	}
	}
}
