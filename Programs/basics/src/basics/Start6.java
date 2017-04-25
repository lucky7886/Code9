 package basics;

 class Cat{
	 public String name;
	 private int id;
	 public Cat(String name, int id){
		 this.name = name;
		 this.id = id;
	 }
	 public String toString(){
		/* StringBuilder sb = new StringBuilder();
		 sb.append(id).append(": ").append(name);
			return sb.toString();
		*/

		 //		return id+": "+name;
		
		return String.format("%-4d: %s",id,name);
		}
		 
 }
 
public class Start6 {

	public static void main(String[] args) {

		Object obj = new Object();
	
		Cat frog1 = new Cat("lucy",5);
		
		System.out.println(frog1);
		
	
		
	}

}
