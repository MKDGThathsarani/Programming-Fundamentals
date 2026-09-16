import java.util.Scanner;
import java.util.*; // import statement

class Revisition1{
	public static void main(String args[]){
		Random r = new Random(); // Random numbers
		Scanner input = new Scanner(System.in); // User input
		
		int rNum = r.nextInt(100);
		int attempts = 0;
		while(true){
			System.out.print("Guess the number [0, 100): ");
			int guess = input.nextInt();
			
			if(rNum == guess) {
				break;
			}
			
			if(rNum > guess) {
				System.out.println("Higher");
			} else {
				System.out.println("Lower");
			}
			attempts++;
		}
		System.out.println("Congratulations! Correct guess with "+(attempts + 1)+" attempts.");
	}
}
