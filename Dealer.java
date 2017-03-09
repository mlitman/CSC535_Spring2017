
public class Dealer 
{
	private Deck theDeck;
	
	public Dealer()
	{
		this.theDeck = new Deck();
	}
	
	public void shuffle()
	{
		this.theDeck.shuffle();
	}
	
	public Card deal()
	{
		return this.theDeck.getTop();
	}
}
