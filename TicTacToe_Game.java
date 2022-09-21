package Basics;

public class TicTacToe_Game {
	static char[] board;

	

	public static void main(String[] args) {
		System.out.println("Welcome Tic Toe Game");
		board = new char[10];
		TicTacBoard();

	}
	public static void TicTacBoard() {
		System.out.println("|-----------|");
		System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
		System.out.println("|-----------|");
	}
}
