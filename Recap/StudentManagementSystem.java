import java.util.*; 	//user input ganna & ArrayList gabada karanna

//class 3k hadanawa(Student,Utils,StudentManagementSystem)kiyala
class Student{
	private String id;
	private String name;
	private int marks;
	private String grade;
		//pitathin ena method walata kelinma wens karanna ba private kiyala dammama
	
	//Constructor eka, meken data enter karanna puluwan
	public Student(String id,String name, int marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.grade = calculateGrade(marks);	//methana me thwa method ekak dala thiyenne
		}
		
	//calculate method eka(constructor eka)
	private String calculateGrade(int marks){
		if (marks >= 75) return "A";
		else if (marks >= 65) return "B";
		else if (marks >= 55) return "C";
		else if (marks >= 35) return "S";
		else return "F";
		}
		
	//getter method ekak liyanawa file private nisa pitathin kiyawanna bari nisa
	public String getId() {return id; }
	public String getName() {return name; }
	public int getMarks() {return marks; }
	public String getGrade() {return grade; }

	@Override
	public String toString(){
		return "ID: " + id + " | Name: " + name + " | Marks: " + marks + " | Grade: " + grade;
		}
	}
		
class Utils{
	public  static void printArray(int[] arr){
		System.out.print("[");
		for (int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
			if (i<arr.length -1) System.out.print(", ");
			}
			System.out.println("]");
		}	//Array eka print wena method eka
		public static boolean isPrime(int n){
			if (n <= 1) return false;
			for (int i = 2; i <= Math.sqrt(n); i++){
				if (n % i == 0) return false;
				}
				return true;
			}	//Prime number ekakda kiyala check karanawa
			public static String reverseString(String str) {
				String reversed = "";
				for (int i = str.length() - 1; i >= 0; i--) {
					reversed += str.charAt(i);
				}
				return reversed;
			}	//String eka receive karanna thamai me method eka hadanne
			public static int factorial(int n){
				if (n==0) return 1;
				return n*factorial(n-1);
				}	//methana haduwe factroial ekak eken recursion method eka call karanna use karanawa
				public static int fibonacci(int n){
					if (n == 1) return 0;
					if (n == 2) return 1;
					return fibonacci(n - 1) + fibonacci(n - 2);
					}	//me Fibonacci sequence ekak & mekath recurion ekak	
	}
	
//////////////MAIN CLASS///////////////////////	
public class StudentManagementSystem{
	static Scanner input = new Scanner (System.in);	//User gen input gannawa
	static ArrayList<Student> students = new ArrayList<>();	//students walin data save karagannawa. array size eka wenas wenawane 
	
	public static void main(String[] args){
		System.out.println("==========================================");
		System.out.println("	STUDENT MANAGEMENT SYSTEM	");
		System.out.println("==========================================");
		
		while (true){
			printMenu();
			int choise = getInput("Enter Your choise: ");
			
			switch(choice){
				case 1:
					addStudent();
					break;
				}
			}
		}
	}
