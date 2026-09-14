import java.io.*;
import java.util.*;

class example {
	static int max(int[] arr) {
		a
		
		return 0;
	}
	
	static int indexOf(int[] arr, int value){
		for(int i=0; i<arr.length;i++){
			if(arr[i] == value) {
				return i;
			}
		}
		return -1; // default case: no value found
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,78,6,51,2,8,39,54};
	
		System.out.println("Index of 51: " + indexOf(arr, 51));
		System.out.println("Max : " + max(arr));
    }
}
