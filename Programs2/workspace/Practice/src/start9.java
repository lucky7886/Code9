import java.util.ArrayList;
import java.util.Scanner;

public class start9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		ArrayList<String> sList = new ArrayList<String>();
		while(true){
			String line = input.nextLine();
			if(line.equals(""))
				break;
			sList.add(line);
		}
		
		for(int i=0;i<sList.size();i++)
			System.out.println(sList.get(i));
		
		
	}

}
