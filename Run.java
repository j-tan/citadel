package citadel;

import java.util.*;

/**
 * The Run class manages the game session. It is responsible for 
 * the initializing and ending of the game, as well as taking input 
 * from players and printing of the board to the console.
 */
public class Run {
	private enum Turn {ATTACKER, DEFENDER};
	private Turn currentTurn;
	private Board board;
	private String boardString;

	/**
	 * Initializes a new board and sets a boundary and initial player.
	 */
	public Run() {
		board = new Board();
		board.setBoundary(2, 2, 9, 9);
		boardString = board.toString();
		currentTurn = Turn.ATTACKER;
	}

	public void run() {
		while (!isGameEnd()) {
			printBoard(board.toString());
		}
	}

	private void printBoard(String boardString) {
		System.out.println(boardString);
	}

	private boolean isGameEnd() {
		return false;// change
	}
}
