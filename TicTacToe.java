import java.util.Scanner;

public class TicTacToe 
{
	private Board theBoard;
	private char currMove;
	public TicTacToe()
	{
		this.theBoard = new Board();
		this.currMove = 'X';
	}
	
	public void play()
	{
		Scanner input = new Scanner(System.in);
		while(this.theBoard.isWinner() == false)
		{
			this.theBoard.display();
			System.out.print("Pick a Row:");
			int row = input.nextInt();
			System.out.print("Pick a Column:");
			int col = input.nextInt();
			this.makeMove(row, col);
		}	
		System.out.println("WINNER!!!!!");
	}
	
	private boolean makeMove(int row, int col)
	{
		if(this.theBoard.makeMove(row, col, this.currMove))
		{
			if(this.currMove == 'X')
			{
				this.currMove = 'O';
			}
			else
			{
				this.currMove = 'X';
			}
			return true;
		}
		else
		{
			System.err.println("Illegal Move!");
			return false;
		}
	}
}
