package edu.ycp.ModelClasses;

public class DataGenerativeInfo {

	int numElements;
	int largestEle;
	int smallestEle;
	float meanEle;
	int modeEle;

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

	public DataGenerativeInfo() {
		numElements = 0;
		largestEle = 0;
		smallestEle = 0;
		meanEle = 0;
		modeEle = 0;
	}
}
