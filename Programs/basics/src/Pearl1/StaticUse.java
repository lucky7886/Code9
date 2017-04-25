package Pearl1;



public class StaticUse {
	
	private String first;
	private String last;
	private static int members = 0;
	
	public StaticUse(String fn,String ln)
	{
		first =fn;
		last = ln;
		members++;
		
		System.out.printf("new member is: %s %s\nnumber of members: %d\n",first,last,members);
	}
	
	
	

}
