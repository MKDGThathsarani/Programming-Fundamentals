import java.util.Scanner;

class my {
    private static Scanner scanner = new Scanner(System.in);
     // FIXED: Moved outside main method
    private static void displayMainMenu() {    
        System.out.println("			  	 __  _____  ________ _______");
        System.out.println("				|  \\/     \\|        |       \\");
        System.out.println("				  \\$|  $$$$| $$$$$$$$\\$$$$$$$");
        System.out.println("				|   | $$ \\$| $$__      | $$");
        System.out.println("				|  $| $$   | $$  \\     | $$");
        System.out.println("				|  $| $$  _| $$$$$     | $$");
        System.out.println("				|  $| $$_/ | $$_____   | $$");
        System.out.println("				|  $\\$$   $| $$     \\  | $$");
        System.out.println("				 \\$$|\\$$$$$ \\$$$$$$$$   \\$$");
        System.out.println("\n\n\n");
        System.out.println(" _______         __    __    _____            _        _____   _    _   _               _______   ____    _____                ");
        System.out.println("|__   __| /\\     \\ \\  / /   / ____|    /\\    | |      / ____| | |  | | | |         /\\  |__   __| / __ \\  |  _  \\        ");
        System.out.println("   | |   /  \\     \\ \\/ /   | |        /  \\   | |     | |      | |  | | | |        /  \\    | |   | |  | | | |_|  |         ");
        System.out.println("   | |  / /\\ \\     >  <    | |       / /\\ \\  | |     | |      | |  | | | |       / /\\ \\   | |   | |  | | |  _  /         ");
        System.out.println("   | | / ___  \\   /  . \\   | |____  / ___  \\ | |____ | |____  | |__| | | |____  / ___  \\  | |   | |__| | | | \\ \\         ");
        System.out.println("   |_|/_/   \\__\\ /__/\\__\\   \\_____|/_/   \\__\\|______| \\_____|  \\____/  |______|/_/   \\__\\ |_|    \\____/  |_|  \\_\\");
        System.out.println("=".repeat(115));
        System.out.println("\n");
        System.out.println("		[1] Withholding Tax");
        System.out.println("		[2] Payable Tax");
        System.out.println("		[3] Income Tax");
        System.out.println("		[4] Social Security Contribution Levy (SSCL) Tax");
        System.out.println("		[5] Leasing Payment");
        System.out.println("		[6] Exit");
        System.out.println("\n");
		System.out.print("Enter  an Option to Continue : ");
}
    
    public static void main(String[] args) {
		//boolean running = true;
		
		
		
		//while(running){
		for(;;){
			   clearConsole();
			   displayMainMenu();
			   int choice = scanner.nextInt();
       
       switch(choice){
		   case 1:
				withholdingTax();
				break;
           
           case 2: 
				payableTax();
				break;
            
           case 3:
				incomeTax();
				break;
            
           case 4: 
				ssclTax();
				break;
            
           case 5: 
				leasingPayment();
				break;
            
           case 6: 
				exit();
				break;
            
           default:
				System.out.println("Invalid option. Try again.");
		 }  
	 }
   }
   
