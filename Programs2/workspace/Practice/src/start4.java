import java.util.HashMap;
import java.util.Iterator;

public class start4 {

	public static void main(String[] args) {

		HashMap<String,String> dict = new HashMap<String,String>();
		
		HashMap<String,Long> phbook = new HashMap<String,Long>();
		
		dict.put("Prateek", "Noida");
		
		System.out.println(dict.get("Prateek"));
		phbook.put("Prateek", 9810870395l);
	
		phbook.put("abc", 123456789l);
		phbook.put("xyz", 987654321l);
		
		System.out.println(phbook.get("Prateek"));
		phbook.remove("asd");
		
		Iterator<String> it = phbook.keySet().iterator();
		while(it.hasNext())
			System.out.println(it.next());
	
	
	
	}

}
