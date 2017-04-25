
public class Sudoku {
	static int count=0;
 static int N = 9;

 static int grid[][] = { 
   { 0, 0, 1, 5, 0, 3, 0, 8, 6 }, 
   { 8, 0, 2, 0, 0, 1, 0, 0, 0 }, 
   { 9, 5, 0, 0, 0, 0, 0, 0, 0 },
   { 0, 4, 0, 0, 0, 5, 0, 1, 8 }, 
   { 0, 0, 0, 0, 8, 0, 0, 0, 0 }, 
   { 1, 2, 0, 6, 0, 0, 0, 4, 0 },
   { 0, 0, 0, 0, 0, 0, 0, 5, 7 }, 
   { 0, 0, 0, 9, 0, 0, 3, 0, 2 }, 
   { 2, 0, 0, 8, 0, 6, 1, 0, 0 } };

 static class Cell {

  int row, col;

  public Cell(int row, int col) {
   super();
   this.row = row;
   this.col = col;
  }

  @Override
  public String toString() {
   return "Cell [row=" + row + ", col=" + col + "]";
  }
 };

 static boolean isValid(Cell cell, int value) {

  if (grid[cell.row][cell.col] != 0) {
   throw new RuntimeException("Cannot call for cell which already has a value");
  }

  for (int c = 0; c < 9; c++) {
   if (grid[cell.row][c] == value)
    return false;
  }

  for (int r = 0; r < 9; r++) {
   if (grid[r][cell.col] == value)
    return false;
  }

  int x1 = 3 * (cell.row / 3);
  int y1 = 3 * (cell.col / 3);
  int x2 = x1 + 2;
  int y2 = y1 + 2;

  for (int x = x1; x <= x2; x++)
   for (int y = y1; y <= y2; y++)
    if (grid[x][y] == value)
     return false;

  return true;
 }

 static Cell getNextCell(Cell cur) {

  int row = cur.row;
  int col = cur.col;

  col++;

  if (col > 8) {
   col = 0;
   row++;
  }
  if (row > 8)
   return null;
  Cell next = new Cell(row, col);
  return next;
 }

 static boolean solve(Cell cur) {
  if (cur == null)
   return true;
  if (grid[cur.row][cur.col] != 0) {

   return solve(getNextCell(cur));
  }

  for (int i = 1; i <= 9; i++) {
	  
   boolean valid = isValid(cur, i);

   if (!valid)
    continue;

   grid[cur.row][cur.col] = i;

   boolean solved = solve(getNextCell(cur));

   if (solved){
    return true;
   }
   else
   
    grid[cur.row][cur.col] = 0;
  
  }

  return false;
 }

 public static void main(String[] args) {
  boolean solved = solve(new Cell(0, 0));
  if (!solved) {
   System.out.println("SUDOKU cannot be solved.");
   return;
  }
  System.out.println("SOLUTION\n");
  printGrid(grid);
 }

 static void printGrid(int grid[][]) {
  for (int row = 0; row < N; row++) {
   for (int col = 0; col < N; col++)
    System.out.print(grid[row][col] + "         ");
   System.out.println("\n");
  }
 }
}