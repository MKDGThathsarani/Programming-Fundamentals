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
	public  static void printArray()
	}
