package day11.basics;

public class GradeBookTest {

	public static void main(String[] args) {
		int[][] array = {{40,50,60},{55,44,88},{56,76,86},{99,66,44},{77,69,71}
		,{44,59,68},{78,98,89},{62,68,69},{58,43,39},{54,72,35}};
GradeBook myGradeBook = new GradeBook("CS101\n",array);
myGradeBook.displayMessage();
myGradeBook.processGrades();

	}

}
