public class TurnOffTheLights {
	private boolean gameOver; // flag to record if the game is over
	private int playerTurn; // whose turn it is
	private int winner; // who the winner is (0 if no winner)
	private int cols, rows; // # of rows and cols in game
	private int[][] grid; // the grid that stores the pieces

	// The constructor initializes the game
	public TurnOffTheLights(int r, int c) {
		// Create the board
		this.cols = c;
		this.rows = r;
		grid = new int[r][c];

		// Initialize starting positions
		grid[0][0] = 1;

		// Set that the game is not over
		gameOver = false;
	}

	/*
	 * Return true if r, c is a valid move for the game.
	 */
	public boolean isValidMove(int r, int c) {
		if (isInGrid(r, c) == false) // if outside grid, not valid
			return false;

		return true; // otherwise it's valid
	}

	/*
	 * Return true if the location at row, col is in the bounds of the grid.
	 * Return false otherwise.
	 */
	public boolean isInGrid(int row, int col) {
		/* you create this method */
		return true;
	}

	/*
	 * Return true if the location l is in the bounds of the grid. Note: this
	 * method calls the other isInGrid to do the work.
	 */
	public boolean isInGrid(Location l) {
		return isInGrid(l.getRow(), l.getCol());
	}

	// makes the move
	// returns false if no move was made, true if the move was successful.
	public boolean move(int r, int c) {
		if (isValidMove(r, c) == false)
			return false; // if not valid, exit
		if (gameOver == true)
			return false; // if game is over, exit

		/* Make the move by changing what you need to change in grid */

		// check for the winner
		gameOver = checkForWinner();

		return true; // this means the move was successfully made
	}

	/*
	 * Return true if the game is over. False otherwise.
	 */
	private boolean checkForWinner() {
		// Loop through all locations. If you see a light on, return false because
		// the game isn't over.
		
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				/* you fill this in */
			}
		}
		return true;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public int[][] getGrid() {
		return grid;
	}
}