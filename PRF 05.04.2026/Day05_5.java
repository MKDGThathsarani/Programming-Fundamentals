import java.util.*;
class Day05_5{
	public static int factorial(int n) {
		int fact = 1;
		for(int i=n; i > 0; i--){
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String args[]){
		// --------------- Input ---------------------
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		int fact = factorial(num);
		
		System.out.println(num + "! = " + fact);
	}
}


// Factorial => 5! = 5*4*3*2*1 = 120
// 0! = 1;

