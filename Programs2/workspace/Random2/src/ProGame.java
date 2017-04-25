import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProGame {
static String answer="";
static List list =null;
	public static void main(String[] args) {
		//List list1=null,
			List list2=null,list3=null,list4=null,list5=null;
		
		Scanner input = new Scanner(System.in);
String[] bangalore = {"Anmol Rastogi","Vikalp Sonkar","Nikhil Chandra"};
		String names[] = { "Rahul Narang", "Prateek Bhardwaj", "Prateek Saxena", "Shivam Gupta", "Subesh Kumar",
				"Harshit Vaish", "Ankur Saxena", "Amiy Prakash", "Karan Ahuja", "Priyank Rastogi", "Shaurya Rastogi",
				"Vikalp Sonkar", "Naresh Kumar Nimesh", "Shekhar", "Rahul Sharma", "Nikhil Chandra", "Anmol Rastogi" };

		String[] upStateNcr = { "Rahul Narang", "Prateek Bhardwaj", "Prateek Saxena", "Shivam Gupta", "Subesh Kumar",
				"Harshit Vaish", "Ankur Saxena", "Amiy Prakash", "Karan Ahuja", "Priyank Rastogi", "Shaurya Rastogi" };

	//	String[] outsideUpNcr = { "Vikalp Sonkar", "Naresh Kumar Nimesh", "Shekhar", "Rahul Sharma", "Nikhil Chandra",
		//		"Anmol Rastogi" };
		String[] development = {"Rahul Narang", "Vikalp Sonkar", "Shekhar","Rahul Sharma","Anmol Rastogi"};
		
		String[] pGraduate = {"Shekhar","Prateek Saxena","Harshit Vaish","Prateek Bhardwaj"};
		
		String[] itJob = {"Rahul Narang","Prateek Bhardwaj","Amiy Prakash","Shaurya Rastogi","Vikalp Sonkar",
				"Shekhar", "Rahul Sharma", "Nikhil Chandra", "Anmol Rastogi"};
		String[] saxena = {"Ankur Saxena","Prateek Saxena"};
		String[] specs = {"Shivam Gupta","Rahul Narang","Prateek Bhardwaj","Harshit Vaish","Amiy Prakash","Anmol Rastogi","Nikhil Chandra"};

		String[] meet = {"Prateek Bhardwaj","Rahul Narang","Shaurya Rastogi","Priyank Rastogi","Harshit Vaish"};
		
		String [] married = {"Karan Ahuja"};
		String[] Banking = {"Ankur Saxena","Subesh Kumar"};
		
		String [] Mba = {"Prateek Saxena"};
		//List<String> list = new ArrayList<String>(Arrays.asList(names));c
		list = new ArrayList<String>(Arrays.asList(names));
			
		
			System.out.println("Does your friend work in Delhi/NCR/UP?");
			answer = input.nextLine();
			if (answer.contains("yes")) {
				
				list2 = new ArrayList<String>(Arrays.asList(upStateNcr));
				list.retainAll(list2);
			}
			
			else{
				list2 = new ArrayList<String>(Arrays.asList(upStateNcr));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
			
			}
			
			System.out.println("Does your friend work in IT Industry?");
			answer = input.nextLine();
			if (answer.contains("yes")) {
				list2 = new ArrayList<String>(Arrays.asList(itJob));
				list.retainAll(list2);
			}
			
			else {
				list2 = new ArrayList<String>(Arrays.asList(itJob));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
			}
	
			if(list.size()!=1){
			System.out.println("Does your friend wear specs?");
			answer = input.nextLine();
			if (answer.contains("yes")) {
				list2 = new ArrayList<String>(Arrays.asList(specs));
				list.retainAll(list2);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			
			else {
				list2 = new ArrayList<String>(Arrays.asList(specs));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
	}
			if(list.size()!=1){
			System.out.println("Did your friend have a recent meet with Prateek?");
			answer = input.nextLine();
			if (answer.contains("yes") && list.size()!=1) {
				list2 = new ArrayList<String>(Arrays.asList(meet));
				list.retainAll(list2);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			
			else if(list.size()!=1) {
				list2 = new ArrayList<String>(Arrays.asList(meet));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
	}
			if(list.size()!=1){
			System.out.println("Is your friend in Development(Java/any other)");
			answer = input.nextLine();
			if (answer.contains("yes") && list.size()!=1) {
				list2 = new ArrayList<String>(Arrays.asList(development));
				list.retainAll(list2);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			
			else if(list.size()!=1) {
				list2 = new ArrayList<String>(Arrays.asList(development));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
	}
			if(list.size()!=1){
			System.out.println("Is your friend post graduate");
			answer = input.nextLine();
			if (answer.contains("yes") && list.size()!=1) {
				list2 = new ArrayList<String>(Arrays.asList(pGraduate));
				list.retainAll(list2);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			
			else if(list.size()!=1) {
				list2 = new ArrayList<String>(Arrays.asList(pGraduate));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
	}
			
			if(list.size()!=1){
				System.out.println("Is your friend currently working in Bangalore?");
				answer = input.nextLine();
				if (answer.contains("yes") && list.size()!=1) {
					list2 = new ArrayList<String>(Arrays.asList(bangalore));
					list.retainAll(list2);
					if(list.size()==1)
						System.out.println("you were thinking of: "+list);
				}
				
				else if(list.size()!=1) {
					list2 = new ArrayList<String>(Arrays.asList(bangalore));
					list3 = new ArrayList<String>(Arrays.asList(names));
					list3.removeAll(list2);
					list.retainAll(list3);
					if(list.size()==1)
						System.out.println("you were thinking of: "+list);
				}
		}
			if(list.size()!=1){
			System.out.println("Is your friend Married");
			
			answer = input.nextLine();
			if (answer.contains("yes") && list.size()!=1) {
				list2 = new ArrayList<String>(Arrays.asList(married));
				list.retainAll(list2);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			
			else if(list.size()!=1) {
				list2 = new ArrayList<String>(Arrays.asList(married));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
	}
			if(list.size()!=1){
			System.out.println("Is your friend work in Banking Sector");
			
			answer = input.nextLine();
			if (answer.contains("yes") && list.size()!=1) {
				list2 = new ArrayList<String>(Arrays.asList(Banking));
				list.retainAll(list2);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			
			else if(list.size()!=1) {
				list2 = new ArrayList<String>(Arrays.asList(Banking));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
	}
			if(list.size()!=1){
			System.out.println("Is your friend an Mba?");
			answer = input.nextLine();
			if (answer.contains("yes") && list.size()!=1) {
				list2 = new ArrayList<String>(Arrays.asList(Mba));
				list.retainAll(list2);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			
			else if(list.size()!=1) {
				list2 = new ArrayList<String>(Arrays.asList(Mba));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
	}
			
			if(list.size()!=1){
				System.out.println("Does Saxena is your friend's surname?");
				answer = input.nextLine();
				if (answer.contains("yes") && list.size()!=1) {
					list2 = new ArrayList<String>(Arrays.asList(saxena));
					list.retainAll(list2);
					if(list.size()==1)
						System.out.println("you were thinking of: "+list);
				}
				
				else if(list.size()!=1) {
					list2 = new ArrayList<String>(Arrays.asList(saxena));
					list3 = new ArrayList<String>(Arrays.asList(names));
					list3.removeAll(list2);
					list.retainAll(list3);
					if(list.size()==1)
						System.out.println("you were thinking of: "+list);
				}
		}
			
		
		}
	

}
