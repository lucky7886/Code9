package experimental;

import java.util.Random;
import java.util.Scanner;

public class demo25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
				Random r = new Random();
		
		System.out.println("Enter the number of questions");
		int num = input.nextInt();
		
System.out.println("Enter the number of students");
int students=input.nextInt();

int count=0;
		
System.out.println();
		
int[] arrayAnswers = new int [num];
int[] studentAnswer = new int[num];		
boolean result = true;
for(int i=0;i<arrayAnswers.length;i++){
			arrayAnswers[i]=1+r.nextInt(4);
		}

/*		for(int i=0;i<arrayAnswers.length;i++)
		System.out.println(arrayAnswers[i]);*/
		
		while(students>0){
			result=true;
		for(int i=0;i<arrayAnswers.length;i++){
			studentAnswer[i]=1+r.nextInt(4);
		}
/*		for(int i=0;i<arrayAnswers.length;i++)
		System.out.println(studentAnswer[i]);*/
		
		for(int i=0;i<arrayAnswers.length;i++)
			if(studentAnswer[i]!=arrayAnswers[i]){
		result=false;
		break;
			}
		if(result==true){
			count++;
		}
		students--;
		}
		System.out.println("Number of students succeeded "+count);
	}

}
