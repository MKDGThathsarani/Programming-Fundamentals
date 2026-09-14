import java.util.*;
public class task{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		
		//Array eka hadanawa
		String[] id = new String[100];
		double[] salary = new double[100];
		int count = 0;
		
		while(true){
		System.out.print("Enter your id : ");
		String id = scanner.nextLine();
		
		System.out.print("Enter your salary : ");
		double salary = scanner.nextInt();
		scanner.nextLine();
		
		//dublicate
		boolean dublicate = false;
		for(int i=0; i < count; i++){
			if(id[i].equals(is)){
				dublicate = true;
				break;
				}
			}
			
			if (dublicate){
				System.out.println("Dublicate id");
				continue;
				}
		}
		
		
		
		
		}
	
	}
