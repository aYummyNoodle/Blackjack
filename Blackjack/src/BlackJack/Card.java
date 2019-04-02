package BlackJack;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


public abstract class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

  	//constructors
	
	public Card()
	{
	}
	
	public Card(String cardSuit, int cardFace)
	{
		suit = cardSuit;
		face = cardFace;
	}
	
	// modifiers
	
	public void setSuit(String cardSuit)
	{
		suit = cardSuit;
	}
	
	public void setFace(int cardFace)
	{
		face = cardFace;
	}

  	//accessors
	
	public String getSuit()
	{
		return suit;
	}
	
	public int getFace()
	{
		return face;
	}




  	public abstract int getValue();

	public boolean equals(Object obj)
	{
		return obj.toString().equals(this.toString());
	}

  	//toString
	
	public String toString()
	{
		return FACES[face] + " of " + getSuit() + " | value = " + getValue();
	}
  	
 }