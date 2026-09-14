import java.util.Scanner;
public class Calculater{
	static Scanner scanner = new Scanner(System.in);
	
	public static void main (String [] args){
		for(;;){
			System.out.println("=".repeat(100));
			System.out.println("\t\t Calculater");
			System.out.println("=".repeat(100));
			System.out.println("[01] Addition");
			System.out.println("[02] Subtraction");
			System.out.println("[03] Division");
			System.out.println("[04] Multiplication");
			System.out.println("[05] Exit");
			System.out.println("\b");
			System.out.print("Enter an option to continue -> ");
			int option = scanner.nextInt();
			
			switch(option){
				case 1:
					addition();
					break;
				case 2:
					subtraction();
					break;
				case 3:
					division();
					break;
				case 4:
					multiplication();
					break;
				case 5:
					System.out.println("Exit the System");
					return;
					
				default :
					System.out.println("Invalid the number");	
				}
			}
	}
			
			public static void addition(){
				System.out.println("=".repeat(100));
				System.out.println("\t\t Addition");
				System.out.println("=".repeat(100));
				
				System.out.print("Enter Your First Number : ");
				int num1 = scanner.nextInt();
				
				System.out.print("Enter Your Second Number : ");
				int num2 = scanner.nextInt();
				
				int add = num1 + num2;
				
				System.out.print("Addition of enter numbers : " + add);
				
				
				
				}
			
			public static void subtraction(){
				System.out.println("=".repeat(100));
				System.out.println("\t\t Subtraction");
				System.out.println("=".repeat(100));
				
				System.out.print("Enter Your First Number : ");
				int num1 = scanner.nextInt();
				
				System.out.print("Enter Your Second Number : ");
				int num2 = scanner.nextInt();
				
				int sub = num1 - num2;
				
				System.out.print("subtraction of enter numbers : " + sub);
				}
			
			public static void division(){
				System.out.println("=".repeat(100));
				System.out.println("\t\t Division");
				System.out.println("=".repeat(100));
				
				System.out.print("Enter Your First Number : ");
				double num1 = scanner.nextDouble();
				
				System.out.print("Enter Your Second Number : ");
				double num2 = scanner.nextDouble();
				
				double div = num1 / num2;
				
				System.out.print("subtraction of enter numbers : " + div);
				
				}
			
			public static void multiplication(){
				System.out.println("=".repeat(100));
				System.out.println("\t\t Multiplication");
				System.out.println("=".repeat(100));
				
				System.out.print("Enter Your First Number : ");
				int num1 = scanner.nextInt();
				
				System.out.print("Enter Your Second Number : ");
				int num2 = scanner.nextInt();
				
				int mul = num1 * num2;
				
				System.out.print("subtraction of enter numbers : " + mul);
				
				}
	
	
	
}


