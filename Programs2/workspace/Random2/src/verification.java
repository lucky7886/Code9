import java.util.Scanner;

public class verification {

	public static void main(String[] args) {
		int count=0;
		String[] name = {"prateek","shanky","steven","alexander","nikola","stephen","Leo"};
		String[] access = {"123","234","345","456","567","678","789"};
		Scanner input = new Scanner(System.in);
		do{
			count=-1;
		System.out.println("Enter your username");
		String username = input.nextLine();
		System.out.println("enter your password");
		String password = input.nextLine();
		
		for(String check : name){
			count++;
			if(check.contains(username))
				break;
			
		}
		
		if(access[count].contains(password)){
			System.out.println("Access granted");
		break;
		}
			else
		System.out.println("Incorrect username or password!!!");
		}
		while(true);
	}

}
