import java.util.Scanner;
class TaxCalculaterSystem {
	public static void main(String args[]){
		Scanner scan = new Scanner (System.in);
		
		for(;;){
			System.out.println("======================================================");
			System.out.println("                       iCET                           ");
			System.out.println("                   Tax Calculator                     ");
			System.out.println("======================================================");
			
			System.out.println("\t[1] Withholding Tax ");
			System.out.println("\t[2]Pyabel Tax");
			System.out.println("\t[3]Income Tax");
			System.out.println("\t[4]Social Security Contribution levy (SSCL) Tax");
			System.out.println("\t[5]Leasing Payment");
			System.out.println("\t[6]Exit\n");
			
			System.out.print("Enter an option to Continue...");
			int option = scan.nextInt();
			
			if(option == 1){
				CalculateWithholdingTax();
				
				}else if(option == 2){
					CalculatePaybelTax();
					
					}else if(option == 3){
						CalculateIncomeTax();
						
						}else if(option == 4){
							CalculateSSCLtax();
							
							}else if(option == 5){
								CalculateLeasingTax();
							
								}else if(option == 6){
									break;
							
									}else{
										System.out.println("please enter the valid Option Number !..");
										
										}
										
			
			
			
			
			}
		
		}
		
		public static void CalculateWithholdingTax() {
			
			Scanner scan = new Scanner (System.in);
			
			for(;;){
			System.out.println("======================================================");
			System.out.println("                   Withholding Tax                    ");
			System.out.println("======================================================");
			
			System.out.println("\t[1] Rent tax ");
			System.out.println("\t [2]Bnak Interrest Tax");
			System.out.println("\t [3]Dividend Tax");
			System.out.println("\tExit");
			
			System.out.print("Enter an option to Continue...");
			int option = scan.nextInt();
			
			if(option == 1){
				CalculateRentTax();
				
				}else if(option == 2){
					CalculateInterestTax();
					
					}else if(option == 3){
						CalculateDividendTax();
						
						}else if(option == 4){
							break;
							
							}else{
								System.out.println("please enter the valid Option Number !..");
										
								}
			
		}
		
	
	}
	
	
	public static void CalculateRentTax(){
		
		Scanner scan = new Scanner (System.in);
		
		for(;;){
			
			System.out.println("======================================================");
			System.out.println("               Calculate Rent Tax                     ");
			System.out.println("======================================================");
			System.out.println("\n");
			
			System.out.print("Enter Your Employee per Month : ");
			double rent = scan.nextDouble();
			
			if(rent < 0){
				System.out.println("Invalid Input....");
				
				}else if (rent > 100000){
					System.out.println("You have to pay rent tax : " + rent * 0.1);
					
					}else {
						System.out.println("You don't have to pay rent tax..");
						
						}
						
			System.out.println("\tDo you want to calculate another rent Tax : (Y/N) ");
			char again = scan.next().charAt(0);
					
			if(again =='Y'){
				CalculateRentTax();
						
				}else {
					break;
							
					}	
			
			}
		
		
		
		}
		
		
	public static void CalculateInterestTax(){
		
		Scanner scan = new Scanner (System.in);
		
		for(;;){
			
			System.out.println("======================================================");
			System.out.println("               Calculate Interest Tax                 ");
			System.out.println("======================================================");
			System.out.println("\n");
			
			System.out.print("Enter Your bank interest per year : ");
			double bankInterest = scan.nextDouble();
			
			if(bankInterest < 0){
				System.out.println("Invalid Input....");
				
				}else{
					System.out.println("You have to pay rent tax : " + bankInterest * 0.05);
					
					}
						
			System.out.println("\tDo you want to calculate another rent Tax : (Y/N) ");
			char again = scan.next().charAt(0);
					
			if(again =='Y'){
				CalculateInterestTax();
						
				}else {
					break;
							
					}	
			
			}
		
		}
		
		
	public static void CalculateDividendTax(){
		Scanner scan = new Scanner (System.in);
		
		for(;;){
			
			
			System.out.println("======================================================");
			System.out.println("               Calculate Dividend Tax                 ");
			System.out.println("======================================================");
			System.out.println("\n");
			
			System.out.print("Enter Your total Dividedt per year : ");
			double totalDivided = scan.nextDouble();
			
			if(totalDivided < 0){
				System.out.println("Invalid Input....");
				
				}else if (totalDivided > 100000){
					System.out.println("You have to pay rent tax : " + totalDivided * 0.14);
					
					}else {
						System.out.println("You don’t have to pay Dividend Tax….");
						
						}
						
			System.out.println("\tDo you want to calculate another rent Tax : (Y/N) ");
			char again = scan.next().charAt(0);
					
			if(again =='Y'){
				CalculateDividendTax();
						
				}else {
					break;
							
					}
			
			}
		
		}	
	
		
	
	
	public static void CalculatePaybelTax(){
		
			Scanner scan = new Scanner (System.in);
			
			for(;;){
				double paybleAmount = 0;
		
				System.out.println("======================================================");
				System.out.println("                   Payble Tax                         ");
				System.out.println("======================================================");
				System.out.println("\n");
				
				System.out.print("Enter Your Employee per Month : ");
				double MonthSalary = scan.nextDouble();
				
				if(MonthSalary <= 100000){
					System.out.println("You not Include the Tax.. !");
					
					}else if (MonthSalary <= 141667){
						paybleAmount = (MonthSalary-100000)*0.06;
						System.out.println("You have to pay payble Tax per Month : " + paybleAmount);
						
						}else if(MonthSalary <= 183333){
							paybleAmount = 41667 * 0.06 + (MonthSalary-141667)*0.12;
							System.out.println("You have to pay payble Tax per Month : " + paybleAmount);
							
							}else if(MonthSalary <= 225000){
								paybleAmount = 41667 * 0.06 + 41667 * 0.12 + (MonthSalary-183333)*0.18;
								System.out.println("You have to pay payble Tax per Month : " + paybleAmount);
								
								}else if(MonthSalary <= 266667){
									paybleAmount = 41667 * 0.06 + 41667 * 0.12 + 41667 * 0.18 + (MonthSalary-255000)*0.24;
									System.out.println("You have to pay payble Tax per Month : " + paybleAmount);
									
									}else if(MonthSalary <= 308333){
										paybleAmount = 41667 * 0.06 + 41667 * 0.12 + 41667 * 0.18 + 41667 * 0.24 + (MonthSalary-266667)*0.3;
										System.out.println("You have to pay payble Tax per Month : " + paybleAmount);
										
										}else if (MonthSalary <= 350000){
											paybleAmount = 41667 * 0.06 + 41667 * 0.12 + 41667 * 0.18 + 41667 * 0.24 + 41667 * 0.3 +(MonthSalary-308333)*0.36;
											System.out.println("You have to pay payble Tax per Month : " + paybleAmount);
											
											}else if (MonthSalary > 350000){
												paybleAmount = 41667 * 0.06 + 41667 * 0.12 + 41667 * 0.18 + 41667 * 0.24 + 41667 * 0.3 +(MonthSalary-308333)*0.36;
												System.out.println("You have to pay payble Tax per Month : " + paybleAmount);
												
												}else{
													System.out.println("\tPlease enter the positive number or valid Salary Amount..");
													
													}
				
				System.out.println("\n");
									
				System.out.println("\tDo you want to calculate another payble Tax : (Y/N) ");
				char again = scan.next().charAt(0);
				
				if(again =='A'){
					CalculatePaybelTax();
					
					}else {
						break;
						
						}
		
				
				}
			

		}
		
		
		public static void CalculateIncomeTax(){
		
			Scanner scan = new Scanner (System.in);
			
			for(;;){
				double Incometax = 0;
		
				System.out.println("======================================================");
				System.out.println("                   Income Tax                         ");
				System.out.println("======================================================");
				System.out.println("\n");
				
				System.out.print("Enter Your Total income per Year : ");
				double yearIncome = scan.nextInt();
				
				if(yearIncome <= 1200000){
					System.out.println("You not Include the Income Tax.. !");
					
					}else if (yearIncome <= 1700000){
						Incometax = (yearIncome-1200000)*0.06;
						System.out.println("You have to pay payble Tax per Month : " + Incometax);
						
						}else if(yearIncome <= 2200000){
							Incometax = 500000 * 0.06 + (yearIncome-1700000)*0.12;
							System.out.println("You have to pay payble Tax per Month : " + Incometax);
							
							}else if(yearIncome <= 2700000){
								Incometax = 500000 * 0.06 + 500000 * 0.12 + (yearIncome-2200000)*0.18;
								System.out.println("You have to pay payble Tax per Month : " + Incometax);
								
								}else if(yearIncome <= 3200000){
									Incometax = 500000 * 0.06 + 500000 * 0.12 + 500000 * 0.18 + (yearIncome-2700000)*0.24;
									System.out.println("You have to pay payble Tax per Month : " + Incometax);
									
									}else if(yearIncome <= 3700000){
										Incometax = 500000 * 0.06 + 500000 * 0.12 + 500000 * 0.18 + 500000 * 0.24 + (yearIncome-3200000)*0.3;
										System.out.println("You have to pay payble Tax per Month : " + Incometax);
										
										}else if (yearIncome >3700000){
											Incometax = 500000 * 0.06 + 500000 * 0.12 + 500000 * 0.18 + 500000 * 0.24 + 500000 * 0.3 + (yearIncome-3700000)*0.36;
											System.out.println("You have to pay payble Tax per Month : " + Incometax);
											
											}else{
												System.out.println("\tPlease enter the positive number or valid Salary Amount..");
												
												}
				
				System.out.println("\n");
									
				System.out.println("\tDo you want to calculate another payble Tax : (Y/N) ");
				char again = scan.next().charAt(0);
				
				if(again =='A'){
					CalculateIncomeTax();
					
					}else {
						break;
						
						}
		
				
				}
			

		}
		
		
		public static void CalculateSSCLtax(){
			Scanner scan = new Scanner (System.in);
			
			for(;;){
				
				
				System.out.println("======================================================");
				System.out.println("                   SSCL Tax                           ");
				System.out.println("======================================================");
				System.out.println("\n");
				
				System.out.print("Enter value of good or services : ");
				double valueofGoods = scan.nextDouble();
				
				double saleTaxpresntage = 0.025;
				
				double saleTax = valueofGoods * saleTaxpresntage;
				
				double afterSaleValue = valueofGoods + saleTax ; 
				
				double vatAddValue = afterSaleValue * 0.15;
				
				double SSCLvalue = vatAddValue + saleTax ; 
				
				System.out.println("Dou you want to calculate another SSCL Tax  : " + SSCLvalue);
				
				
				System.out.println("\tDo you want to calculate another payble Tax : (Y/N) ");
				char again = scan.next().charAt(0);
				
				if(again =='A'){
					CalculateSSCLtax();
					
					}else {
						break;
						
						}
				
				}
			
			
			}
			
