import java.util.Scanner;

class Q23{
	
	public static void main(String [] args ){
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Enter your First number : ");
		int oneNum = scanner.nextInt();
		
		System.out.print("Enter your First number : ");
		int twoNum = scanner.nextInt();
		
		if(oneNum > twoNum){
			System.out.print("The first number is greater than the second number");
			}
			else if(oneNum == twoNum){
				System.out.print("Both are equal");
				}
				else{
					System.out.println("The first number is less than the second number");
					}
		
		}
	
	}

