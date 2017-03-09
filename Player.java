
public class Player
{
	private Hand theHand;
	
	public Player()
	{
		this.theHand = new Hand();
	}
	
	public void takeCard(Card c)
	{
		this.theHand.addCard(c);
	}
	
	public void showHand()
	{
		this.theHand.display();
	}
}
