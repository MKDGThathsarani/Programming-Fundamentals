import java.util.*;
class Q25{
	public static void main (String[] args){
		
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Enter your First Number :");
		int num1 = scanner.nextInt();
		System.out.print("Enter your Second Number :");
		int num2 = scanner.nextInt();
		System.out.print("Enter your Thired Number :");
		int num3 = scanner.nextInt();
		
		
		boolean output = ((num1 > (num2-num3))||(num1 > (num3-num2)) || (num2 > (num1-num3)) || (num2 > (num3-num1)) || (num3 > (num1 - num2)) || (num3 > (num2-num1)));
		System.out.println(output);
	
		
		scanner.close();
		}
	}
