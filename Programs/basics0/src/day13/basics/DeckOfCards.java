package day13.basics;
import java.util.Random;
public class DeckOfCards {
	private Card[] deck;
	private static final Random generator = new Random();
	private static final int NUMBER_OF_CARDS = 52;
	private int currentCard;
	public DeckOfCards()
	{
		
		String[] faces={"HEARTS","DIAMONDS","CLUBS","SPADES"};
		String[] suits={"ACE","DEUCE","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE",
				"TEN","JACK","QUEEN","KING"};

		currentCard=0;
		deck=new Card[NUMBER_OF_CARDS];
		for (int i=0;i<deck.length;i++)
			deck[i]=new Card(faces[i/13],suits[i%13]);
	
	}
	
	
	
	
		public void shuffle()
		{
			currentCard=0;
			Card temp;
			for(int first=0;first<deck.length;first++)
			{
				int second=generator.nextInt(NUMBER_OF_CARDS);
				temp=deck[first];
                deck[first]=deck[second];
                deck[second]=temp;
			
			}
			
		}
		public void typeOfCards()
		{
			int c=0;
			int d=0;
		if(deck[0].getSuit()==deck[1].getSuit() && deck[0].getSuit()==deck[2].getSuit())
			c++;
		if(deck[0].getSuit()==deck[1].getSuit() || deck[1].getSuit()==deck[2].getSuit()
		|| deck[0].getSuit()==deck[2].getSuit())
			d++;
		if(c==1 && d==1)
		System.out.println("\n\nall three cards have same suit");
		else if(c==0 && d==1)
			System.out.println("\n\ntwo cards have same suit");
		else if(c==0 && d==0)
		System.out.println("\n\nall cards have different suit");
		}
		public Card dealCard()
		{
			if(currentCard<deck.length)
				return deck[currentCard++];
			else
				return null;
			
			
		}
		
		
		
		
	}

	
	
	
