import java.util.Scanner;
class SalaryInformationSystem{
	static Scanner scanner = new Scanner(System.in);
	public static void main(String [] args){
		System.out.println("-----------------------------------------");
		System.out.println("|        SALARY INFORMATION SYSTEM      |");
		System.out.println("-----------------------------------------");
		System.out.println("\n");
		System.out.println("\t [1] Calculate Income Tax");
		System.out.println("\t [2] Calculate Annual Bonus");
		System.out.println("\t [3] Calculate Loan Amount");
		System.out.println("\n");
		System.out.print("Enter an Option to continue > ");
		int option = scanner.nextInt();
		
		scanner.nextLine();
		
		switch (option){
			case 1:
				calculateincometax();
				break;
			case 2:
				calculateannualbonus();
				break;
			case 3:
				calculateloanamount();
				break;
			default:
				System.out.println("Invalid Option:");
			}
			
		}
		
		public static void calculateincometax(){
			System.out.println("-----------------------------------------");
			System.out.println("|        Calculate Income Tax           |");
			System.out.println("-----------------------------------------");
			System.out.println();
			
			System.out.print("Input Employee Name    -  ");
			String name = scanner.nextLine();
			
			System.out.print("Input Employee Salary  -  ");
			double salary = scanner.nextDouble();
			
			scanner.nextLine();
			
			double tax = 0;
			if(salary <= 100000){
				tax = 0;
				}
				else if(salary <= 141667){
					tax = (salary - 100000) * 0.06;
					}
					else if(salary <= 183333){
						tax = 2500 + (salary - 141667) * 0.12;
						}
						else if(salary <= 225000){
							tax = 7500 + (salary - 183333) * 0.18;
							}
							else if(salary <= 266667){
								tax = 15000 + (salary - 225000) * 0.24;
								}
								else if(salary <= 308333){
									tax = 25000 + (salary - 266667) * 0.30;
									}
									else {
										tax = 37500 + (salary - 308333) * 0.36;
										}
			System.out.println();
			System.out.println("You have to pay Income Tax Per Month : " + tax);
			}
		
		public static void calculateannualbonus(){
			System.out.println("-----------------------------------------");
			System.out.println("|        Calculate Annual Bonus         |");
			System.out.println("-----------------------------------------");
			System.out.println();
			
			System.out.print("Input Employee Name - ");
			String name = scanner.nextLine(); 
			
			System.out.print("Input Employee Salary - ");
			double salary = scanner.nextDouble();
			
			scanner.nextLine();
			
			double bonus = 0;
			if(salary <= 100000){
				bonus = 5000;
				}
				else if (salary <= 199999){
					bonus = salary * 0.1;
					}
					else if(salary <= 299999){
						bonus = salary  * 0.15;
						}
						else if (salary <= 399999){
							bonus = salary * 0.2;
							}
							else {
								bonus = salary * 0.35; 
								}
								
			System.out.println();
			System.out.println("Annual Bonus - " + bonus);
			
			}
			
		public static void calculateloanamount(){
			System.out.println("-----------------------------------------");
			System.out.println("|        Calculate Loan Amounnt         |");
			System.out.println("-----------------------------------------");
			
			System.out.print("Input Employee Name - ");
			String name = scanner.nextLine(); 
			
			System.out.print("Input Employee Salary - ");
			double salary = scanner.nextDouble();
			
			scanner.nextLine();
			
			
			}
		
	
	}
