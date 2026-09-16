import java.util.Scanner;
public class Array{
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		
		//int numbers[] = {10,20,30,40,50};
		
		//for(int i=0;i<numbers.length; i++){
		//System.out.println(numbers[i]);
		
		System.out.print("Enter Array Size: ");
		int size = scanner.nextInt();
		
		int numbers[] = new int[size];
		
		for (int i=0; i<numbers.length; i++){
			System.out.print("Enter the array:"+ (i+1) + " : ");
			numbers[i] = scanner.nextInt();
			}
		for(int k=0;k<numbers.length; k++){
		System.out.println("Arra: " + numbers[k]);
		}
	}
}

