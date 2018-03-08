
public class Staff extends Person{

	int YoJ;
	String designation;
	int salary;
	String course;
	
	
	public Staff(int YoJ, String designation, int salary, String course, int ID, String name,String address ){
		super(ID,name,address);
		this.YoJ=YoJ;
		this.designation=designation;
		this.salary=salary;
		this.course=course;
	}
	
}
