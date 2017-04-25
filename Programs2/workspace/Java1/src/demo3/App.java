package demo3;

public class App {

	public static void main(String[] args) {

		
		String info = "";
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
	/*	
		System.out.println(info);
		String ab = new String("abc");
		System.out.println(ab);
		String cv = ab;
		if(ab==cv)
			System.out.println("yes");
	*/
		StringBuilder sb = new StringBuilder("");
		sb.append("Bob").append(" is").append(" a").append(" good man.");
		System.out.println(sb.toString());
		System.out.println("\\\\");
		
		for(int i=0;i<20;i++)
		{
			System.out.printf("%-2d: %s\n",i,"some text here.");
		}
	}

}
