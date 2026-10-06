import java.util.Arrays;

public class ArraysPractice {
	public static void main (String[] args){
		
		//=======1D Array=======//
		System.out.println("======= 1D Array =======");
		
		//Array hadana krama 3
		int[] numbers = {10,20,30};
		String[] names = {"Amal","Kamal","Nimal"};
		
		//Values ganne
		System.out.println("Number: " + numbers[0]);
		System.out.println("Names: " + names[1]);
		
		//Length
		System.out.println("Length: " + numbers.length);
		
		//Iterate - for loop
		System.out.println("\n--For Loop--");
		for (int i = 0; i<numbers.length; i++){
			System.out.println(numbers[i]);
			}
			
		//Iterate -for-each
		System.out.println("\n--For-each Loop--");	
		for (int num : numbers){
			System.out.println(num);
			}
		
		// ===== 2D Array =====
        System.out.println("\n===== 2D Array =====");
        
        int[][] matrix = {
			{10},
			{10,20},
			{10,20,30},
			{10,20,30,40}
			};
			
		// Values ganna
		System.out.println("matrix[0][0]: " + matrix[0][0]);
        System.out.println("matrix[1][1]: " + matrix[1][1]);
        System.out.println("matrix[2][2]: " + matrix[2][2]);
		
		//Rows 
		System.out.println("\nRows: " + matrix.length);
		System.out.println("Cols: " + matrix[0].length);
		
		//Iterate - nested for
		 System.out.println("\n-- Nested for --");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        //===== Array Sort =====
        System.out.println("\n===== Array Sort =====");
        
        int[] unsorted = {50, 20, 40, 10, 30};
        System.out.println("Before: " + Arrays.toString(unsorted));
        
        Arrays.sort(unsorted);
        System.out.println("After: " + Arrays.toString(unsorted));
        
        // String array sort
        String[] unsortedNames = {"Kamal", "Nimal", "Sunil", "Amal"};
        System.out.println("\nBefore: " + Arrays.toString(unsortedNames));
        
        Arrays.sort(unsortedNames);
        System.out.println("After: " + Arrays.toString(unsortedNames));
        
        // ===== Sum & Average =====
        System.out.println("\n===== Sum & Average =====");
        
        int [] scores = {85,90,75,88,92};
        int sum = 0;
        
        for (int score : scores){
			sum += score;
			}
		double average = (double) sum / scores.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
        // ===== Max & Min =====
        System.out.println("\n===== Max & Min =====");
        
        int max = scores[0];
        int min = scores[0];
        
        for (int score : scores) {
            if (score > max) max = score;
            if (score < min) min = score;
        }
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
		}
	
	}
