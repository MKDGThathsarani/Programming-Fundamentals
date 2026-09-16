import java.util.Scanner;

public class SalaryInformationSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===========================================");
        System.out.println("     SALARY INFORMATION SYSTEM");
        System.out.println("===========================================");
        System.out.println("01. Calculate Income Tax");
        System.out.println("02. Calculate Annual Bonus");
        System.out.println("03. Calculate Loan Amount");
        System.out.println("===========================================");
        System.out.print("Select an option (1-3): ");
        
        int option = scanner.nextInt();
        scanner.nextLine(); 
        
        switch (option) {
            case 1:
                calculateIncomeTax(scanner);
                break;
            case 2:
                calculateAnnualBonus(scanner);
                break;
            case 3:
                calculateLoanAmount(scanner);
                break;
            default:
                System.out.println("Invalid option! Please select 1, 2, or 3.");
        }
        
        scanner.close();
    }
    
    
    public static void calculateIncomeTax(Scanner scanner) {
        System.out.println("\n--- CALCULATE INCOME TAX ---");
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Monthly Salary: Rs. ");
        double salary = scanner.nextDouble();
        
        double tax = 0;
        
        if (salary <= 100000) {
            tax = 0;
        } else {
            double taxableAmount = salary - 100000;
            
            
            if (taxableAmount > 0) {
                double bracket1 = Math.min(taxableAmount, 41667);
                tax += bracket1 * 0.06;
                taxableAmount -= bracket1;
            }
            
            if (taxableAmount > 0) {
                double bracket2 = Math.min(taxableAmount, 41667);
                tax += bracket2 * 0.12;
                taxableAmount -= bracket2;
            }
            
            if (taxableAmount > 0) {
                double bracket3 = Math.min(taxableAmount, 41667);
                tax += bracket3 * 0.18;
                taxableAmount -= bracket3;
            }
            
            if (taxableAmount > 0) {
                double bracket4 = Math.min(taxableAmount, 41667);
                tax += bracket4 * 0.24;
                taxableAmount -= bracket4;
            }
            
            if (taxableAmount > 0) {
                double bracket5 = Math.min(taxableAmount, 41667);
                tax += bracket5 * 0.30;
                taxableAmount -= bracket5;
            }
            
            if (taxableAmount > 0) {
                tax += taxableAmount * 0.36;
            }
        }
        
        System.out.println("\n--- INCOME TAX CALCULATION ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Monthly Salary: Rs. " + String.format("%.2f", salary));
        System.out.println("Monthly Income Tax: Rs. " + String.format("%.2f", tax));
    }
    
    
    public static void calculateAnnualBonus(Scanner scanner) {
        System.out.println("\n--- CALCULATE ANNUAL BONUS ---");
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Monthly Salary: Rs. ");
        double salary = scanner.nextDouble();
        
        double bonusPercentage = 0;
        
        if (salary < 100000) {
            bonusPercentage = 5000;
            System.out.println("\n--- ANNUAL BONUS CALCULATION ---");
            System.out.println("Employee Name: " + name);
            System.out.println("Monthly Salary: Rs. " + String.format("%.2f", salary));
            System.out.println("Annual Bonus: Rs. " + String.format("%.2f", bonusPercentage));
        } else {
            if (salary >= 100000 && salary <= 199999) {
                bonusPercentage = 0.10;
            } else if (salary >= 200000 && salary <= 299999) {
                bonusPercentage = 0.15;
            } else if (salary >= 300000 && salary <= 399999) {
                bonusPercentage = 0.20;
            } else if (salary >= 400000) {
                bonusPercentage = 0.35;
            }
            
            double annualBonus = salary * bonusPercentage;
            
            System.out.println("\n--- ANNUAL BONUS CALCULATION ---");
            System.out.println("Employee Name: " + name);
            System.out.println("Monthly Salary: Rs. " + String.format("%.2f", salary));
            System.out.println("Bonus Percentage: " + (bonusPercentage * 100) + "%");
            System.out.println("Annual Bonus: Rs. " + String.format("%.2f", annualBonus));
        }
    }
    
    
    public static void calculateLoanAmount(Scanner scanner) {
        System.out.println("\n--- CALCULATE LOAN AMOUNT ---");
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Monthly Salary: Rs. ");
        double salary = scanner.nextDouble();
        

        if (salary <= 50000) {
            System.out.println("\n--- LOAN CALCULATION ---");
            System.out.println("Employee Name: " + name);
            System.out.println("Monthly Salary: Rs. " + String.format("%.2f", salary));
            System.out.println("NOT QUALIFIED FOR LOAN!");
            System.out.println("Reason: Employee salary should be greater than Rs.50,000 to get a loan.");
            return;
        }
        
        System.out.print("Enter Number of Years (Max 5): ");
        int years = scanner.nextInt();
        
        
        if (years > 5) {
            System.out.println("\n--- LOAN CALCULATION ---");
            System.out.println("Employee Name: " + name);
            System.out.println("Monthly Salary: Rs. " + String.format("%.2f", salary));
            System.out.println("Years: " + years);
            System.out.println("NOT QUALIFIED FOR LOAN!");
            System.out.println("Reason: Maximum number of years is 5.");
            return;
        }
        
        
        double maxMonthlyInstallment = salary * 0.60;
        
       
        double annualInterestRate = 0.15;
        double monthlyInterestRate = annualInterestRate / 12;
        
      
        int months = years * 12;
        
        
        double loanAmount = maxMonthlyInstallment * 
                           (Math.pow(1 + monthlyInterestRate, months) - 1) / 
                           (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, months));
        
        long roundedLoanAmount = Math.round(loanAmount / 1000.0) * 1000;
        
        System.out.println("\n--- LOAN AMOUNT CALCULATION ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Monthly Salary: Rs. " + String.format("%.2f", salary));
        System.out.println("Maximum Monthly Installment (60% of salary): Rs. " + String.format("%.2f", maxMonthlyInstallment));
        System.out.println("Loan Period: " + years + " year(s)");
        System.out.println("Annual Interest Rate: " + (annualInterestRate * 100) + "%");
        System.out.println("Maximum Loan Amount: Rs. " + String.format("%.2f", roundedLoanAmount));
    }
}
