package Pearl1;

public enum GrapesEnum {

	abc("Hi",10),
	pqr("Hey",20),
	xyz("Hello",30),
	asd("Thanks",40),
	zxc("There",50);
	
	
	private String desc;
	private int num;
	
	GrapesEnum(String text, int val)
	{
		desc=text;
		num=val;
		
	}
	public String getDesc()
	{
		return desc;
	}
	public int getNum()
	{
		return num;
	}
	
}