		public static void CalculateLeasingTax(){
			Scanner scan = new Scanner (System.in);
			
			for(;;){
				
				System.out.println("======================================================");
				System.out.println("                     Leasing Tax                      ");
				System.out.println("======================================================");
				System.out.println("\n");
				
				System.out.println("\t[1] Calculate monthly Installment ");
				System.out.println("\t[2] search leasing category");
				System.out.println("\t[3] find leasing amount");
				System.out.println("\tExit");
				
				System.out.print("Enter an option to Continue...");
				int option = scan.nextInt();
				
				if(option == 1){
					CalculatemonthlyInstallment();
					
					}else if(option == 2){
						CalculateleasingCategory();
						
						}else if(option == 3){
							CalculateLeasingAmount();
							
							}else if(option == 4){
								break;
								
								}else{
									System.out.println("please enter the valid Option Number !..");
											
									}
				
				System.out.println("\tDo you want to calculate Leasing Tax : (Y/N) ");
				char again = scan.next().charAt(0);
				
				if(again =='A'){
					CalculateLeasingTax();
					
					}else {
						break;
						
						}
				}
			
			
			}
			
			
			public static void CalculatemonthlyInstallment(){
				Scanner scan = new Scanner (System.in);
				
				for(;;){
					
					System.out.println("=============================================================");
					System.out.println("                       LEASING PAYMENT           			 ");
					System.out.println("=============================================================");
					System.out.println("\n");
					
					System.out.println("Enter lease amount : ");
					double leaseAmount = scan.nextDouble();
					
					System.out.println("Enter interest Rate : ");
					double interestRate = scan.nextDouble();
					
					if(interestRate < 0){
						System.out.println("\tEnter the valid interest rate...");
						System.out.println("\nEnter interest Rate : ");
						interestRate = scan.nextDouble();
						
						}
					
					System.out.println("Enter number of years (1-5) : ");
					double years = scan.nextDouble();
					
					if(years > 5){
						System.out.println("\tInvalid year ... please enter the value again between (1-5)... ");
						System.out.println("\nEnter number of years : ");
						years = scan.nextDouble();
						
						}
						
						
					double monthlyInstallment = (leaseAmount * (interestRate/12)) / 1-(1 / Math.pow( 1 + (interestRate/12),years / 12));
					
					System.out.println("Your Monthlt Installment : " + monthlyInstallment);
						
					
					System.out.println("\tDo you want to calculate another Calculate monthly Installment : (Y/N) ");
					char again = scan.next().charAt(0);
					
					if(again =='A'){
						CalculatemonthlyInstallment();
						
						}else {
							break;
							
							}
					}
				
				
				}
				
				
			public static void CalculateleasingCategory(){
				Scanner scan = new Scanner (System.in);
				
				for(;;){
					
					System.out.println("=============================================================");
					System.out.println("                       Calculate leasing Category           			 ");
					System.out.println("=============================================================");
					System.out.println("\n");
					
					System.out.println("Enter lease amount : ");
					double leaseAmount = scan.nextDouble();
					
					System.out.println("Enter interest Rate : ");
					double interestRate = scan.nextDouble();
					
					if(interestRate < 0){
						System.out.println("\tEnter the valid interest rate...");
						System.out.println("\nEnter interest Rate : ");
						interestRate = scan.nextDouble();
						
						}
						
					double threemonthlyInstallment = (leaseAmount * (interestRate/12)) / 1-(1 / Math.pow( 1 + (interestRate/12),3 / 12));	
					double fourmonthlyInstallment = (leaseAmount * (interestRate/12)) / 1-(1 / Math.pow( 1 + (interestRate/12),4 / 12));	
					double fivemonthlyInstallment = (leaseAmount * (interestRate/12)) / 1-(1 / Math.pow( 1 + (interestRate/12),5 / 12));	
					
					System.out.println("Your Monthlt Installment for 3 year leasing Plan : " + threemonthlyInstallment);
					System.out.println("Your Monthlt Installment for 3 year leasing Plan :" + fourmonthlyInstallment);
					System.out.println("Your Monthlt Installment for 3 year leasing Plan : " + fivemonthlyInstallment);
					
					
				System.out.println("\tDo you want to calculate another search leasing Category : (Y/N) ");
				char again = scan.next().charAt(0);
				
				if(again =='A'){
					CalculateleasingCategory();
					
					}else {
						break;
						
						}
					}
				
				
				}
				
