import java.util.Scanner;

class pdf {
    private static Scanner scanner = new Scanner(System.in);
    
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
        System.out.print("Enter an Option to Continue : ");
    }
    
    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            clearConsole();
            displayMainMenu();
            int choice = scanner.nextInt();
            
            switch(choice) {
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
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    System.out.println("Press Enter to continue...");
                    scanner.nextLine();
                    scanner.nextLine();
            }
        }
        scanner.close();
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
    
    public static void withholdingTax() {
        clearConsole();
        
        System.out.println("+" + "-".repeat(115) + "+");
        System.out.println("|                                                     WITHHOLDING TAX                                               |");
        System.out.println("+" + "-".repeat(115) + "+");
        System.out.println("\n");
        System.out.println("		[1] Rent Tax");
        System.out.println("		[2] Bank Interest Tax");
        System.out.println("		[3] Dividend Tax");
        System.out.println("		[4] Back to Main Menu");
        System.out.println("\n");
        System.out.print("Enter an Option to Continue : ");
        
        int choice = scanner.nextInt();
        
        switch(choice) {
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
        
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
        scanner.nextLine();
    }
    
    public static void rentTax() {
        clearConsole();
        System.out.println("+" + "-".repeat(115) + "+");
        System.out.println("|                                                       RENT TAX                                                 |");
        System.out.println("+" + "-".repeat(115) + "+");
        System.out.println("\n[Rent Tax Calculation will be here]\n");
    }
    
    public static void bankInterestTax() {
        clearConsole();
        System.out.println("+" + "-".repeat(115) + "+");
        System.out.println("|                                                    BANK INTEREST TAX                                           |");
        System.out.println("+" + "-".repeat(115) + "+");
        System.out.println("\n[Bank Interest Tax Calculation will be here]\n");
    }
    
    public static void dividendTax() {
        clearConsole();
        System.out.println("+" + "-".repeat(115) + "+");
        System.out.println("|                                                      DIVIDEND TAX                                             |");
        System.out.println("+" + "-".repeat(115) + "+");
        System.out.println("\n[Dividend Tax Calculation will be here]\n");
    }
    
    public static void payableTax() {
        clearConsole();
        System.out.println("+" + "-".repeat(115) + "+");
        System.out.println("|                                                       PAYABLE TAX                                                 |");
        System.out.println("+" + "-".repeat(115) + "+");
        System.out.println("\n[Payable Tax Calculation will be here]\n");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        scanner.nextLine();
    }
    
    public static void incomeTax() {
        clearConsole();
        System.out.println("+" + "-".repeat(115) + "+");
        System.out.println("|                                                     INCOME TAX                                                    |");
        System.out.println("+" + "-".repeat(115) + "+");
        System.out.println("\n[Income Tax Calculation will be here]\n");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        scanner.nextLine();
    }
    
    public static void ssclTax() {
        clearConsole();
        System.out.println("+" + "-".repeat(115) + "+");
        System.out.println("|                                   SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX                                     |");
        System.out.println("+" + "-".repeat(115) + "+");
        System.out.println("\n[SSCL Tax Calculation will be here]\n");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        scanner.nextLine();
    }
    
    public static void leasingPayment() {
        clearConsole();
        System.out.println("+" + "-".repeat(115) + "+");
        System.out.println("|                                                     LEASING PAYMENT                                               |");
        System.out.println("+" + "-".repeat(115) + "+");
        System.out.println("\n");
        System.out.println("		[1] Calculate Monthly Installment");
        System.out.println("		[2] Search Leasing Category");
        System.out.println("		[3] Find Leasing Amount");
        System.out.println("		[4] Back to Main Menu");
        System.out.println("\n");
        System.out.print("Enter an Option to Continue : ");
        
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
        
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
        scanner.nextLine();
    }
    
    public static void exit() {
        System.out.println("Exiting Tax Calculator. Goodbye!");
    }
}
