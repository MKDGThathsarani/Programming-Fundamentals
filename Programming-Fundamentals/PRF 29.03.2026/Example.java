import java.util.*;

class Example{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
			int total = 0;
			//int userInput = input.nextInt();
			
			for(int i=0; i>=0; i++){
				System.out.println("Enter user input");
				int userInput = input.nextInt();
				
				total=total+userInput;
			
				
				if(userInput<0){
					continue;
				}
				
				
			System.out.println("Total : " + total);
		
			}
				
		}
}
		
	






