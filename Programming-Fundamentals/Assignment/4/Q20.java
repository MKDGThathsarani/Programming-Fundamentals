import java.util.Scanner;

class Q20{
	
	public static void main(String [] args ){
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("Enter your number : ");
		int num = scanner.nextInt();
		
		if(num > 0){
			System.out.print("Positive Integer");
			}
			else if(num == 0){
				System.out.print("Zero");
				}
				else{
					System.out.println("Negative Integer");
					}
		
		}
	
	}
