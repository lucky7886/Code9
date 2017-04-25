package MathFactory;

import java.util.Scanner;

public class Calendar {
	int[] monthValues = { 0, 1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6 };
	private int date, month, year;

	public int getDate() {
		return date;
	}

	public void setDate(int date, int month, int year) throws Exception {
		
			if(date==31){
			if(month==1 || month==3 || month==5 || month==7 || month==8 || month== 10 || month==12 )
			{
				this.date = date;
			}
			else
			{
				this.date = date;
				throw new Exception("wrong date!!");
			}
			}
			if(date==30 && month==2)
			{
				this.date = date;
				throw new Exception("wrong date!!");
			}
			
			if(date==29){
			if(month==2)
			{
				if(year%4==0 && year!=1900)
				{
					this.date = date;
			    }
			
			else{
				this.date = date;
				throw new Exception("wrong date!!");
			}
			}
			}
			if (date <= 31 && date >= 1)
			{
			this.date = date;
			}
		
			else{
			this.date = date;
			throw new Exception("wrong date!!");
	}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) throws Exception {
		if (month >= 1 && month <= 12)
			this.month = month;
		else {
			this.month = month;
			throw new Exception("wrong month!!");
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) throws Exception {
		if (year >= 1900 && year<=2099)
			this.year = year;
		else {
			this.year = year;
			throw new Exception("year: Out of range!!");
		}
	}

	public static void main(String[] args) {
		int val = 0;
		// int[] monthValues = { 0, 1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6 };

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the date(1900-2099): (dd) (mm) (yyyy):");
		int d = input.nextInt();
		int m = input.nextInt();
		int y = input.nextInt();

		Calendar c1 = new Calendar();
		try {
			c1.setDate(d, m, y);
		} catch (Exception e1) {
			val = -1;
			System.out.println(e1.getMessage());
		}
		try {
			c1.setMonth(m);
		} catch (Exception e) {
			val = -1;
			System.out.println(e.getMessage());

		}
		try {
			c1.setYear(y);
		} catch (Exception e) {
			val = -1;
			System.out.println(e.getMessage());
		}
		System.out.print("\nYou entered date: ");
		System.out.printf("\n%02d %02d %02d ", c1.getDate(), c1.getMonth(),
				c1.getYear());
		if (val == -1)
			System.out.println("\nCan't calculate the day..");
		else {
			System.out.println("\n\nCalculating the day..");

			if (c1.getYear() >= 2000) {
				int l = c1.getYear() - 2000 + 100;
				int leap = l / 4;
				int sum = c1.getDate() + l + c1.monthValues[c1.getMonth()]
						+ leap;
				if (c1.getYear() % 4 == 0) {
					if (c1.getMonth() == 1 || c1.getMonth() == 2)
						sum = sum - 1;
				}
				int value = sum % 7;
				String dayValue = c1.dayTeller(value);
				System.out.print("\nThe day on the given date was/will be ");
				System.out.println(dayValue);
			} else {
				int l = c1.getYear() - 1900;
				int leap = l / 4;
				int sum = c1.getDate() + l + c1.monthValues[c1.getMonth()]
						+ leap;
				if (c1.getYear() % 4 == 0 && c1.getYear() != 1900) {
					if (c1.getMonth() == 1 || c1.getMonth() == 2)
						sum = sum - 1;
				}
				int value = sum % 7;
				String dayValue = c1.dayTeller(value);
				System.out.print("\nThe day on the given date was/will be ");
				System.out.println(dayValue);

			}

		}
	}

	public String dayTeller(int day) {
		String days = null;
		switch (day) {
		case 1:

			days = "Sunday";
			break;

		case 2:
			days = "Monday";
			break;

		case 3:

			days = "Tuesday";
			break;

		case 4:

			days = "Wednesday";
			break;

		case 5:

			days = "Thursday";
			break;

		case 6:

			days = "Friday";
			break;

		case 0:

			days = "Saturday";
			break;

		}
		return days;
	}

}
