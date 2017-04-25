package Pearl1;

public class VarLengthArg {

	public static void main(String[] args) {

		
		System.out.println(average(3,4,5,6,7,8,9,10));
		
	}
	
	public static int average(int...numbers)
	{
		int tot = 0;
		for(int x: numbers)
			tot+=x;
		return tot/numbers.length;
		
	}

}
