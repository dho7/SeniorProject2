package edu.ycp.ModelClasses;

public class MergeSortDataGenerativeInfo {

	private int numElements;
	private int range;
	private int numMerges;	
	private int numSplits;
	
	public int getNumSplits() {
		return numSplits;
	}
	public void setNumSplits(int numSplits) {
		this.numSplits = numSplits;
	}

	private int size;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getNumElements() {
		return numElements;
	}
	public void setNumElements(int numElements) {
		this.numElements = numElements;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getNumMerges() {
		return numMerges;
	}
	public void setNumMerges(int numMerges) {
		this.numMerges = numMerges;
	}

	public MergeSortDataGenerativeInfo() {
		this.numElements = 0;
		this.range = 0;
		this.numMerges = 0;
		this.size = 0;
		this.numSplits = 0;
	}
}
