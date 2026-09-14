import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept three positive integers from keyboard input
        System.out.print("Enter first positive integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second positive integer: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third positive integer: ");
        int num3 = scanner.nextInt();
        
        // Validate that all numbers are positive
        if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
            System.out.println("Error: All numbers must be positive integers!");
        } else {
            // Extract rightmost digits
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int digit3 = num3 % 10;
            
            // Check if two or more have the same rightmost digit
            boolean result = (digit1 == digit2) || (digit1 == digit3) || (digit2 == digit3);
            
            // Print the result
            System.out.println(result);
        }
        
        scanner.close();
    }
}
