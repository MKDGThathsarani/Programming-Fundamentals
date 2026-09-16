import java.util.*;

class Demo {
	
	static void printBoard(char[][] board){
		System.out.print("\033[H\033[2J");
		System.out.flush();

		System.out.println("================");
		System.out.println(Arrays.toString(board[0]));
		System.out.println(Arrays.toString(board[1]));
		System.out.println(Arrays.toString(board[2]));
		System.out.println("================");
	}

	static int checkWinner(char[][] board){
		if(
		(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') ||
		(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') ||
		(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') ||
		(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') || 
		(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') ||
		(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') ||
		(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') ||
		(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')){
			return 1;
		}
		
		if(
		(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') ||
		(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') ||
		(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') ||
		(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') || 
		(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') ||
		(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') ||
		(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') ||
		(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')){
			return 2;
		}
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char[][] board = new char[3][3];
		
		Arrays.fill(board[0], ' ');
		Arrays.fill(board[1], ' ');
		Arrays.fill(board[2], ' ');
		
		printBoard(board);
		
		int res = 0;
		
		for(int i=0; i<4; i++){
			// User 1 Input
			System.out.print("User 1(X): ");
			int xI = input.nextInt();
			
			board[xI/10][xI%10] = 'X';
			
			printBoard(board);
			
			res = checkWinner(board);
			if(res != 0) {
				break;
			}
			
			// User 2 Input
			System.out.print("User 2(O): ");
			int oI = input.nextInt();
			
			board[oI/10][oI%10] = 'O';
			
			printBoard(board);
			
			res = checkWinner(board);
			if(res != 0) {
				break;
			}
		}
		
		if(res == 1) {
			System.out.println("The Winner is User 1(X)");
		} else if(res == 2) {
			System.out.println("The Winner is User 2(O)");
		} else {
			System.out.println("Draw!!!");
		}	
    }
}

