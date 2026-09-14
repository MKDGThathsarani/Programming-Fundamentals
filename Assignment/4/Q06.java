import java.util.Scanner;

class Q5{
	
	public static void main (String args []){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Unit Prise : ");
		int unitPrise = scanner.nextInt();
		
		
		System.out.print("Enter Amount of a Product : ");
		int amountOfProduct = scanner.nextInt();
		
		int  totle = unitPrise * amountOfProduct;
		
		System.out.println("Your Totle Prise : " + totle);
		System.out.println();
		
		if (totle > 500){
			double discount = totle * 0.05;
			double newTotle = totle - discount;
			
			System.out.println("Discount (5%) : " + discount);
            System.out.println("New Total after discount : " + newTotle);
			}else{
				System.out.println("No discount given");
				}
		}
	
	}

