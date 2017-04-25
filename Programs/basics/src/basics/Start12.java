package basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Start12 {

	public static void main(String[] args) {

		File file = new File("test.txt");

		try {
			FileReader fr = new FileReader(file);
			System.out.println("continuing ...");
		} catch (FileNotFoundException e) {
		System.out.println("file not found: "+file.toString());
		}

		System.out.println("finished.");
	}

}
