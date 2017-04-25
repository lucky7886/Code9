package demo21;

public enum Book {

	JHTP("JAVA HOW TO PROGRAM","2012"),
	CHTP("C HOW TO PROGRAM","2007");
	
	
	private final String title;
	private final String copyrightYear;
	Book(String bookTitle, String year){
		title = bookTitle;
		copyrightYear = year;
	}
	public String getTitle(){
		return title;
	}
	public String getCopyrightYear(){
		return copyrightYear;
	}
	
	
	
}
