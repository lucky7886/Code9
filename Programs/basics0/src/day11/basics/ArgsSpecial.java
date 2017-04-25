package day11.basics;

public class ArgsSpecial {

	public static void main(String[] args) {
if(args.length!=3)
{
System.out.println("enter the entire command including\n"
		+"array length,initial value and increment");	

}
else
{
	int arrayLength = Integer.parseInt(args[0]);
int [] array = new int[arrayLength];
int initial = Integer.parseInt(args[1]);
int increment = Integer.parseInt(args[2]);
for(int counter=0;counter<array.length;counter++)
	array[counter]=initial+counter*increment;
System.out.printf("%s%8s\n","Index","Value");
for(int counter=0;counter<array.length;counter++)
System.out.printf("%5d%8d\n",counter,array[counter]);
}
	}

}
