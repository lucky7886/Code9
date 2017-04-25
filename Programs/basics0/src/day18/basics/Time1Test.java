package day18.basics;

public class Time1Test {

	public static void main(String[] args) {
Time1 time = new Time1();
System.out.printf("the initial universal time is: ");
	System.out.println(time.toUniversalString());
	System.out.printf("the initial standard time is: ");
	System.out.println(time.toString());
	System.out.println();
	time.setTime(13,27,6);
	System.out.printf("universal time after set time: ");
	System.out.println(time.toUniversalString());
	System.out.printf("standard time after set time: ");
	System.out.println(time.toString());
	System.out.println();	
	
	try
	{
		time.setTime(99,99,99);
	
		
	}
	catch(IllegalArgumentException e)
	{
	System.out.printf("Exception: %s\n\n",e.getMessage());
	}
	System.out.println("after attempting invalid settings");
	System.out.printf("universal time: ");
	System.out.println(time.toUniversalString());
	System.out.printf("standard time: ");
	System.out.println(time.toString());
	}

}
