package edu.ycp.ModelClasses;

import java.util.ArrayList;

public class Algorithms {
	
	public Algorithms() {
		
	}
	
	public void BubbleSort(ArrayList<Integer> arr) {

		boolean noSwaps = false;
		//if there aren't any out of order elements, don't repeat
		while(noSwaps == false) {
			//will be set false if something is out of order
			noSwaps = true;
			for(int i = 0; i < arr.size() - 1; i++) {
				//compare adjacent elements
				if(arr.get(i) > arr.get(i+1)) {
					//swap
					Integer temp = 0;
					temp = arr.get(i);
					arr.set(i, arr.get(i+1));
					arr.set(i+1, temp);
					noSwaps = false;
				}
				else {
					//nothing
				}
			}
		}
	}
	
	public void BubbleSortWithGenInfo(ArrayList<Integer> arr) {
		boolean noSwaps = false;
		//if there aren't any out of order elements, don't repeat
		while(noSwaps == false) {
			//will be set false if something is out of order
			noSwaps = true;
			for(int i = 0; i < arr.size() - 1; i++) {
				//compare adjacent elements
				if(arr.get(i) > arr.get(i+1)) {
					//swap
					Integer temp = 0;
					temp = arr.get(i);
					arr.set(i, arr.get(i+1));
					arr.set(i+1, temp);
					noSwaps = false;
				}
				else {
					//nothing
				}
			}
		}
	}
}
