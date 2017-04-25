package Pearl1;

public class TimeTest {

	public static void main(String[] args) {

		Time T = new Time();
		Time T1 = new Time();
		System.out.println(T);
		
		T.setTime(13, 12, 11);
		T1.setTime(21, 15, 59);
		System.out.println(T);
		System.out.printf("%s",T1.toRegular());
	}

}
