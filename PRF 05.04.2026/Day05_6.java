import java.util.*;
class Day05_6{
	
	public static int reverse(int number) {
		int reversedNumber = 0;
		while(number != 0){
			reversedNumber = reversedNumber * 10 + (number % 10);
			number /= 10;
		}
		
		return reversedNumber;
	}
	
	public static void main(String args[]){
		// --------------- Input ---------------------
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		System.out.println("Reversed value of " + num + " => " + reverse(num));
	}
}


