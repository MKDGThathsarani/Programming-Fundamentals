//Java Program - Control Flow Practice
public class ControlFlowPractice{
	public static void main (String args[]){
		// 1.if statement
		int marks = 85;
		if(marks >= 75){
			System.out.println("Grade: A");
			}
			
		// 2.if-else statement
		int age = 20;
		if(age >= 18){
			System.out.println("Children");
			}else{
				System.out.println("Parents");
				}
				
		// 3.if-else if-else ladder
		int score = 72;
		if (score >= 75){
			System.out.println("Grade: A");
			}else if(score >= 65){
				System.out.println("Grade: B");
			}else if(score >= 55){
				System.out.println("Grade: C");
			}else if(score >= 35){
				System.out.println("Grade: S");
			}else{
				System.out.println("Grade: F");
			}
		
		// 4.switch-case Statement
		int day = 3;
		switch (day){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thuresday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			default:
				System.out.println("Week End");
			}
			
		// 5.Ternary Operator
		int num = 10;
		String result = (num % 2 == 0) ? "Even" : "Odd";
		System.out.println(num + " is " + result);
		
		// 6.Nested if
		int x= 10, y= 20;
		if(x > 0){
			if (y > 0){
				System.out.println("Both Positive");
				}
			}
		}
	}
