package experimental;
class student{
	String name;
	public student(String name){
		this.name=name;
	}
	
	public boolean equals(Object obj){
		String name = this.name;
		student h = (student)obj;
		String name2 = h.name;
		if(name==name2)
			return true;
		else return false;
	}
	
	
}

public class demo9 {

	
	public static void main(String[] args) {

		
		String s1 = new String("Durga");
		String s2 = new String("Durga");
		System.out.println(s1==s2);
		
		String s5="Durga";
		String s6="Durga";
		System.out.println(s5==s6);
		
		student s3 = new student("Durga");
		student s4 = new student("Durga");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		//System.out.println(s3.equals("durga"));
	}

}
