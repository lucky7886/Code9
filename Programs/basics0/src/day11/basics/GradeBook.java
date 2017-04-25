package day11.basics;

public class GradeBook {
	private int [][] grades;
	private String courseName;

	public GradeBook(String name,int[][] array)
	{
		courseName = name;
		grades = array;
		
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
		System.out.printf("%s %s","welcome to the gradebook for",getCourseName());
	}
	public void processGrades()
	{
		output();
		System.out.printf("\n%s%d\n%s%d\n\n","the minimum of the grades"
				+ "is ",getMinimum(),"the maximum of the grade is ",getMaximum());
	barChart();
	}
	public void barChart()
	{
		System.out.println("Distribution of grades");
		int[] frequency = new int[11];
		for(int[] num:grades)
			for(int num1:num)
				++frequency[num1/10];
		for(int count=0;count<frequency.length;count++)
		{
			if(count==10)
				System.out.printf("%5d",100);
			else
				System.out.printf("%2d-%2d",count*10,count*10+9);
			for(int star=0;star<frequency[count];star++)
				System.out.print("*");
			System.out.println();
			
		}
	}
		public int getMinimum()
		{
			int min = grades[0][0];
	       for(int[] array:grades)
	    	   for(int num:array)
	    		   if(num<min)
	    			   min=num;
	       return min;
		}
		public int getMaximum()
		{
			int max = grades[0][0];
	       for(int[] array:grades)
	    	   for(int num:array)
	    		   if(num>max)
	    			   max=num;
	       return max;
		}
		public double getAverage(int[] array)
		{
			int total=0;
			for(int num:array)
				total+=num;
			return (double)total/array.length;
		}
		public void output()
		{
		System.out.println("Marks of the students are: ");
		System.out.print("            ");
	for(int test=0;test<grades[0].length;test++)
		System.out.printf("Test %d  ",test+1);
	System.out.print("Average\n");
	
	for(int student=0;student<grades.length;student++)
	{
		System.out.printf("Student %2d",student+1);
	
	for(int p=0;p<grades[student].length;p++)
			System.out.printf("%8d",grades[student][p]);
	    System.out.printf("%9.2f\n",getAverage(grades[student]));
		
	}
		}
}