   public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            for (int i = 0; i < 50; i++) System.out.println();
        }
    }
   
	public static void withholdingTax(){
	   clearConsole();
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   
	   for(;;){
		   	   System.out.println("+" + "-".repeat(115) + "+");
			   System.out.println("|                                                     WITHHOLDING TAX                                               |");
			   System.out.println("+" + "-".repeat(115) + "+");
			   
			   System.out.println("		[1] Rent Tax");
			   System.out.println("		[2] Bank Interest Tax");
			   System.out.println("		[3] Dividend Tax");
			   System.out.println("		[4] Exit");
			   System.out.println("\n");
			   System.out.print("Enter  an Option to Continue : ");
			   
			   int choice = scanner.nextInt();
			   
				switch(choice){
				   case 1:
						rentTax();
						break;
				   
				   case 2: 
						bankInterestTax();
						break;
					
				   case 3:
						dividendTax();
						break;
					
				   case 4: 
						return;
						
				   default:
						System.out.println("Invalid option. Try again.");
					}    
		   }
	}
			
			public static void rentTax(){
				
				Scanner scanner = new Scanner(System.in);
				
				clearConsole();
				System.out.println("+" + "-".repeat(115) + "+");
				System.out.println("|                                                       RENT TAX                                                 |");
				System.out.println("+" + "-".repeat(115) + "+");
				System.out.println("\n");
				
				System.out.print("Enter your salaray : ");
				double salary = scanner.nextDouble();
				
				if (salary < 0){
					System.out.println("Invalid Input");
					}
				
				
				if(salary <= 100000){
					System.out.println("You dont have to pay rent tax...");
					} else{
						double tax = (salary * 0.10)/2;
						System.out.println("Rent tax      " + tax);
						}
				
				System.out.print("Do you want to calculate the another rent tax (Y/N)... ");
				char value = scanner.next().charAt(0);
				
				//String name = scanner.nextLine();
				
				if(value == 'y' || value == 'Y'){
					rentTax();
					
					}else{
						withholdingTax();
						
						}	
			}
				
			public static void bankInterestTax(){
				
				Scanner scanner = new Scanner(System.in);
				
				clearConsole();
				
				System.out.println("+" + "-".repeat(115) + "+");
				System.out.println("|                                                       BANK INTEREST TAX                                                 |");
				System.out.println("+" + "-".repeat(115) + "+");
				System.out.println("\n");
				
				System.out.print("	Enter your bank interest per year  : ");
				double interst = scanner.nextDouble();
				
				double tax = interst * 0.05;
				System.out.println("	You have to pay Bank Interst Per Year : " + tax);
					
				System.out.println("\n\n");
					
				System.out.print("Do you want to calculate another Bank Interst Tax (Y/N) : ");
				char value = scanner.next().charAt(0);
				
				if (value == 'y' || value == 'Y'){
					bankInterestTax();
					}else{
						displayMainMenu();
						}
			}
				
			public static void dividendTax(){
				
				Scanner scanner = new Scanner(System.in);
				
				clearConsole();
				
				System.out.println("+" + "-".repeat(115) + "+");
				System.out.println("|                                                       DIVIDEND TAX                                                 |");
				System.out.println("+" + "-".repeat(115) + "+");
				System.out.println("\n");
				
				System.out.print("	Enter your Total dividend Tax per year : ");
				double dividend = scanner.nextDouble();
				
				if(dividend <= 100000){
					System.out.println("You don't have to pay Dividend Tax : ");
				}else{
					double tax = dividend * 0.14;
					System.out.print("You have to pay Dividend Tac per year : " + tax);
					}
					
				System.out.println("Do you want to calculate another Dividend Tax (Y/N) : ");
				char value = scanner.next().charAt(0);
				
				if (value == 'Y' || value == 'y'){
					dividendTax();
					}else{
						displayMainMenu();
						}
				
			}
				

			
			public static void payableTax(){
	   clearConsole();
	   System.out.println("+" + "-".repeat(115) + "+");
	   System.out.println("|                                                       PAYABLE TAX                                                 |");
	   System.out.println("+" + "-".repeat(115) + "+");
	   scanner.nextLine();
       scanner.nextLine();
   }
   
   public static void incomeTax(){
	   clearConsole();
	   System.out.println("+" + "-".repeat(115) + "+");
	   System.out.println("|                                                     INCOME TAX                                                    |");
	   System.out.println("+" + "-".repeat(115) + "+");
	   scanner.nextLine();
       scanner.nextLine();
   }
   
   public static void ssclTax(){
	   clearConsole();
	   System.out.println("+" + "-".repeat(115) + "+");
	   System.out.println("|                                   SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX                                     |");
	   System.out.println("+" + "-".repeat(115) + "+");
	   scanner.nextLine();
       scanner.nextLine();
   }
   
   public static void leasingPayment(){
	   clearConsole();
	   
	   for(;;){
		   System.out.println("+" + "-".repeat(115) + "+");
	   System.out.println("|                                                     LEASING PAYMENT                                               |");
	   System.out.println("+" + "-".repeat(115) + "+");
	   
	   System.out.println("		[1] Calculate Monthly Installment");
       System.out.println("		[2] Search Leasing Category");
       System.out.println("		[3] Find Leasing Amount");
       System.out.println("		[4] Back to Main Menu");
       System.out.println("\n");
	   System.out.print("Enter  an Option to Continue : ");
	   
	   int choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("\n[Monthly Installment Calculation will be here]");
                break;
            case 2:
                System.out.println("\n[Leasing Category Search will be here]");
                break;
            case 3:
                System.out.println("\n[Leasing Amount Calculation will be here]");
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid option. Try again.");
			}
		}
   }
   
   public static void exit(){
	   System.out.println("Exiting Tax Calculator. Goodbye!");
	   }

   	   
}

			
				
   
   
   
