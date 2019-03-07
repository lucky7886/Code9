package Gallore3;
import java.util.*;
public class Exp11 {

	public static void main(String[] args) {
		
		String[] sa = {"one", "two", "three", "four"};
		
		List sList = Arrays.asList(sa); 
		System.out.println(sa.length);
        sList.set(1, "five");
        
        System.out.println(sList);
        
        for(String s:sa)
        	System.out.println(" "+s);
	}

}
