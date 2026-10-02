public class LoopsPractice{
	public static void main (String args[]){
		//for loop
		System.out.println("For Loop");
		for (int i = 1; i <= 5; i++ ){
			System.out.println("i = " + i);
			}
			
		//while loop
		System.out.println();
		System.out.println("While Loop");
		int j= 1;
		while(j <= 5){
			System.out.println("j = " + j);
			j++;
			}
			
		//do-while loop
		System.out.println();
		System.out.println("do-while Loop");
		int k = 1;
		do{
			System.out.println("k = " + k);
			k++;
			}while (k <= 5);
			
		//for-each loop
		System.out.println();
		System.out.println("for-each Loop");
		int[] arr = {10,20,30};
		for (int num : arr){
			System.out.println("num = " + num);
			}
			
		//Nested loop
		System.out.println();
		System.out.println("Nested Loop");
		for (int i = 1; i <= 3; i++){
			for (int j2 = 1; j2 <= 3; j2++){
				System.out.print("* ");
				}
				System.out.println();
			}
		
		//break
		System.out.println();
		System.out.println("Break");
		for (int i = 1; i <= 10; i++){
			if (i == 5) break;
			System.out.println("break i = " + i);
			}
		
		//continue
		System.out.println();
		System.out.println("Continue");
		for (int i = 1; i <= 5; i++){
			if (i == 3) continue;
			System.out.println("continue i = " + i);
			}
		}
	}
