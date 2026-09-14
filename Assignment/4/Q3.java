import java.util.Scanner;

class Q3{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Chemistry : ");
		int C = scanner.nextInt();
		
		System.out.print("Physics : ");
		int P = scanner.nextInt();
		
		System.out.print("Combined Maths : ");
		int CM = scanner.nextInt();
		
		int avg = C+P+CM;
		
		double totalavg = avg/3.0;
		System.out.print("Average of Marks : "+ totalavg);
		
		System.out.println("");
		
		if(avg > 75){
			System.out.println("Pass");
			}else{
				System.out.println("Fail");
				}
		
		}
	
	
	
	}
