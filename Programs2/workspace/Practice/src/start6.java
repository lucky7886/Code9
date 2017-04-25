import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class start6 {
	public static Map<String, Long> phoneBook = new HashMap<String, Long>();
static	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter name and number for the phonebook");
		readPhoneNumbers();
		System.out.println("Looking up numbers");
		lookUpNumbers();
		System.out.println("Displaying numbers");
		displayAllNumbers();

	}

	public static void readPhoneNumbers() {
		while(true){
		
			System.out.println("Enter the name");
			
			String name = input.nextLine();
			if(name.equals(""))
				break;
			System.out.println("Enter the number");
			Long number = input.nextLong();
			input.nextLine();
			phoneBook.put(name, number);
		}
	}

	public static void lookUpNumbers() {
		while(true){
			
			System.out.println("Enter the name");
			
			String name = input.nextLine();
			if(name.equals(""))
				break;
			Long number = phoneBook.get(name);
		//	input.nextLine();
			if(number==null)
				System.out.println("Number not present in the phonebook");
			else
				System.out.println("The number is: "+number);
		}
	}

	public static void displayAllNumbers() {
		Iterator<String> it = phoneBook.keySet().iterator();
		while(it.hasNext()){
			String name = it.next();
			Long number = phoneBook.get(name);
			System.out.println(name+" --- "+number);
		}
	}
}
