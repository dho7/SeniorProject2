package edu.ycp.ModelClasses;

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
		//initialize array to count passes through an index
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

		//set the info so notes can be generated
		info.setLargestEle(arr[arr.length-1]);
		info.setSmallestEle(arr[0]);
		info.setNumElements(arr.length);
		info.setModeEle(ops.getModeEleOfSortedArray(arr));
		info.setSize(arr.length);
		info.setIndexMoveCount(indexMoveCount);

		//compute mean element
		float meanEle = 0;
		for(int i = 0; i < arr.length; i++) {
			meanEle += arr[i];
		}

		meanEle /= arr.length;
		info.setMeanEle(meanEle);
		info.setRange(arr[arr.length-1] - arr[0]);

		return info;
	}

	// public merge sort method that takes array a with size n
	// and work array b with helper methods to split, merge, and copy
	public void mergeSort(int[] a, int[] b, int n) {
		topDownMergeSplit(a, 0, n, b);
	}

	private void topDownMergeSplit(int[] a,int iBegin,int iEnd, int[] b) {
		if(iEnd - iBegin < 2) {
			return;
		}

		int iMiddle = (iEnd + iBegin) / 2;
		topDownMergeSplit(a, iBegin, iMiddle, b);
		topDownMergeSplit(a, iMiddle, iEnd, b);
		topDownMerge(a, iBegin, iMiddle, iEnd, b);
		copyArray(b, iBegin, iEnd, a);
	}

	private void topDownMerge(int[] a,int iBegin,int iMiddle,int iEnd, int[] b) {
		int i0 = iBegin;
		int i1 = iMiddle;

		for(int j = iBegin; j < iEnd; j++) {
			if(i0 < iMiddle && (i1 >= iEnd || a[i0] <= a[i1])) {
				b[j] = a[i0];
				i0 = i0 + 1;
			}
			else  {
				b[j] = a[i1];
				i1 = i1 + 1;
			}
		}

	}

	private void copyArray(int[] b,int iBegin,int iEnd, int[] a) {
		for(int k = iBegin; k < iEnd; k++) {
			a[k] = b[k];
		}
	}
	
	/*
	 * three way comparison, recursive binary search
	 * returns index of key location
	 */
	public int binarySearch(int[] a, int key, int imin, int imax) {
		if(imax < imin) {
			return -1;
		}
		else {
			int imid = (imax + imin) / 2;
			
			if(a[imid] > key) {
				return binarySearch(a, key, imin, imid -1);
			}
			else if(a[imid] < key){
				return binarySearch(a, key, imid + 1, imax);
			}
			else {				
				return imid;				
			}
		}
	}

}
