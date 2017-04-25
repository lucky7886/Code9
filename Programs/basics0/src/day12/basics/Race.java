package day12.basics;
import java.util.Random;
public class Race {
private int[] race;
private int tortoise,hare;
private static Random generator = new Random();

public Race(int size)
{
race = new int[size];	
}
public void startRace()
{
tortoise=1;
hare=1;
System.out.println("BANG !!!!!");
System.out.println("AND THEY'RE OFF !!!!!");
while(tortoise<70 && hare<70)
{
moveTortoise();
moveHare();
displayCurrentLocation();



}
if(tortoise>hare)
	System.out.println("TORTOISE WINS!!!YAY!!!");

else if(hare>tortoise)
	System.out.println("HARE WINS. YUCH");
else
	System.out.println("It's a tie.");
}
public void moveTortoise()
{
int i = 1 + generator.nextInt(9);
if(i<=5 && i>=1)
{
	if(tortoise+3<=70)
	tortoise+=3;
	else
		tortoise=70;
}
else if(i>=6 && i<=7)
{
	if(tortoise-6>=1)
	tortoise-=6;
	else
		tortoise=1;

}	
else if(i>=8 && i<=10)
{
	if(tortoise+1<=70)
	tortoise+=1;
	else
		tortoise=70;
}
}
public void moveHare()
{
int i = 1 + generator.nextInt(9);
if(i>=1 && i<=2)
	if(hare<=70)
	{	
		if(hare+9<=70)
	
	hare+=9;
		else
			hare=70;
	}
else if(i>=3 && i<=5)
{
	if(hare+1<=70)
	hare+=1;
	else 
		hare=70;
}
else if(i>=6 && i<=7)
{
	if(hare-2>=1)
	hare-=2;
	else
		hare=1;
}
else if(i==8)
{
	if(hare-12>=1)
	hare-=12;
	else
		hare=1;
}
}
public void displayCurrentLocation()
{
	
	for(int count=1;count<=70;count++)
	{
		if(hare==tortoise && hare==count)
		{
			System.out.print("OUCH!!!");
	break;
		}
			else if(count==hare)
			System.out.print("H");
		else if(count==tortoise)
		System.out.print("T");
		else
		System.out.print(".");
}
	System.out.println();
	System.out.println();
}
}






