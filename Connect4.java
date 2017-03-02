import java.util.Scanner;

public class Connect4 
{
	private C4Board theBoard;
	private char currMove;
	private int numMoves;
	
	public Connect4()
	{
		this.theBoard = new C4Board();
		this.currMove = 'R';
		this.numMoves = 0;
	}
	
	public void play()
	{
		Scanner input = new Scanner(System.in);
		while(this.theBoard.isWinner() == false && this.theBoard.isTie(this.numMoves) == false)
		{
			this.theBoard.display();
			System.out.print("Which column: ");
			int col = input.nextInt();
			if(this.theBoard.makeMove(col, this.currMove))
			{
				this.numMoves++;
				if(this.currMove == 'R')
				{
					this.currMove = 'B';
				}
				else
				{
					this.currMove = 'R';
				}
			}
		}
		
		//we know there is either a winner or a tie
		if(this.theBoard.isTie(this.numMoves))
		{
			System.out.println("Tie Game");
		}
		else
		{
			System.out.println("Winner!!!");
		}
	}
}
