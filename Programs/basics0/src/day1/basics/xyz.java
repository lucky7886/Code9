package day1.basics;

    public class xyz {
    	public static void main(String[] args)
    	{
    		
    		xyz s = new xyz();
    		mno a = new mno();
    		xyz z = new mno();
    		a.display();
    	}
	int speed = 50;
     }
	
	class mno extends xyz {
		
		
		
		int speed = 100;
		public void display()
		{
			
			System.out.println(super.speed);
		}
		
	
	
	}


/*public class xyz {
	
	int i;
	String name;
	static
	{
	System.out.println("pqrs");	
	}
public void putValues(int i,String name)
{
	this.i=i;
	this.name=name;
}
	public void display()
	{
		
		System.out.println(i+" "+name);
		
		
	}

	public static void main(String[] args) {
xyz a = new xyz();
a.putValues(123,"ptk");
a.display();
System.out.println(true);


	}
	
	
	

static
{
System.out.println("pqr");	
}

static
	
{
		System.out.println("abc");
		
}
	
}
*/