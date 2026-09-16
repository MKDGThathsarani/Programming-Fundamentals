import java.util.Scanner;
class CourseWork07{
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String [] args){
		String[] id = new String[100];
		String[] name = new String[100];
		String[] number = new String[100];
		String[] company = new String[100];
		int[] salary = new int[100];
		String [] BDay = new String[100];
		
		while(true){
			clearConsole();
			displayMainMenu();
			
			
			System.out.print("\nPress Enter to continue...");
			int option = scanner.nextInt();
			
			switch(option){
				case 1:
					addContacts(id,name,number,company,salary,BDay);
					break;
				case 2:
					updateContacts();
					break;
				case 3:
					deleteContacts();
					break;
				case 4:
                    searchContact();
                    break;
				case 5:
					listContacts();
					break;
				case 6:
					System.out.println("Exiting application. Goodbye!");
					return; 
				default:
					System.out.println("Exiting application. Goodbye!");
					break;
		}
	}
}
	
	
	public static void displayMainMenu(){	
		
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("\n\n\n");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("\n\n\n");
			System.out.println("=".repeat(50));
			System.out.println("\n\n");
			System.out.println("\t [01] ADD Contacts");
			System.out.println("\t [02] UPDATE Contacts");
			System.out.println("\t [03] DELETE Contacts");
			System.out.println("\t [04] SEARCH Contacts");
			System.out.println("\t [05] LIST Contact");
			System.out.println("\t [06] Exit");
		}
		
		//Method to add contact//
		public static void addContacts(String[] id, String[] name, String[] number,String[] company,int[] salary,String[] BDay){
			for(int indexes=0;;indexes++){
				clearConsole();
				System.out.println("-------------------------------------------------");
				System.out.println("|		Add Contact to the List		|");
				System.out.println("-------------------------------------------------");
				
				System.out.println("Name			 :" + name);
				name[indexes] = scanner.nextLine();
				
				System.out.println("Phone Number	 :" + number);
				number[indexes] = scanner.nextLine();
				
				
				System.out.println("Company Name	 :");
				System.out.println("Salary			 :");
				System.out.println("B'Day(YYYY-MM-DD):");
				
				
				
				pressEnterToContinue();
			}
		}
			
		//Method to update contact//
		public static void updateContacts(){
			clearConsole();
			System.out.println("--------------------------------------------------");
			System.out.println("|		Update Contact to the List	|");
			System.out.println("--------------------------------------------------");
			pressEnterToContinue();
			}
			
		//Method to delete contact//
		public static void deleteContacts(){
			clearConsole();
			System.out.println("---------------------------------------------------");
			System.out.println("|		Delete Contact to the List	|");
			System.out.println("---------------------------------------------------");
			pressEnterToContinue();
			}
			
		//Method to search contact//
		public static void searchContact(){
			clearConsole();
			System.out.println("---------------------------------------------------");
			System.out.println("|		Search Contact to the List	|");
			System.out.println("---------------------------------------------------");
			pressEnterToContinue();
			}
			
		//Method to list contact//
		public static void listContacts(){
			clearConsole();
			System.out.println("--------------------------------------------------");
			System.out.println("|		List Contact to the List	|");
			System.out.println("---------------------------------------------------");
			pressEnterToContinue();
			}
			
		// Method to get integer input
		public static int getIntInput(String prompt) {
			System.out.print(prompt);
			while (true) {
				if (scanner.hasNextInt()) {
					int value = scanner.nextInt();
					scanner.nextLine(); // consume newline
					return value;
				} else {
					System.out.print("Invalid input. Please enter a number: ");
					scanner.nextLine(); // clear invalid input
				}
			}
		}
			
		//------------Method to pause until user presses Enter
		public static void pressEnterToContinue() {
			System.out.print("\nPress Enter to continue...");
			scanner.nextLine();
		}
	
		//--------clear the command-------------
		public final static void clearConsole() {
			try{
			final String os = System.getProperty("os.name");
			if(os.contains("Windows")) {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			}
			}catch(final Exception e) {
			e.printStackTrace();
			}
		}
		
		
		
			
	
	}

