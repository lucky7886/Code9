
public class Student extends Person{

	int year;
	String course;
	int fees;
	
	public Student(int year, String course, int fees, int ID, String name, String address){
		super(ID,name,address);
		this.year=year;
		this.course=course;
		this.fees=fees;
	}
	
	
}
