import java.util.Scanner;

public class Taxcalcul {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            clearConsole();
            displayMainMenu();
            int choice = getIntInput("Enter your option: ", 1, 6);

            switch (choice) {
                case 1:
                    withholdingTaxMenu();
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
                    leasingMenu();
                    break;
                case 6:
                    System.out.println("Exiting Tax Calculator. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    // ==================== HELPER METHODS ====================
    private static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.out.println("Could not clear console.");
        }
    }

    private static int getIntInput(String prompt, int min, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.println("Please enter a number between " + min + " and " + max);
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }

    private static double getPositiveDouble(String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value > 0) {
                    return value;
                } else {
                    System.out.println("Value must be greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }

    private static boolean askAgain(String taxName) {
        System.out.print("\nDo you want to calculate " + taxName + " again? (Y/N): ");
        String answer = scanner.next().trim().toUpperCase();
        if (answer.equals("Y")) {
            return true;
        } else if (answer.equals("N")) {
            return false;
        } else {
            System.out.println("Invalid input. Returning to main menu.");
            return false;
        }
    }

    // ==================== TAX CALCULATIONS ====================
    private static void withholdingTaxMenu() {
        while (true) {
            clearConsole();
            System.out.println("===== Withholding Tax =====");
            System.out.println("1. Rent Tax");
            System.out.println("2. Bank Interest Tax");
            System.out.println("3. Dividend Tax");
            System.out.println("4. Back to Main Menu");
            int choice = getIntInput("Enter your option: ", 1, 4);

            switch (choice) {
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
            }
        }
    }

    private static void rentTax() {
        while (true) {
            clearConsole();
            System.out.println("===== Rent Tax =====");
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

    private static void bankInterestTax() {
        while (true) {
            clearConsole();
            System.out.println("===== Bank Interest Tax =====");
            double interest = getPositiveDouble("Enter annual bank interest (Rs): ");
            double tax = interest * 0.05;
            System.out.printf("Bank Interest Tax (5%%): Rs %.2f\n", tax);
            if (!askAgain("Bank Interest Tax")) break;
        }
    }

    private static void dividendTax() {
        while (true) {
            clearConsole();
            System.out.println("===== Dividend Tax =====");
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

    private static void payableTax() {
        while (true) {
            clearConsole();
            System.out.println("===== Payable Tax (Monthly Salary) =====");
            double salary = getPositiveDouble("Enter monthly salary (Rs): ");
            if (salary <= 100000) {
                System.out.println("No Payable Tax up to Rs 100,000.");
            } else {
                double tax = 0;
                double remaining = salary - 100000;
                double[] brackets = {41667, 41667, 41667, 41667, Double.MAX_VALUE};
                double[] rates = {0.06, 0.12, 0.18, 0.24, 0.30, 0.36};

                for (int i = 0; i < brackets.length; i++) {
                    if (remaining <= 0) break;
                    double taxable = Math.min(remaining, brackets[i]);
                    tax += taxable * rates[i];
                    remaining -= taxable;
                }
                if (salary > 308333) {
                    tax += (salary - 308333) * 0.36;
                }
                System.out.printf("Total Payable Tax: Rs %.2f\n", tax);
            }
            if (!askAgain("Payable Tax")) break;
        }
    }

    private static void incomeTax() {
        while (true) {
            clearConsole();
            System.out.println("===== Income Tax (Annual Income) =====");
            double income = getPositiveDouble("Enter annual income (Rs): ");
            if (income <= 1200000) {
                System.out.println("No Income Tax up to Rs 1,200,000.");
            } else {
                double tax = 0;
                double remaining = income - 1200000;
                double[] brackets = {500000, 500000, 500000, 500000, Double.MAX_VALUE};
                double[] rates = {0.06, 0.12, 0.18, 0.24, 0.30, 0.36};

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

    private static void ssclTax() {
        while (true) {
            clearConsole();
            System.out.println("===== Social Security Contribution Levy (SSCL) =====");
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

    // ==================== LEASING PAYMENTS ====================
    private static void leasingMenu() {
        while (true) {
            clearConsole();
            System.out.println("===== Leasing Payment =====");
            System.out.println("1. Calculate Monthly Installment");
            System.out.println("2. Search Leasing Category");
            System.out.println("3. Find Leasing Amount");
            System.out.println("4. Back to Main Menu");
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
            if (!scanner.next().trim().toUpperCase().equals("Y")) break;
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
            if (!scanner.next().trim().toUpperCase().equals("Y")) break;
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
            if (!scanner.next().trim().toUpperCase().equals("Y")) break;
        }
    }

    private static void displayMainMenu() {
        System.out.println("===== TAX CALCULATOR & LEASING SYSTEM =====");
        System.out.println("1. Withholding Tax");
        System.out.println("2. Payable Tax");
        System.out.println("3. Income Tax");
        System.out.println("4. SSCL Tax");
        System.out.println("5. Leasing Payment");
        System.out.println("6. Exit");
    }
}













