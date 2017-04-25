import java.util.Comparator;
import java.util.TreeSet;

class myComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		
		if(I1>I2)
			return -1;

		else if(I1<I2)
			return 1;
		
		else
		return 1;
	}
	
}

public class start12 {

	public static void main(String[] args) {

		TreeSet t1 = new TreeSet(new myComparator());
		TreeSet t = new TreeSet();
		
		t.add(3);
		t.add(6);
		t.add(1);
		t1.add(3);
		t1.add(6);
		t1.add(1);
		t1.add(6);
		//t.add(null);
		System.out.println(t);
		System.out.println(t1);
		
	}

}
