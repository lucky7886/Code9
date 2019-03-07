
public class SundaysCount {

	public static void main(String[] args) {
		int[] arr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int sundays = 0;
		int firstDayMonth = 0;// sunday
		int days = 0;
		int firstDayYear = 1;// monday
		int val = 365 % 7;
		if (val == 1)
			firstDayYear = 2;
		for (int i = 1901; i <= 2000; i++) {
			days = 365;
			arr[1] = 28;
			if (i % 4 == 0) {
				days = 366;
				arr[1] = 29;
			}

			firstDayMonth = firstDayYear;
			for (int j = 0; j < arr.length; j++) {

				if (firstDayMonth == 0) {
					System.out.println("Month "+(j+1)+" Year "+i);
					sundays++;
				}
				
				val = arr[j] % 7;
				firstDayMonth = (firstDayMonth + val) % 7;

				
			}
			firstDayYear = firstDayMonth;
		}
		System.out.println(sundays);
	}

}
