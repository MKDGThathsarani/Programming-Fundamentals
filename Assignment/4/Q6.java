import java.util.Scanner;

class Q6{
	
	public static void main (String args []){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Year : ");
		int year = scanner.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0){
			System.out.println("This year is leap year : ");
			} else if(year % 400 == 0 ){
				System.out.println("This year is leap year");
				}else{
					System.out.println("No");
					}
   }
}	


