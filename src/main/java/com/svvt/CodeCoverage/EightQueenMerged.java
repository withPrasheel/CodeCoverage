package com.svvt.CodeCoverage;

import java.util.Arrays;
import java.util.ArrayList;

public class EightQueenMerged {

	public  boolean queensAreSafe(char[][] board) {
		char[] validChars = { 'q', '.' };
		assert (board != null) && (board.length > 0) && isSquare(board) && onlyContains(board, validChars)
				: "Violation of precondition: queensAreSafe";

		return true;
	}

	public  ArrayList<char[][]> getAllNQueens(int size) {
		ArrayList<char[][]> solutions = new ArrayList<char[][]>();
		char[][] board = blankBoard(size);
		solveAllNQueens(board, 0, solutions);
		return solutions;
	}

	public  void solveAllNQueens(char[][] board, int col, ArrayList<char[][]> solutions) {
		// am I done? if so, add this solution to the ArrayList of solutions
		if (col == board.length) {
			solutions.add(makeCopy(board));
			// all done
		} else {
			for (int row = 0; row < board.length; row++) {
				// place queen
				board[row][col] = 'q';
				if (queensAreSafe(board))
					// if safe go on to next column
					solveAllNQueens(board, col + 1, solutions);
				board[row][col] = '.';
			}
		}
	}

	// pre: mat != null, mat is rectangular
	public  char[][] makeCopy(char[][] mat) {
		assert mat != null;
		char[][] copy = new char[mat.length][mat[0].length];
		for (int r = 0; r < mat.length; r++)
			for (int c = 0; c < mat[0].length; c++)
				copy[r][c] = mat[r][c];
		return copy;
	}


	public  void solveNQueens(int n) {
		char[][] board = blankBoard(n);
		// start in column 0
		boolean solved = canSolve(board, 0);
		if (solved) {
			System.out.println("Solved the " + n + " queen problem.");
//			printBoard(board);
		} else
			System.out.println("Can't solve the " + n + " queen problem.");
	}

	public  boolean canSolve(char[][] board, int col) {

		// know when you are done!
		if (col == board.length)
			return true; // solved!!!!!

		// not done, try all the rows
		boolean solved = false;
		for (int row = 0; row < board.length && !solved; row++) {
			// System.out.println(row + " " + col);
			// place queen
			board[row][col] = 'q';
			if (queensAreSafe(board))
				solved = canSolve(board, col + 1);
			if (!solved)
				board[row][col] = '.';
		}
		return solved; // could be true(solved) or false(not solved)!!
	}

	private  char[][] blankBoard(int size) {
		char[][] result = new char[size][size];
		for (int r = 0; r < size; r++)
			Arrays.fill(result[r], '.');
		return result;
	}

	private  boolean inbounds(int row, int col, char[][] mat) {
		return row >= 0 && row < mat.length && col >= 0 && col < mat[0].length;
	}

	/*
	 * pre: mat != null post: return true if mat is a square matrix, false otherwise
	 */
	private  boolean isSquare(char[][] mat) {
		assert mat != null : "Violation of precondition: isSquare";

		final int numRows = mat.length;
		int row = 0;
		boolean square = true;
		while (square && row < numRows) {
			square = (mat[row] != null) && (mat[row].length == numRows);
			row++;
		}
		return square;
	}

	/*
	 * pre: mat != null, valid != null post: return true if all elements in mat are
	 * one of the characters in valid
	 */
	private  boolean onlyContains(char[][] mat, char[] valid) {
		assert mat != null && valid != null : "Violation of precondition: onlyContains";

		int row = 0;
		int col;
		boolean correct = true;
		while (correct && row < mat.length) {
			col = 0;
			while (correct && col < mat[row].length) {
				correct = contains(valid, mat[row][col]);
				col++;
			}
			row++;
		}
		return correct;
	}

	/*
	 * pre: list != null post: return true if c is in list
	 */
	private  boolean contains(char[] list, char c) {
		assert (list != null) : "Violation of precondition: contains";

		boolean found = false;
		int index = 0;
		while (!found && index < list.length) {
			found = list[index] == c;
			index++;
		}
		return found;
	}

}
