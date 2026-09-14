import java.util.Scanner;

class Q4{
	
	public static void main (String args []){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Unit Prise : ");
		int unitPrise = scanner.nextInt();
		
		
		System.out.print("Enter Amount of a Product : ");
		int amountOfProduct = scanner.nextInt();
		
		int  totle = unitPrise * amountOfProduct;
		
		System.out.println("Your Totle Prise : " + totle);
		
		System.out.println();
		
		if (totle > 1500){
			System.out.println("You are entitled to the super draw.Otherwise, display");
			}else{
				System.out.println("No discount given");
				}
		}
	
	}
