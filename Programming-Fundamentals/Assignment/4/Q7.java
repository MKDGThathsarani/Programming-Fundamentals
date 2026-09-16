import java.util.Scanner;

class Q7{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your First Number : ");
		int a = scanner.nextInt();
		
		System.out.print("Enter your Second Number : ");
		int b = scanner.nextInt();
		
		System.out.print("Enter your Second Number : ");
		int c = scanner.nextInt();
		
		int maxNum = Math.max(a, Math.max(b,c));
		System.out.print("Maximum number is: " + maxNum);
		
		scanner.close();
		
		}
	
	
	
	
	}
