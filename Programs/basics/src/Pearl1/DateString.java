package Pearl1;

public class DateString {
private String name;
private Date birthDay;

	public DateString(String n, Date bday)
	
	{
		name = n;
		birthDay=bday;
		
     }
	
	public String toString()
	{
	return String.format("my name and birthday is: %s\n%s",name,birthDay);	
		
	}
	
}
