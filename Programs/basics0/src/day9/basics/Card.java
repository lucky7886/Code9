package day9.basics;

public class Card {
	String suit;
	String face;
	public Card(String cardSuit,String cardFace)
	{
		suit=cardSuit;
		face=cardFace;
		
	}
	public String toString()
{
		return face+ " of "+suit; 
}
}
