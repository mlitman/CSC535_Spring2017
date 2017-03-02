
public class Board 
{
	private char[][] theBoard;
	public Board()
	{
		this.theBoard = new char[3][3];
		for(int i = 0; i < this.theBoard.length; i++)
		{
			for(int j = 0; j < this.theBoard[i].length; j++)
			{
				this.theBoard[i][j] = '_';
			}
		}
	}
	
	public boolean isWinner()
	{
		boolean row1 = this.theBoard[0][0] != '_' && this.theBoard[0][0] == this.theBoard[0][1] && this.theBoard[0][0] == this.theBoard[0][2];
		boolean row2 = this.theBoard[1][0] != '_' && this.theBoard[1][0] == this.theBoard[1][1] && this.theBoard[1][0] == this.theBoard[1][2];
		boolean row3 = this.theBoard[2][0] != '_' && this.theBoard[2][0] == this.theBoard[2][1] && this.theBoard[2][0] == this.theBoard[2][2];
		boolean col1 = this.theBoard[0][0] != '_' && this.theBoard[0][0] == this.theBoard[1][0] && this.theBoard[0][0] == this.theBoard[2][0];
		boolean col2 = this.theBoard[0][1] != '_' && this.theBoard[0][1] == this.theBoard[1][1] && this.theBoard[0][1] == this.theBoard[2][1];
		boolean col3 = this.theBoard[0][2] != '_' && this.theBoard[0][2] == this.theBoard[1][2] && this.theBoard[0][2] == this.theBoard[2][2];
		boolean dia1 = this.theBoard[0][0] != '_' && this.theBoard[0][0] == this.theBoard[1][1] && this.theBoard[0][0] == this.theBoard[2][2];
		boolean dia2 = this.theBoard[2][0] != '_' && this.theBoard[2][0] == this.theBoard[1][1] && this.theBoard[2][0] == this.theBoard[0][2];
		return row1 || row2 || row3 || col1 || col2 || col3 || dia1 || dia2;
	}
	
	
	public boolean makeMove(int row, int col, char move)
	{
		if(this.theBoard[row][col] == '_')
		{
			this.theBoard[row][col] = move;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void display()
	{
		for(int i = 0; i < this.theBoard.length; i++)
		{
			for(int j = 0; j < this.theBoard[i].length; j++)
			{
				System.out.print(this.theBoard[i][j] + "\t");
			}
			System.out.println("\n\n");
		}
	}
}
