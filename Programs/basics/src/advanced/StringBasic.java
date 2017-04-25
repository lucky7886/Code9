package advanced;

public class StringBasic {

	public static void main(String[] args) {
String[] words = {"funk", "chunk", "furry", "baconator"};

for(String w : words)
{
if(w.startsWith("unk"))
	System.out.println(w + " starts with fu");

}
for(String w : words)
{
if(w.endsWith("unk"))
	System.out.println(w + " ends with unk");

}
		
		
		
	}

}
