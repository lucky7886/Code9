package basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Start10 {

	public static void main(String[] args) throws FileNotFoundException {

		String fileName = "C:\\Users\\compaq\\Desktop\\New.txt";

		
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		int value = in.nextInt();
		System.out.println("value: "+value);
		int count = 2;
		in.nextLine();
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			System.out.println(count+": " +line);
			count++;
		}
		
		in.close();
	}

}
