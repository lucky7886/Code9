import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ProGame2 {
static String answer="";
static List list =null;
	public static void main(String[] args) {
		//List list1=null,
			List list2=null,list3=null,list4=null,list5=null;
			Random r = new Random();
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
		String[] Banking = {"Ankur Saxena","Subesh Kumar","Shivam Gupta"};
		
		String [] Mba = {"Prateek Saxena"};
		//List<String> list = new ArrayList<String>(Arrays.asList(names));
		list = new ArrayList<String>(Arrays.asList(names));
			Integer k=0;
			int c=0;
			//String[] arr = {1,2,3,4,5,6,7,8,9,10,11};
			String[] arr = {"1","2","3","4","5","6","7","8","9","10","11"};
			List<String> nums = new ArrayList<String>(Arrays.asList(arr));
			int d=11;
			do{
			
		/*	while(true){
			k= 1+r.nextInt(d);
			if(nums.contains(k.toString())==true)
				break;
			}*/
				if(d==0)
				{
					if(list.size()==1){
						c=-1;
					}
					break;
					
				}
			
			k=Integer.parseInt(nums.get(r.nextInt(d)));	
			nums.remove(k.toString());
			d--;
			
		switch(k){
		case 1:
			if(list.size()!=1){
			System.out.println("Does your friend work in Delhi/NCR/UP?");
			answer = input.nextLine();
			if (answer.contains("yes")) {
				
				list2 = new ArrayList<String>(Arrays.asList(upStateNcr));
				list.retainAll(list2);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			
			else if(answer.contains("no")){
				list2 = new ArrayList<String>(Arrays.asList(upStateNcr));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
				
			}
			}
			else
				c=-1;
			break;
		
		case 2:
			if(list.size()!=1){
			System.out.println("Does your friend work in IT Industry?");
			answer = input.nextLine();
			if (answer.contains("yes")) {
				list2 = new ArrayList<String>(Arrays.asList(itJob));
				list.retainAll(list2);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			
			else if(answer.contains("no")){
				list2 = new ArrayList<String>(Arrays.asList(itJob));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			}
			else
				c=-1;
			break;
	
		case 3:
			if(list.size()!=1){
			System.out.println("Does your friend wear specs?");
			answer = input.nextLine();
			if (answer.contains("yes")) {
				list2 = new ArrayList<String>(Arrays.asList(specs));
				list.retainAll(list2);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			
			else if(answer.contains("no")){
				list2 = new ArrayList<String>(Arrays.asList(specs));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
	}
			else
				c=-1;
			break;
			
		case 4:
			if(list.size()!=1){
			System.out.println("Did your friend have a recent meet with Prateek?");
			answer = input.nextLine();
			if (answer.contains("yes")) {
				list2 = new ArrayList<String>(Arrays.asList(meet));
				list.retainAll(list2);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			
			else if(answer.contains("no")) {
				list2 = new ArrayList<String>(Arrays.asList(meet));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
	}
			else
				c=-1;
			break;
			
		case 5:
			if(list.size()!=1){
			System.out.println("Is your friend in Development(Java/any other)");
			answer = input.nextLine();
			if (answer.contains("yes")){
				list2 = new ArrayList<String>(Arrays.asList(development));
				list.retainAll(list2);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			
			else if(answer.contains("no")) {
				list2 = new ArrayList<String>(Arrays.asList(development));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
	}
			else
		c=-1;
			break;
			
		case 6:
			if(list.size()!=1){
			System.out.println("Is your friend post graduate");
			answer = input.nextLine();
			if (answer.contains("yes")) {
				list2 = new ArrayList<String>(Arrays.asList(pGraduate));
				list.retainAll(list2);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			
			else if(answer.contains("no")) {
				list2 = new ArrayList<String>(Arrays.asList(pGraduate));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
	}
			else
				c=-1;
			break;
			
		case 7:
			if(list.size()!=1){
				System.out.println("Is your friend currently working in Bangalore?");
				answer = input.nextLine();
				if (answer.contains("yes")) {
					list2 = new ArrayList<String>(Arrays.asList(bangalore));
					list.retainAll(list2);
					if(list.size()==1)
						System.out.println("you were thinking of: "+list);
				}
				
				else if(answer.contains("no")) {
					list2 = new ArrayList<String>(Arrays.asList(bangalore));
					list3 = new ArrayList<String>(Arrays.asList(names));
					list3.removeAll(list2);
					list.retainAll(list3);
					if(list.size()==1)
						System.out.println("you were thinking of: "+list);
				}
		}
			
			else
				c=-1;
			break;
			
			case 8:
			if(list.size()!=1){
			System.out.println("Is your friend Married");
			
			answer = input.nextLine();
			if (answer.contains("yes")) {
				list2 = new ArrayList<String>(Arrays.asList(married));
				list.retainAll(list2);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			
			else if(answer.contains("no")) {
				list2 = new ArrayList<String>(Arrays.asList(married));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
	}
			
			else
				c=-1;
			break;
			
			case 9:
			if(list.size()!=1){
			System.out.println("Does your friend work in Banking Sector");
			
			answer = input.nextLine();
			if (answer.contains("yes")) {
				list2 = new ArrayList<String>(Arrays.asList(Banking));
				list.retainAll(list2);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			
			else if(answer.contains("no")) {
				list2 = new ArrayList<String>(Arrays.asList(Banking));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
	}
			
			else
				c=-1;
			break;
			
			case 10:
			if(list.size()!=1){
			System.out.println("Is your friend an Mba?");
			answer = input.nextLine();
			if (answer.contains("yes")) {
				list2 = new ArrayList<String>(Arrays.asList(Mba));
				list.retainAll(list2);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
			
			else if(answer.contains("no")) {
				list2 = new ArrayList<String>(Arrays.asList(Mba));
				list3 = new ArrayList<String>(Arrays.asList(names));
				list3.removeAll(list2);
				list.retainAll(list3);
				if(list.size()==1)
					System.out.println("you were thinking of: "+list);
			}
	}
			
			else
				c=-1;
			break;
			
			case 11:
			if(list.size()!=1){
				System.out.println("Does Saxena is your friend's surname?");
				answer = input.nextLine();
				if (answer.contains("yes")) {
					list2 = new ArrayList<String>(Arrays.asList(saxena));
					list.retainAll(list2);
					if(list.size()==1)
						System.out.println("you were thinking of: "+list);
				}
				
				else if(answer.contains("no")) {
					list2 = new ArrayList<String>(Arrays.asList(saxena));
					list3 = new ArrayList<String>(Arrays.asList(names));
					list3.removeAll(list2);
					list.retainAll(list3);
					if(list.size()==1)
						System.out.println("you were thinking of: "+list);
				}
		}
			
			else
				c=-1;
			break;
			default: break;
		}
			}
			while(c!=-1);
			
			if(c!=-1)
				System.out.println("Oops!! Seems like you were not being completely honest!");
		}
	

}
