package edu.ycp.ModelClasses;

import java.util.ArrayList;

public class Algorithms {
	
	public Algorithms() {
		
	}
	
	public void BubbleSort(int[] arr) {

		boolean noSwaps = false;
		//if there aren't any out of order elements, don't repeat
		while(noSwaps == false) {
			//will be set false if something is out of order
			noSwaps = true;
			for(int i = 0; i < arr.length - 1; i++) {
				//compare adjacent elements
				if(arr[i] > arr[i+1]) {
					//swap
					Integer temp = 0;
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					noSwaps = false;
				}
				else {
					//nothing
				}
			}
		}
	}
	
	public DataGenerativeInfo BubbleSortWithGenInfo(int[] arr) {
		
		DataGenerativeInfo info = new DataGenerativeInfo();
		DataOperations ops = new DataOperations();
		
		int[] indexMoveCount = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			indexMoveCount[i] = 1;
		}
		
		boolean noSwaps = false;
		//if there aren't any out of order elements, don't repeat
		while(noSwaps == false) {
			//will be set false if something is out of order
			noSwaps = true;
			for(int i = 0; i < arr.length - 1; i++) {
				//compare adjacent elements
				if(arr[i] > arr[i+1]) {
					//swap
					Integer temp = 0;
					temp = arr[i];
					arr[i] = arr[i+1]; 
					arr[i+1] = temp; 
					noSwaps = false;
					indexMoveCount[i]++;
					indexMoveCount[i+1]++;
				}
				else {
					//nothing
				}
			}
		}
		
		info.setLargestEle(arr[arr.length-1]);
		info.setSmallestEle(arr[0]);
		info.setNumElements(arr.length);
		info.setModeEle(ops.getModeEleOfSortedArray(arr));
		info.setSize(arr.length);
		info.setIndexMoveCount(indexMoveCount);
		
		float meanEle = 0;
		for(int i = 0; i < arr.length; i++) {
			meanEle += arr[i];
		}
		meanEle /= arr.length;
		info.setMeanEle(meanEle);
		info.setRange(arr[arr.length-1] - arr[0]);
		
		return info;
	}
}
