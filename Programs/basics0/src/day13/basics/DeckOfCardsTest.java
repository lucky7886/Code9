package day13.basics;

public class DeckOfCardsTest {

	public static void main(String[] args) {
DeckOfCards D1 = new DeckOfCards();
D1.shuffle();
for(int i =1;i<=3;i++)
{
	System.out.printf("%-19s",D1.dealCard());
if(i%4==0)
	System.out.println();
}
D1.typeOfCards();


	}

}
