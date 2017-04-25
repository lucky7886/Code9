package Pearl1;

public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date(int d, int m, int y)
	{
		day=d;
		month=m;
		year=y;
		
		System.out.printf("The constructor for this is: %s",this);
	}
	
	
	
	public String toString()
	{
		return String.format("%d/%d/%d",day, month, year);
	}
	
	
	
	}
