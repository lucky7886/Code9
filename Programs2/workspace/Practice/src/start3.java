import java.util.ArrayList;
import java.util.Vector;

public class start3 {
public static void main(String[] args){
	Vector vec = new Vector();
	ArrayList l = new ArrayList(1000000);
	for(int i=0;i<1e7;i++)
	{
		l.add(i);
		
	}
	System.out.println("added");
	l.add(1, 0);
	
}
}
