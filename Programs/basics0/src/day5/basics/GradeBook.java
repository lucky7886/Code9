package day5.basics;
import java.util.Scanner;
public class GradeBook {
private String courseName;
Scanner input=new Scanner(System.in);
public GradeBook(String name)
{
courseName=name;	
}
public void setCourseName(String name)
{
	courseName=name;
}
public String getCourseName()
{
return courseName;	
}
public void displayMessage()
{
System.out.printf("welcome to the grade book for\n%s!\n\n",getCourseName());	
}
public void determineClassAverage()
{
int grade;
int gradeCounter;
int total;
double average;
System.out.println("\nenter grade or -1 to quit");
total=0;
gradeCounter=0;
grade=input.nextInt();
while(grade!=-1)
{
total=total+grade;
gradeCounter=gradeCounter+1;
System.out.println("\nenter grade or -1 to quit");
grade=input.nextInt();
}
if(gradeCounter!=0)
{
average=(double)total/gradeCounter;
System.out.printf("\ntotal of the %d grades is %d",gradeCounter,total);
System.out.printf("class average is %.2f\n",average);
}
else
	System.out.println("no grades were entered");
}
	
	
	
}
