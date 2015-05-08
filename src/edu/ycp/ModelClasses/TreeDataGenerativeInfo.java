package edu.ycp.ModelClasses;

public class TreeDataGenerativeInfo {
	private int numElements;
	private int range;
	private int maxValue;
	private int minValue;
	private int size;
	
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
	public int getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
	public int getMinValue() {
		return minValue;
	}
	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public TreeDataGenerativeInfo() {
		this.numElements = 0;
		this.range = 0;
		this.maxValue = 0;
		this.minValue = 0;
		this.size = 0;
	}
}
