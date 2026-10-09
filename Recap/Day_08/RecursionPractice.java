public class RecursionPractice {
    
    // ===== 1. Factorial =====
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    // ===== 2. Fibonacci =====
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    // ===== 3. Countdown =====
    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Done!");
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }
    
    // ===== 4. Sum of 1 to n =====
    public static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
    
    // ===== 5. Power =====
    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }
    
    public static void main(String[] args) {
        
        // 1. Factorial
        System.out.println("===== Factorial =====");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
        
        // 2. Fibonacci
        System.out.println("\n===== Fibonacci =====");
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        
        // 3. Countdown
        System.out.println("\n===== Countdown =====");
        countdown(5);
        
        // 4. Sum
        System.out.println("\n===== Sum =====");
        System.out.println("Sum(5) = " + sum(5));   // 15
        System.out.println("Sum(10) = " + sum(10)); // 55
        
        // 5. Power
        System.out.println("\n===== Power =====");
        System.out.println("2^5 = " + power(2, 5));  // 32
        System.out.println("3^3 = " + power(3, 3));  // 27
    }
}
