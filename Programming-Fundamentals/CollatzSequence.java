import java.util.Scanner;

class CollatzSequence{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a starting number : ");
		int collatz = scanner.nextInt();
			
			if( collatz % 2 == 0){
				int n;
				System.out.print("this is even number " );
				return;
				}else {
					int n;
					System.out.print("this is odd number ");
					return;
				}
		}
	/*	boolean running = true;
		while(running){
		    if(n == 0){
				System.out.println("")
				}
		
		}*/
		
		public static void evennum(int n){
				int even = n /2;
				System.out.print(even);
				}
			
			
		public static void oddnum(int n){
			int odd = (n * 3) + 1;
			System.out.print(odd);
	}		
			
}	
	

	
	
