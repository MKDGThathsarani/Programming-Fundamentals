import java.util.*;
class Example{
	public static void printTotal(int a, int b){
		// --------------- Process ---------------------
		int total = a + b;
		return total;
	}
	
	public static void main(String args[]){
		// --------------- Input ---------------------
		Scanner input = new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1 = input.nextInt();
		System.out.print("Enter num2: ");
		int num2 = input.nextInt();
		
		printTotal(num1, num2);
		
		// --------------- Output ---------------------
		System.out.println("Total of "+num1+" and " +num2+" => " + total);
	}
}
