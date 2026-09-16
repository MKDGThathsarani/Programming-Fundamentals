import java.util.Scanner;

class collatzSequence {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a starting number: ");
        int collatz = scanner.nextInt();
        int count = 0; 
        
 
 while (collatz != 1) {
      if (collatz % 2 == 0) {
                collatz = collatz / 2;
                System.out.print(collatz + " ");  
                count++;
            }
            else {  
                collatz = (collatz * 3) + 1;
                System.out.print(collatz + " ");  
                count++;
            }
            
        }
		System.out.println();
        System.out.println("Total steps: " + count);
        
        scanner.close();  
    }
}
