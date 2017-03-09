import java.util.Arrays;

public class Hand 
{
	private Card[] theCards;
	private int cardCount;
	
	public Hand()
	{
		this.theCards = new Card[52];
		this.cardCount = 0;
	}
	
	public void addCard(Card c)
	{
		this.theCards[this.cardCount] = c;
		this.cardCount++;
	}
	
	private void showValues()
	{
		int[] values = new int[20];
		for(int i = 0; i < values.length; i++)
		{
			values[i] = 0;
		}
		int numValues = 1;
		for(int i = 0; i < this.cardCount; i++)
		{
			if(this.theCards[i].getValue() == 11)
			{
				//we have an ace, do something special
				//duplicate current values
				int[] temp = new int[numValues];
				for(int j = 0; j < numValues; j++)
				{
					temp[j] = values[j];
				}
				
				//add 1 to current values
				for(int j = 0; j < numValues; j++)
				{
					values[j] = values[j] + 1;
				}
				
				//add 11 to the duplicates
				for(int j = 0; j < temp.length; j++)
				{
					temp[j] = temp[j] + 11;
				}
				
				//tack the duplicates onto the end of values
				//and update numValues
				int indexOfValues = numValues;
				for(int j = 0; j < temp.length; j++)
				{
					values[indexOfValues] = temp[j];
					indexOfValues++;
				}
				numValues = numValues + temp.length;
			}
			else
			{
				for(int j = 0; j < numValues; j++)
				{
					values[j] = values[j] + this.theCards[i].getValue();
				}
			}
		}
		
		//display the possible values
		int numShown = 0;
		Arrays.sort(values, 0, numValues);
		System.out.println("***** Hand Values *****");
		for(int i = 0; i < numValues; i++)
		{
			if(values[i] <= 21)
			{
				numShown++;
				System.out.print(values[i] + "\t");
			}
		}
		if(numShown == 0)
		{
			System.out.print("*** BUSTED ***");
		}
		System.out.println("");
	}
	
	public void display()
	{
		for(int i = 0; i < this.cardCount; i++)
		{
			this.theCards[i].display();
		}
		this.showValues();
	}
}
