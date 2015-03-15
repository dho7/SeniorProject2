package edu.ycp.UnitTests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.ModelClasses.Algorithms;
import edu.ycp.ModelClasses.DataGenerativeInfo;
import edu.ycp.ModelClasses.DataOperations;

public class Tests {
	int[] arr1;
	int[] arrMode;
	Algorithms algorithms;
	DataOperations dataOps;
	DataGenerativeInfo dataForArr1;
		
	@Before
	public void setUp() {
		// array 1 for bubble sort
		arr1 = new int[6];
		
		arr1[0] = 3;
		arr1[1] = 2;
		arr1[2] = 1;
		arr1[3] = 10;
		arr1[4] = 4;
		arr1[5] = 4;		
		
		arrMode = new int[]{1,2,2,3};
		
		
		// our algorithms for making music
		algorithms = new Algorithms();
		dataOps = new DataOperations();
		dataForArr1 = new DataGenerativeInfo();
		
	}

	@Test
	public void test() {		
		algorithms.BubbleSort(arr1);
		for(int i = 0; i < arr1.length-1; i++) {
			assertEquals(true, ( arr1[i+1] >= arr1[i] ));
		}		
	}
	
	@Test
	public void testModeElement() {
		int mode = dataOps.getModeEleOfSortedArray(arrMode);
		assertEquals(true, (2 == mode) );
	}
	
	@Test
	public void testBubbleSortWithGenInfo() {
		dataForArr1 = algorithms.BubbleSortWithGenInfo(arr1);
		assertEquals(true, dataForArr1.getLargestEle() == arr1[arr1.length-1]);
		assertEquals(true, dataForArr1.getSmallestEle() == arr1[0]);
		assertEquals(true, dataForArr1.getModeEle() == 4);
		assertEquals(true, dataForArr1.getMeanEle() == 4.0);
		assertEquals(true, dataForArr1.getRange() == 9);
		assertEquals(true, dataForArr1.getNumElements() == 6);		
	}
}
