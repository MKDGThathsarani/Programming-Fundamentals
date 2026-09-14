import java.util.Scanner;

class Q1{
	
	public static void main(String [] args){
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter Your First Number : ");
		int a = scanner.nextInt();
		System.out.print("Enter Your Second Number : ");
		int b = scanner.nextInt();
		
		if(a<b){
			int add = a + b;
			System.out.println("Addition of the Two Number : " + add);
			}else{
				System.out.println();
				System.out.println("First number is leass than the second number");
		}
	}
}
