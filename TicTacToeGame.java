package Basics;

import java.util.Scanner;

public class TicTacToeGame {
	static char[] board;
	static char playersymbole;
	static char computersymbole;

	public static void welcomemessage() {
		System.out.println("" + "    ##     ## ###### ##     ###### ###### ###   ### ######\r\n"
				+ " *  ##     ## ##     ##     ##     ##  ## ## # # ## ##      *\r\n"
				+ "*** ##  #  ## #####  ##     ##     ##  ## ##  #  ## #####  ***\r\n"
				+ " *  ## # # ## ##     ##     ##     ##  ## ##     ## ##      *\r\n"
				+ "    ###   ### ###### ###### ###### ###### ##     ## ###### \r\n"
				+ "---------------------TIK TAC TOE GAME-----------------------\r\n");
	}

	public static void symbolechoice() {
		System.out.print("Enter Player Symbole choice:\n-O\n-X\n");
		Scanner sc = new Scanner(System.in);
		char playerchoice = sc.next().charAt(0);
		switch (playerchoice) {
		case 'O':
			playersymbole = 'O';
			computersymbole = 'X';
			break;
		case 'X':
			playersymbole = 'X';
			computersymbole = 'O';
			break;
		default:
			System.out.println("Enter Valid choice");

		}
	}

	public static void main(String[] args) {
		welcomemessage();
		board = new char[10];
		symbolechoice();
		System.out.println("Player symbole-" + playersymbole);
		System.out.println("Computer symbole-" + computersymbole);

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
