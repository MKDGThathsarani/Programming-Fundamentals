import java.util.Scanner;
public class iFriend{
	static Scanner scanner = new Scanner(System.in);
	
	public static void main (String [] args){
		System.out.println("\t\t\t iFRIEND");
		System.out.println("Contacts Organizer");
		System.out.println("=".repeat(100));
		System.out.println("[01] Add Contacts");
		System.out.println("[02] Update Contacts");
		System.out.println("[03] Delete Contacts");
		System.out.println("[04] Search Contacts");
		System.out.println("[05] List Contacts");
		System.out.println("[06] Exit");
		System.out.println("\b");
		System.out.print("Enter an option to continue -> ");
		int option = scanner.nextInt();
		
		Switch(option){
			case 1:
				addcontacts();
				break;
			}
		
		
		}
	}
