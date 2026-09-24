public class Demo{
	public static void main(String args[]){
		//1.Variables 
		int age = 22;
		double salary = 50000.00;
		String name = "Kamal";
		boolean isStudent = true;
		
		//2.Print
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		System.out.println("I Student: " + isStudent);
		
		//3.
		System.out.println("Age Type: " + ((Object)age).getClass().getSimpleName());
		}
	}
