
public class Card 
{
	private String displayName;
	private String displaySuit;
	private int value;
	
	public Card(String displayName, String displaySuit, int value)
	{
		this.displayName = displayName;
		this.displaySuit = displaySuit;
		this.value = value;
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public void display()
	{
		System.out.println(this.displayName + " of " + this.displaySuit + "(" + this.value + ")");
	}
}