			public static void CalculateLeasingAmount(){
				Scanner scan = new Scanner (System.in);
				
				for(;;){
					
					System.out.println("=============================================================");
					System.out.println("                    Calculate Leasing Amount           		 ");
					System.out.println("=============================================================");
					System.out.println("\n");
					
					
					System.out.println("Enter your monthly lease amount you can afford : ");
					double affortedleaseAmount = scan.nextDouble();
					
					System.out.println("Enter interest Rate : ");
					double interestRate = scan.nextDouble();
					
					if(interestRate < 0){
						System.out.println("\tEnter the valid interest rate...");
						System.out.println("\nEnter interest Rate : ");
						interestRate = scan.nextDouble();
						
						}
					
					System.out.println("Enter number of years (1-5) : ");
					double years = scan.nextDouble();
					
					if(years > 5){
						System.out.println("\tInvalid year ... please enter the value again between (1-5)... ");
						System.out.println("\nEnter number of years : ");
						years = scan.nextDouble();
						
						}
					
					double leasingAmount = (affortedleaseAmount * ( 1-(1 / Math.pow( 1 + (interestRate/12),years / 12))))/ (interestRate / 12);
					
					
				System.out.println("\tDo you want to calculate another Calculate Leasing Amount : (Y/N) ");
				char again = scan.next().charAt(0);
				
				if(again =='A'){
					CalculateLeasingAmount();
					
					}else {
						break;
						
						}
					}
				
				
				}
		
		
	
}

//Math.pow(x+1,y);
