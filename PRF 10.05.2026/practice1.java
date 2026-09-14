class practice1 {
	static void printArray(int[] arr){
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("\b\b]");
	}

	public static void main(String[] args) {
		int[] arr = {1,5,78,6,51,2,8,39,54};
	
		printArray(arr);
		System.out.println();
			
		int max = 0;
		int maxindex = 0;
		for (int i = 0; i< arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
				arr[i] = maxindex;
				maxindex = i;
				
				}
			
			}
			printArray(arr);
			System.out.println("Max " + max);
			
			
		}
    }

