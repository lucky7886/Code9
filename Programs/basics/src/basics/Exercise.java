package basics;

public class Exercise {

	public static void main(String[] args) {

		int z = mystery(50,11);
		System.out.println(z);
		
	}
public static int mystery(int a, int b)
{
	
if(b==1)
return a;
else
	return a+mystery(a,b-1);
}
}
