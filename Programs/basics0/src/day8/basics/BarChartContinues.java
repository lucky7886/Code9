package day8.basics;
import java.util.Scanner;
public class BarChartContinues {
	
	int array[] = new int[11];		
	public void Submit() {

		Scanner input = new Scanner(System.in);
System.out.println("Enter the marks of students:");

while(input.hasNext())
{
	int grade;
	grade = input.nextInt();
	++array[grade/10];
	//Bar(grade);//
}
input.close();
	}
private void Bar(int value)
{
	
	switch(value/10)
	{
	case 0:
		++array[0];
		break;
	case 1:
		++array[1];
		break;
	case 2:
		++array[2];
		break;
	case 3: 
		++array[3];
		break;
	case 4:
		++array[4];
		break;
	case 5:
		++array[5];
		break;
	case 6:
		++array[6];
		break;
	case 7:
		++array[7];
		break;
	case 8:
		++array[8];
		break;
	case 9:
		++array[9];
		break;
	case 10:
		++array[10];
		break;
		}
	
	
}
	

}
