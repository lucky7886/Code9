package demo18;

public class AppTest {

	public static void main(String[] args) {

		int[] gradesArray = {87,68,94,100,83,78,85,91,76,87};
		
		
		App myApp = new App("CS101 Introduction to Java Programming",gradesArray);
		myApp.displayMessage();
		myApp.processGrades();
	}

}
