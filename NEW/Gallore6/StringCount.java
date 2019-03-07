package Gallore6;

public class StringCount {

	public static void main(String[] args) {

		String str = "sshjsjsklhellosjckdsbjfknhelloskjdnsjkdskjhelloskjdbk";
		String findStr = "hello";
		int index = 0;
		int count = 0;
		while (index != -1) {
			index = str.indexOf(findStr, index);
			if (index != -1) {
				count++;
				index += findStr.length();
			}
		}
		System.out.println(count);

	}

}
