package day10.basics;

public class GradeBook {
private String courseName;
private int[] grades;

public GradeBook(String name, int[] gradesArray)
{
courseName=name;
grades=gradesArray;
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
System.out.printf("welcome to the gradebook for \n%s\n",getCourseName());	
}
public int getMinimum()
{
	int lowGrade=grades[0];
for(int number:grades)

	if(number<lowGrade)
lowGrade=number;
return lowGrade;
}
public int getMaximum()
{
	int highGrade=grades[0];
for(int number:grades)

	if(number>highGrade)
highGrade=number;
return highGrade;
}
public double getAverage()
{
	int total=0;
	for(int number:grades)
		total+=number;
	return (double)total/grades.length;
}
public void outputBarChart()
{
System.out.println("Grade Distribution");
int[] frequency = new int[11];
for(int number:grades)
	++frequency[number/10];
for(int count=0;count<frequency.length;count++)
{
if(count==10)
	System.out.printf("%5d: ",100);
else
	System.out.printf("%02d-%02d: ",count*10,count*10+9);
for(int stars=0;stars<frequency[count];stars++)
	System.out.print("*");

System.out.println();
}

}
public void outputGrade()
{
System.out.println("the grades are: \n");
for(int student=0;student<grades.length;student++)
	System.out.printf("student %2d: %3d\n",student+1,grades[student]);
}
public void processGrade()
{
outputGrade();
System.out.printf("\nclass average is %.2f\n",getAverage());
System.out.printf("lowest grade is %d\nhighest grade is %d\n\n",getMinimum(),getMaximum());
outputBarChart();
}




}
