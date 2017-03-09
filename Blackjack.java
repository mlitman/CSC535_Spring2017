import java.util.Scanner;

public class Blackjack 
{
	private Dealer theDealer;
	private Player thePlayer;
	
	public Blackjack()
	{
		this.theDealer = new Dealer();
		this.thePlayer = new Player();
	}
	
	public void play()
	{
		this.theDealer.shuffle();
		this.thePlayer.takeCard(this.theDealer.deal());
		this.thePlayer.takeCard(this.theDealer.deal());
		Scanner input = new Scanner(System.in);
		while(true)
		{
			this.thePlayer.showHand();
			System.out.print("Do you want another card? (Y/N) ");
			String answer = input.next();
			if(answer.equalsIgnoreCase("Y"))
			{
				this.thePlayer.takeCard(this.theDealer.deal());
			}
			else
			{
				break;
			}
		}
	}
}
