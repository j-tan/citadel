package citadel;

import java.util.*;

/**
 * The Board object represents the board and associated attributes 
 * and behaviours.
 */
public class Board {
    private String[][] boardArray;

    /**
     * Initializes and fills the board with empty characters.
     */
    public Board() {
        boardArray = new String[10][10];
        for (int row=0; row < boardArray.length; row++) {
            for (int col=0; col < boardArray[0].length; col++) {
                boardArray[row][col] = "|_|";
            }
        }
    }

    /**
     * Returns the string representation of the board in its current 
     * state.
     *
     * @return a string representing the board
     */
    public String toString() {
        String finalString = "";
        for (int row=0; row < boardArray.length; row++) {
            for (int col=0; col < boardArray[0].length; col++) {
                finalString += boardArray[row][col];
            }
            finalString += System.getProperty("line.separator");
        }
        return finalString;
    }

    /**
     * Sets the initial attacker/defender boundary on the board, 
     * delineated by the "|#|" symbol. The bottom argument must be
     * larger than the top argument, and the right argument must be 
     * larger than the left argument.
     *
     * @param top the top boundary counting from the top of the board 
     * counted using 1-based numbering
     * @param left the left boundary counting from the left of the 
     * board counted using 1-based numbering
     * @param bottom the bottom boundary counting from the bottom of 
     * the board counted using 1-based numbering
     * @param right the right boundary counting from the right of the 
     * board counted using 1-based numbering
     */
    public void setBoundary(int top, int left, int bottom, int right) {
        for (int row=0; row < boardArray.length; row++) {
            for (int col=0; col < boardArray[0].length; col++) {
                if (row == (top-1) || row == (bottom-1)) {
                    if (col >= (left-1) && col <= (right-1)) {
                        boardArray[row][col] = "|#|";
                    }
                }
                
                if (col == (left-1) || col == (right-1)) {
                    if (row >= (top-1) && row <= (bottom-1)) {
                        boardArray[row][col] = "|#|";
                    }
                }
            }
        }
    }
}
