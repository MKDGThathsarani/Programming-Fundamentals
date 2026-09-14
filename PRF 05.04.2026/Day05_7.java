class Day05_7{
	public static void methodA() {
		System.out.println("Start methodA()");
		methodB();
		System.out.println("End methodA()");
	}
	
	public static void methodB() {
		System.out.println("Start methodB()");
		
		System.out.println("End methodB()");
	}
	
	public static void main(String args[]){
		System.out.println("Start main()");
		
		methodA();
		
		System.out.println("End main()");
	}
}

