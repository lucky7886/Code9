package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App1 {

	public static void main(String[] args) {

		Test1 test = new Test1();
		/*
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		System.out.println("couldn't parse.");
		}
		*/
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		try {
			test.input();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
