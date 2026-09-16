import java.util.*;
class Question03{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	
	int A;
	int B;
	
	System.out.print("Enter Value(A): ");
	A = input.nextInt();
	System.out.print("Enter Value(B): ");
	B = input.nextInt();
	
	System.out.println();
	
	System.out.println("          " + A);
	System.out.println("+         " + B);
	System.out.println("--------------");
	System.out.println("          "+A + B);
	System.out.println("==============");
	
	input.close();
	
	}
}
