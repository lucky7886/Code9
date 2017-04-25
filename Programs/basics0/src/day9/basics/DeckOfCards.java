package day9.basics;
import java.util.Random;
public class DeckOfCards {
	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS=52;
private static final Random randomNumbers = new Random();	


public DeckOfCards()
{
	String[] suits = {"HEARTS","DIAMONDS","CLUBS","SPADES"};
	String[] faces = {"ACE","DEUCE","THREE","FOUR","FIVE","SIX","SEVEN",
			"EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	deck=new Card[NUMBER_OF_CARDS];
	currentCard=0;
	for(int count=0;count<deck.length;count++)
	
		deck[count]=new Card(suits[count/13],faces[count%13]);
		
	}
public void shuffle()
{
	currentCard=0;
	for(int first=0;first<deck.length;first++)
	{	
		int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

	Card temp = deck[first];
	deck[first] = deck[second];
	deck[second] = temp; 
	
	}

}
public Card dealCard()
{
	if(currentCard<deck.length)
		return deck[currentCard++];
	else
		return null;
	
}



}