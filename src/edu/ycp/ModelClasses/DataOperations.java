package edu.ycp.ModelClasses;

public class DataOperations {
	
	public DataOperations() {
		
	}
	
	public int getModeEleOfSortedArray(int[] arr) {
		//find largest number to set as counts size
		int largestNumber = arr[arr.length-1];
		// compromise in memory usage vs guarantee it never goes out of bounds
		int[] counts = new int[largestNumber*arr.length];
		
		// this will help keep track of our mode element
		int maxCount = 0;
		
		int mode = -1;
		
		// each time a number shows up increment its counts index
		for(int i = 0; i < arr.length; i++) {
			counts[arr[i]]++;
			
			// set the number counted most frequently
			if(counts[arr[i]] > maxCount) {
				mode = arr[i];
				maxCount = counts[arr[i]];
			}
		}
		
		// return the number that was counted most frequently
		return mode;
	}
	
	
}
