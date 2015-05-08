package edu.ycp.ModelClasses;

public class BubbleSortDataGenerativeInfo {

	private int numElements;
	private int largestEle;
	private int smallestEle;
	private float meanEle;
	private int modeEle;
	private int range;
	private int[] indexMoveCount;
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int[] getIndexMoveCount() {
		return indexMoveCount;
	}

	public void setIndexMoveCount(int[] eleMoveCount) {
		this.indexMoveCount = eleMoveCount;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getNumElements() {
		return numElements;
	}

	public void setNumElements(int numElements) {
		this.numElements = numElements;
	}

	public int getLargestEle() {
		return largestEle;
	}

	public void setLargestEle(int largestEle) {
		this.largestEle = largestEle;
	}

	public int getSmallestEle() {
		return smallestEle;
	}

	public void setSmallestEle(int smallestEle) {
		this.smallestEle = smallestEle;
	}

	public float getMeanEle() {
		return meanEle;
	}

	public void setMeanEle(float meanEle) {
		this.meanEle = meanEle;
	}

	public int getModeEle() {
		return modeEle;
	}

	public void setModeEle(int modeEle) {
		this.modeEle = modeEle;
	}

	public BubbleSortDataGenerativeInfo() {
		numElements = 0;
		largestEle = 0;
		smallestEle = 0;
		meanEle = 0;
		modeEle = 0;
		range = 0;
		indexMoveCount = null;
	}
	
	public BubbleSortDataGenerativeInfo (int size) {
		numElements = 0;
		largestEle = 0;
		smallestEle = 0;
		meanEle = 0;
		modeEle = 0;
		range = 0;
		indexMoveCount = new int[size];
	}
}
