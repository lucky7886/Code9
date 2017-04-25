
		package Patterns;
		import java.util.Scanner;
		public class Star02 {

			public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				System.out.println("Enter the number: ");
				int c = input.nextInt();
				for(int i=0;i<=c;i++)
				{
					for(int j=c;j>=i;j--)
						if(i%2==0)
						System.out.print("* ");
				System.out.println();
				}
				
			}

		}
		
		
	


