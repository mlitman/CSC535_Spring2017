
public class C4Board 
{
	private char[][] theBoard;
	private int maxMoves;
	
	public C4Board()
	{
		this.theBoard = new char[6][7];
		this.maxMoves = 6*7;
		for(int i = 0; i < this.theBoard.length; i++)
		{
			for(int j = 0; j < this.theBoard[i].length; j++)
			{
				this.theBoard[i][j] = '_';
			}
		}
	}
	
	public boolean isTie(int numMoves)
	{
		return numMoves == this.maxMoves;
	}
	
	private boolean isWinner(int row, int col)
	{
		char currColor = this.theBoard[row][col];
		if(currColor == '_')
		{
			return false;
		}
		else
		{
			int vertStreak = 1;
			int horizStreak = 1;
			int diag1Streak = 1;
			int diag2Streak = 1;
			
			//Vertical Winner
			//check above
			int currRow = row-1;
			while(currRow >= 0 && this.theBoard[currRow][col] == currColor)
			{
				vertStreak++;
				currRow--;
			}
			//check below
			currRow = row+1;
			while(currRow < this.theBoard.length && this.theBoard[currRow][col] == currColor)
			{
				vertStreak++;
				currRow++;
			}
			if(vertStreak >= 4)
			{
				return true;
			}
			
			//Horizontal Winner
			//check left
			int currCol = col-1;
			while(currCol >= 0 && this.theBoard[row][currCol] == currColor)
			{
				horizStreak++;
				currCol--;
			}
			//check right
			currCol = col+1;
			while(currCol < this.theBoard[0].length && this.theBoard[row][currCol] == currColor)
			{
				horizStreak++;
				currCol++;
			}
			
			if(horizStreak >= 4)
			{
				return true;
			}
			
			//Diagonal UpperLeft to LowerRight Winner
			//upper left
			currCol = col - 1;
			currRow = row - 1;
			while(currCol >= 0 && currRow >= 0 && this.theBoard[currRow][currCol] == currColor)
			{
				diag1Streak++;
				currCol--;
				currRow--;
			}
			//lower right
			currCol = col + 1;
			currRow = row + 1;
			while(currCol < this.theBoard[0].length && currRow < this.theBoard.length && this.theBoard[currRow][currCol] == currColor)
			{
				diag1Streak++;
				currCol++;
				currRow++;
			}
			
			if(diag1Streak >= 4)
			{
				return true;
			}
			
			//Diagonal LowerLeft to UpperRight Winner
			//lower left
			currCol = col - 1;
			currRow = row + 1;
			while(currCol >= 0 && currRow < this.theBoard.length && this.theBoard[currRow][currCol] == currColor)
			{
				diag2Streak++;
				currCol--;
				currRow++;
			}
			//upper right
			currCol = col + 1;
			currRow = row - 1;
			while(currCol < this.theBoard[0].length && currRow >= 0 && this.theBoard[currRow][currCol] == currColor)
			{
				diag2Streak++;
				currCol++;
				currRow--;
			}
			
			if(diag2Streak >= 4)
			{
				return true;
			}
			
			//No Winners Found
			return false;
		}
	}
	
	public boolean isWinner()
	{
		for(int row = 0; row < this.theBoard.length; row++)
		{
			for(int col = 0; col < this.theBoard[row].length; col++)
			{
				if(this.isWinner(row, col))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean makeMove(int col, char currMove)
	{
		int currRow = this.theBoard.length-1;
		while(currRow >= 0 && this.theBoard[currRow][col] != '_')
		{
			currRow--;
		}
		
		if(currRow == -1)
		{
			return false;
		}
		else
		{
			this.theBoard[currRow][col] = currMove;
			return true;
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
