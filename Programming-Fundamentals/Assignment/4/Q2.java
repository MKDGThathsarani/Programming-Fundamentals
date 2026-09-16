import java.util.Scanner;

class Q2{
	
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
			System.out.print("Enter your number: ");
			int intNum = scanner.nextInt();
			
			int number = Math.abs(intNum);
			
			System.out.print("your number : " + number);
	
		}
	}
