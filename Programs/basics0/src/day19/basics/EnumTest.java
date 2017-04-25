package day19.basics;

import java.util.EnumSet;

public class EnumTest {

	public static void main(String[] args) {

		System.out.println("ALL BOOKS:\n");
		
		for(Book book : Book.values())
		
		System.out.printf("%-10s%-45s%s\n",book,book.getTitle(),book.getCopyrightYear());
			
		System.out.println("\nDisplay a range of ENUM constants:\n");
		
		for(Book book : EnumSet.range(Book.JHTP,Book.CPPHTP))
	System.out.printf("%-10s%-45s%s\n",book,book.getTitle(),book.getCopyrightYear());
		
		
		
	}

}
