package BlackJack;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


public class Dealer extends AbstractPlayer
{
	private Deck d;
	
	public Dealer()
	{
		super();
		d = new Deck();
	}
	
	public void shuffle()
	{
		d.shuffle();
	}
	
	public Card deal()
	{
		return d.nextCard();
	}
	
	public boolean hit()
	{
		return getHandValue() == 21;
	}
}