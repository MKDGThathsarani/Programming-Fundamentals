import java.util.Scanner;

class TaxCalculator {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            clearConsole();
            displayMainMenu();
            int choice = getIntInput("Enter your option: ", 1, 6);
            
            switch (choice) { 
                case 1:
                    withholdingtax();
                    break;
                case 2:
                    payabletax();
                    break;
                case 3:
                    incometax();
                    break;
                case 4:
                    SSCLtax();
                    break;
                case 5:
                    leasingpayment();
                    break;
                case 6:
                    System.out.println("Exiting Tax Calculator. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
    
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
    }
    
    // ADDED: Clear console method
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
    
    // ADDED: Get integer input with validation
    public static int getIntInput(String prompt, int min, int max) {
        while (true) {
            try {
                System.out.print(prompt);
                int input = Integer.parseInt(scanner.nextLine().trim());
                if (input >= min && input <= max) {
                    return input;
                }
                System.out.println("Please enter a number between " + min + " and " + max);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
    
    // ADDED: Get positive double input
    public static double getPositiveDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double input = Double.parseDouble(scanner.nextLine().trim());
                if (input >= 0) {
                    return input;
                }
                System.out.println("Please enter a positive number.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
    
    // ADDED: Ask to continue or not
    public static boolean askAgain(String taxType) {
        System.out.print("\nDo you want to calculate " + taxType + " again? (Y/N): ");
        String input = scanner.nextLine().trim().toUpperCase();
        if (input.equals("Y")) {
            return true;
        } else if (input.equals("N")) {
            System.out.println("Returning to " + taxType + " menu...");
            return false;
        } else {
            System.out.println("Invalid input. Returning to menu...");
            return false;
        }
    }
    
    // Withholding Tax Menu
    public static void withholdingtax() {
        while (true) {
            clearConsole();
            System.out.println("+" + "-".repeat(115) + "+");
            System.out.println("|                                                     WITHHOLDING TAX                                               |");
            System.out.println("+" + "-".repeat(115) + "+");
            System.out.println("\n");
            System.out.println("		[1] Rent Tax");
            System.out.println("		[2] Bank Interest Tax");
            System.out.println("		[3] Dividend Tax");
            System.out.println("		[4] Exit");
            
            int choice = getIntInput("Enter your option: ", 1, 4);
            
            switch (choice) {
                case 1:
                    renttax();
                    break;
                case 2:
                    bankinteresttax();
                    break;
                case 3:
                    dividendtax();
                    break;
                case 4:
                    return;
            }
        }
    }
    
    public static void renttax() {
        while (true) {
            clearConsole();
            System.out.println("+" + "-".repeat(115) + "+");
            System.out.println("|                                                     RENT TAX                                               |");
            System.out.println("+" + "-".repeat(115) + "+");
            double payment = getPositiveDouble("Enter payment amount (Rs): ");
            if (payment <= 100000) {
                System.out.println("You don't have to pay Rent Tax...");
            } else {
                double tax = payment * 0.10;
                System.out.printf("Rent Tax (10%% on amount > Rs 100,000): Rs %.2f\n", tax);
            }
            if (!askAgain("Rent Tax")) break;
        }
    }
    
    public static void bankinteresttax() {
        while (true) {
            clearConsole();
            System.out.println("+" + "-".repeat(115) + "+");
            System.out.println("|                                                     BANK INTEREST TAX                                               |");
            System.out.println("+" + "-".repeat(115) + "+");
            System.out.println("===== Bank Interest Tax =====");
            double interest = getPositiveDouble("Enter annual bank interest (Rs): ");
            double tax = interest * 0.05;
            System.out.printf("Bank Interest Tax (5%%): Rs %.2f\n", tax);
            if (!askAgain("Bank Interest Tax")) break;
        }
    }
    
    public static void dividendtax() {
        while (true) {
            clearConsole();
            System.out.println("+" + "-".repeat(115) + "+");
            System.out.println("|                                                     DIVIDEND TAX                                               |");
            System.out.println("+" + "-".repeat(115) + "+");
            double dividend = getPositiveDouble("Enter dividend amount (Rs): ");
            if (dividend <= 100000) {
                System.out.println("You don't have to pay Dividend Tax...");
            } else {
                double tax = dividend * 0.14;
                System.out.printf("Dividend Tax (14%% on amount > Rs 100,000): Rs %.2f\n", tax);
            }
            if (!askAgain("Dividend Tax")) break;
        }
    }
    
    public static void payabletax() {
        while (true) {
            clearConsole();
            System.out.println("+" + "-".repeat(115) + "+");
            System.out.println("|                                                     PAYABLE TAX                                               |");
            System.out.println("+" + "-".repeat(115) + "+");
            double salary = getPositiveDouble("Enter monthly salary (Rs): ");
            if (salary <= 100000) {
                System.out.println("No Payable Tax up to Rs 100,000.");
            } else {
                double tax = 0;
                double remaining = salary - 100000;
                double[] brackets = {41667, 41667, 41667, 41667, Double.MAX_VALUE};
                double[] rates = {0.06, 0.12, 0.18, 0.24, 0.30};
                
                for (int i = 0; i < brackets.length; i++) {
                    if (remaining <= 0) break;
                    double taxable = Math.min(remaining, brackets[i]);
                    tax += taxable * rates[i];
                    remaining -= taxable;
                }
                System.out.printf("Total Payable Tax: Rs %.2f\n", tax);
            }
            if (!askAgain("Payable Tax")) break;
        }
    }
    
    public static void incometax() {
        while (true) {
            clearConsole();
            System.out.println("+" + "-".repeat(115) + "+");
            System.out.println("|                                                     INCOME TAX                                               |");
            System.out.println("+" + "-".repeat(115) + "+");
            double income = getPositiveDouble("Enter annual income (Rs): ");
            if (income <= 1200000) {
                System.out.println("No Income Tax up to Rs 1,200,000.");
            } else {
                double tax = 0;
                double remaining = income - 1200000;
                double[] brackets = {500000, 500000, 500000, 500000, Double.MAX_VALUE};
                double[] rates = {0.06, 0.12, 0.18, 0.24, 0.30};
                
                for (int i = 0; i < brackets.length; i++) {
                    if (remaining <= 0) break;
                    double taxable = Math.min(remaining, brackets[i]);
                    tax += taxable * rates[i];
                    remaining -= taxable;
                }
                System.out.printf("Total Income Tax: Rs %.2f\n", tax);
            }
            if (!askAgain("Income Tax")) break;
        }
    }
    
    public static void SSCLtax() {
        while (true) {
            clearConsole();
            System.out.println("+" + "-".repeat(115) + "+");
            System.out.println("|                                                     SSCL TAX                                               |");
            System.out.println("+" + "-".repeat(115) + "+");
            double value = getPositiveDouble("Enter value of goods (Rs): ");
            double saleTax = value * 0.025;
            double afterSaleTax = value + saleTax;
            double vat = afterSaleTax * 0.15;
            double totalTax = saleTax + vat;
            System.out.printf("Sale Tax (2.5%%): Rs %.2f\n", saleTax);
            System.out.printf("VAT (15%% on after-sale-tax value): Rs %.2f\n", vat);
            System.out.printf("Total SSCL Tax: Rs %.2f\n", totalTax);
            if (!askAgain("SSCL Tax")) break;
        }
    }
    
    public static void leasingpayment() {
        while (true) {
            clearConsole();
            System.out.println("+" + "-".repeat(115) + "+");
            System.out.println("|                                                     Leasing Payment                                               |");
            System.out.println("+" + "-".repeat(115) + "+");
            System.out.println("		[1] Calculate Monthly Installment");
            System.out.println("		[2] Search Leasing Category");
            System.out.println("		[3] Find Leasing Amount");
            System.out.println("		[4] Back to Main Menu");
            
            int choice = getIntInput("Enter your option: ", 1, 4);
            
            switch (choice) {
                case 1:
                    monthlyInstallment();
                    break;
                case 2:
                    searchLeasingCategory();
                    break;
                case 3:
                    findLeasingAmount();
                    break;
                case 4:
                    return;
            }
        }
    }
    
    private static void monthlyInstallment() {
        while (true) {
            clearConsole();
            System.out.println("===== Calculate Monthly Installment =====");
            double amount = getPositiveDouble("Enter lease amount (Rs): ");
            double annualRate = getPositiveDouble("Enter annual interest rate (%): ");
            int years = getIntInput("Enter number of years (max 5): ", 1, 5);
            
            double monthlyRate = (annualRate / 100) / 12;
            int months = years * 12;
            double monthlyInstallment = amount * monthlyRate / (1 - Math.pow(1 / (1 + monthlyRate), months));
            System.out.printf("Monthly Installment: Rs %.2f\n", monthlyInstallment);
            
            System.out.print("\nDo you want to calculate again? (Y/N): ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (!input.equals("Y")) break;
        }
    }
    
    private static void searchLeasingCategory() {
        while (true) {
            clearConsole();
            System.out.println("===== Search Leasing Category =====");
            double amount = getPositiveDouble("Enter lease amount (Rs): ");
            double annualRate = getPositiveDouble("Enter annual interest rate (%): ");
            
            double monthlyRate = (annualRate / 100) / 12;
            for (int years = 3; years <= 5; years++) {
                int months = years * 12;
                double installment = amount * monthlyRate / (1 - Math.pow(1 / (1 + monthlyRate), months));
                System.out.printf("%d years: Rs %.2f per month\n", years, installment);
            }
            
            System.out.print("\nDo you want to search again? (Y/N): ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (!input.equals("Y")) break;
        }
    }
    
    private static void findLeasingAmount() {
        while (true) {
            clearConsole();
            System.out.println("===== Find Leasing Amount =====");
            double monthlyPayment = getPositiveDouble("Enter monthly payment you can afford (Rs): ");
            double annualRate = getPositiveDouble("Enter annual interest rate (%): ");
            int years = getIntInput("Enter number of years (max 5): ", 1, 5);
            
            double monthlyRate = (annualRate / 100) / 12;
            int months = years * 12;
            double leaseAmount = monthlyPayment * (1 - Math.pow(1 / (1 + monthlyRate), months)) / monthlyRate;
            System.out.printf("Total Leasing Amount Available: Rs %.2f\n", leaseAmount);
            
            System.out.print("\nDo you want to calculate again? (Y/N): ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (!input.equals("Y")) break;
        }
    }
}
