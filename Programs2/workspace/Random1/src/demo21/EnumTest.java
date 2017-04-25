package demo21;

import java.util.EnumSet;

public class EnumTest {

	public static void main(String[] args) {

		
		System.out.println("All Books:\n");
		for(Book book : Book.values())
			System.out.printf("%-10s%-45s%s\n",book,book.getTitle(),book.getCopyrightYear());
		
		
	}

}
