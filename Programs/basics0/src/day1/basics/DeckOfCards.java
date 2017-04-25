package day1.basics;

import java.util.Random;

public class DeckOfCards {

	private Card[] deck;
	private int currentCard;
	
	private static final int max_num=52;
	Random R = new Random();
	
	public DeckOfCards()
	{
		
		String[] faces = {"ACE","DEUCE","THREE","FOUR","FIVE","SIX","SEVEN",
				"EIGHT","NINE","TEN","JACK","QUEEN","KING"};
		
		String[] suits = {"HEARTS","DIAMONDS","CLUBS","SPADES"};
		
		deck = new Card[max_num];
		
		
		for(int count=0;count<deck.length;count++)
			
			deck[count]=new Card(faces[count%13],suits[count/13]);
		
		}
	
	public void shuffle()
	{
		
		
		int currentCard=0;
		for(int first=0;first<deck.length;first++)
			
		{
			
			int second  =  R.nextInt(max_num); 
			
			Card temp = deck[first];
			deck[second]=deck[first];
			deck[first]=temp;
			
			
		}
		
	}
		public Card dealCard()
		{
			
			if(currentCard < deck.length)
				return deck[currentCard++];
			else 
				return null;
			
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	

