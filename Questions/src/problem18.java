import java.util.Set;
import java.util.TreeSet;

public class problem18 {

	public static void main(String[] args) {
		int count = 0;
		int n = 2;
		for (int i = 2; i < Integer.MAX_VALUE; i++) {

			if (i == (n * (n + 1)) / 2) {
				System.out.print(i + ": ");
				count = factors(i);
				n++;
				System.out.println();
			}
			if (count >= 1000) {
				System.out.println("\n\n" + i);
				break;
			}
		}
		// factors(78);

	}

	static int factors(int num) {
		Set<String> trees = new TreeSet();
		int count = 0;
		String ans = "";

		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				ans += i + "*";
				num = num / i;
				i--;
				count++;
			}
		}
		String val = ans.substring(0, ans.length() - 1);
		System.out.println(val);

		String[] v = val.split("\\*");

		for (String s : v)
			trees.add(s);

		// System.out.println(trees.size());
		int[] co = new int[trees.size()];
		int i = 0;
		int counter2 = 0;
		for (String s : trees) {
			counter2 = 0;
			for (String a : v) {
				if (Integer.parseInt(s) == Integer.parseInt(a))
					counter2++;
			}
			co[i++] = counter2;
		}

		int total = 1;
		// System.out.println("\n");
		for (int j = 0; j < co.length; j++)
			total *= co[j] + 1;
		System.out.println(total);
		return total;
	}

}