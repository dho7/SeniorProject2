package edu.ycp.UnitTests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.ModelClasses.Algorithms;
import edu.ycp.ModelClasses.DataOperations;

public class Tests {
	ArrayList<Integer> arr1;
	int[] arrMode;
	Algorithms algorithms;
	DataOperations dataOps;
		
	@Before
	public void setUp() {
		// array 1 for bubble sort
		arr1 = new ArrayList<Integer>();
		arr1.add(3);
		arr1.add(2);
		arr1.add(1);
		arr1.add(6);
		arr1.add(5);
		arr1.add(4);	
		
		arrMode = new int[]{1,2,2,3};
		
		
		// our algorithms for making music
		algorithms = new Algorithms();
		dataOps = new DataOperations();
		
	}

	@Test
	public void test() {		
		algorithms.BubbleSort(arr1);
		for(int i = 0; i < arr1.size(); i++) {
			assertEquals(true, ( i+1 == arr1.get(i) ));
		}		
	}
	
	@Test
	public void testModeElement() {
		int mode = dataOps.getModeEleOfSortedArray(arrMode);
		System.out.println(mode);
	}
}
