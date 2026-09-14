import java.util.Scanner;

public class EmployeeSalarySystem {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Array ekata max size eka define karagannawa
        String[] userIds = new String[100];
        double[] salaries = new double[100];
        int count = 0; // employees ge gana thiyana count eka
        
        while (true) {
            // Menu display karannawa
            System.out.println("\n===== Employee Salary Management System =====");
            System.out.println("1. Add New Employee");
            System.out.println("2. Display Sorted Table (Descending by Salary)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = input.nextInt();
            input.nextLine(); // new line eka consume karagannawa
            
            if (choice == 1) {
                // Add employee
                if (count >= 100) {
                    System.out.println("Array is full! Cannot add more employees.");
                    continue;
                }
                
                System.out.print("Enter User ID: ");
                String userId = input.nextLine();
                
                // Duplicate check karannawa
                boolean isDuplicate = false;
                for (int i = 0; i < count; i++) {
                    if (userIds[i].equals(userId)) {
                        isDuplicate = true;
                        break;
                    }
                }
                
                if (isDuplicate) {
                    System.out.println("Error: User ID '" + userId + "' already exists! Duplicate not allowed.");
                    continue;
                }
                
                System.out.print("Enter Salary: ");
                double salary = input.nextDouble();
                
                // Validation - salary eka negative wela balannawa
                if (salary < 0) {
                    System.out.println("Error: Salary cannot be negative!");
                    continue;
                }
                
                // Array ekata add karannawa
                userIds[count] = userId;
                salaries[count] = salary;
                count++;
                
                System.out.println("Employee added successfully!");
                
            } else if (choice == 2) {
                // Display sorted table
                if (count == 0) {
                    System.out.println("No records to display!");
                    continue;
                }
                
                // Bubble sort eken desc order ekata sort karannawa (salary basis eken)
                String[] tempUserIds = new String[count];
                double[] tempSalaries = new double[count];
                
                // Copy arrays
                for (int i = 0; i < count; i++) {
                    tempUserIds[i] = userIds[i];
                    tempSalaries[i] = salaries[i];
                }
                
                // Bubble sort - descending order (largest to smallest)
                for (int i = 0; i < count - 1; i++) {
                    for (int j = 0; j < count - i - 1; j++) {
                        if (tempSalaries[j] < tempSalaries[j + 1]) {
                            // Swap salaries
                            double tempSalary = tempSalaries[j];
                            tempSalaries[j] = tempSalaries[j + 1];
                            tempSalaries[j + 1] = tempSalary;
                            
                            // Swap user IDs
                            String tempUserId = tempUserIds[j];
                            tempUserIds[j] = tempUserIds[j + 1];
                            tempUserIds[j + 1] = tempUserId;
                        }
                    }
                }
                
                // Table eka print karannawa
                System.out.println("\n==================================================");
                System.out.println("        EMPLOYEE SALARY REPORT");
                System.out.println("   (Sorted by Salary - Descending Order)");
                System.out.println("==================================================");
                System.out.println("|   User ID    |     Salary (Rs.)     |");
                System.out.println("==================================================");
                
                for (int i = 0; i < count; i++) {
                    System.out.printf("|   %-10s  |      %.2f          |\n", tempUserIds[i], tempSalaries[i]);
                }
                
                System.out.println("==================================================");
                
                // Additional statistics
                double totalSalary = 0;
                for (int i = 0; i < count; i++) {
                    totalSalary += salaries[i];
                }
                double averageSalary = totalSalary / count;
                
                System.out.printf("Total Employees: %d\n", count);
                System.out.printf("Total Salary: Rs. %.2f\n", totalSalary);
                System.out.printf("Average Salary: Rs. %.2f\n", averageSalary);
                System.out.println("==================================================");
                
            } else if (choice == 3) {
                System.out.println("Exiting the system. Thank you!");
                break;
            } else {
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        }
        
        input.close();
    }
}
