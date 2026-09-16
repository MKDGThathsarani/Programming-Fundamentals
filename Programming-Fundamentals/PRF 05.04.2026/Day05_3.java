import java.util.*;
class Day05_3{
	
	public static void TotalValue(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter num1: ");
		int num1 = input.nextInt();
		
		
		System.out.print("Enter num2: ");
		int num2 = input.nextInt();
		
		int total = num1 + num2;
		
		System.out.println("Total of "+num1+" and " +num2+" => " + total);
	}
	
	public static void main(String args[]){
		TotalValue();
		
		TotalValue();
		
		TotalValue();
		
		
	}
}  
