import java.util.*;
class Day05_2{
   public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		
		
		L1:while(true) {
			System.out.println("Enter 1 for DecimalToBinary");
			System.out.println("Enter 2 for DecimalToOctal");
			System.out.println("Enter 3 for DecimalToHexa");
			System.out.println("Enter 99 to Exit");
			
			System.out.print("Select the converter: ");
			int option = input.nextInt();
			
			switch(option) {
				case 1:
					while(true){
						System.out.println("--------------------------");
						System.out.println("DecimalToBinary Converter");
						System.out.println("--------------------------");
						System.out.println("Enter 0 to Back");
						System.out.println("Enter 99 to Exit");
						System.out.print("Select the action: ");
						int action = input.nextInt();
						
						if(action == 0) {
							continue L1;
						} else if (action == 99) {
							return;
						} else {
							System.out.println("Invalid Input...");
						}
					}
				case 2:
				while(true){
						System.out.println("--------------------------");
						System.out.println("DecimalToOctal Converter");
						System.out.println("--------------------------");
						System.out.println("Enter 0 to Back");
						System.out.println("Enter 99 to Exit");
						System.out.print("Select the action: ");
						int action = input.nextInt();
						
						if(action == 0) {
							continue L1;
						} else if (action == 99) {
							return;
						} else {
							System.out.println("Invalid Input...");
						}
					}
				case 3:
				while(true){
						System.out.println("--------------------------");
						System.out.println("DecimalToHexa Converter");
						System.out.println("--------------------------");
						System.out.println("Enter 0 to Back");
						System.out.println("Enter 99 to Exit");
						System.out.print("Select the action: ");
						int action = input.nextInt();
						
						if(action == 0) {
							continue L1;
						} else if (action == 99) {
							return;
						} else {
							System.out.println("Invalid Input...");
						}
					}
				case 99:
					return;
				default:
					System.out.println("Invalid Input...");
			}
		}
	}
}    


