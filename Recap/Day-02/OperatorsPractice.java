//Java Program - Operators Practice
public class OperatorsPractice{
	public static void main(String args[]){
		//Arithmatic Operators
		int a = 10, b =3;
		System.out.println("Addition: " + (a + b));
		System.out.println("Subtraction: " + (a - b));
		System.out.println("Multiplication: " + (a * b)); 
		System.out.println("Division: " + (a / b)); 
		System.out.println("Modulus: " + (a % b)); 
		
		// 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));  // false
        System.out.println("x || y: " + (x || y));  // true
        System.out.println("!x: " + (!x));          // false
        
        // 4. Assignment Operators
        int c = 5;
        c += 3;  // c = c + 3
        System.out.println("c += 3: " + c);  // 8
        c -= 2;  // c = c - 2
        System.out.println("c -= 2: " + c);  // 6
        
         // 5. Increment/Decrement
        int d = 5;
        System.out.println("d++: " + (d++));  // 5 (then d = 6)
        System.out.println("d: " + d);        // 6
        System.out.println("++d: " + (++d));  // 7
		}
	}
