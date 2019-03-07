package ArraysGallore;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetSize {

	{
		System.out.println(this.getClass().getTypeName());
	}

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		s1.add("sachin");
		s1.add("sac");
		s1.add("hin");
		System.out.println(s1.size());

		Random rnd = new Random(1234);
		for (int i = 0; i < 10; i++)
			System.out.println(rnd.nextInt(100));

		rnd = new Random(1234);
		for (int i = 0; i < 10; i++)
			System.out.println(rnd.nextInt(100));

		SetSize S1 = new SetSize();

	}

}
