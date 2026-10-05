public class MethodsPractice {
    
    // 1. No parameters, no return
    public static void sayHello() {
        System.out.println("Hello, World!!!!");
    }
    
    // 2. Parameters, no return
    public static void greet(String name) {
        System.out.println("Hello " + name);
    }
    
    // 3. No parameters, return
    public static int getNumber() {
        return 100;
    }
    
    // 4. Parameters, return
    public static int add(int a, int b) {
        return a + b;
    }
    
    // 5. Overloading - same name, different parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    // 6. Method with multiple parameters
    public static String introduce(String name, int age, String city) {
        return "I am " + name + ", " + age + " years old, from " + city;
    }
    
    // 7. Method with return and logic
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    
    // 8. Method with return (max of two)
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    // Main Method
    public static void main(String[] args) {
        
        // 1. No parameters, no return
        sayHello();
        
        // 2. Parameters, no return
        greet("Kamal");
        greet("Nimal");
        
        // 3. No parameters, return
        int num = getNumber();
        System.out.println("Number: " + num);
        
        // 4. Parameters, return
        int sum1 = add(10, 20);
        System.out.println("Sum (2 params): " + sum1);
        
        // 5. Overloading
        int sum2 = add(10, 20, 30);
        System.out.println("Sum (3 params): " + sum2);
        
        double sum3 = add(10.5, 20.5);
        System.out.println("Sum (double): " + sum3);
        
        // 6. Multiple parameters
        String intro = introduce("Kamal", 22, "Colombo");
        System.out.println(intro);
        
        // 7. Boolean return
        System.out.println("Is 10 even? " + isEven(10));
        System.out.println("Is 7 even? " + isEven(7));
        
        // 8. Max
        System.out.println("Max of 15, 25: " + max(15, 25));
    }
}
